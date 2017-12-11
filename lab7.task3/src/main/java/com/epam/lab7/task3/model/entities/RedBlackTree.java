package com.epam.lab7.task3.model.entities;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class RedBlackTree<T extends Comparable<T>> implements Iterable<T> {

	private Node root;

	public RedBlackTree() {
	}

	public void put(T data) {

		root = put(root, data);
		root.color = Color.Black;

	}

	private Node put(Node node, T data) {
		if (node == null)
			return new Node(data, Color.Red, 1);

		int cmp = data.compareTo(node.data);
		if (cmp < 0)
			node.left = put(node.left, data);
		else if (cmp > 0)
			node.right = put(node.right, data);
		else
			node.data = data;

		// fixing
		if (isRed(node.right) && isRed(node.right.right))
			node = rotateLeft(node);
		if (isRed(node.left) && isRed(node.left.left))
			node = rotateRight(node);
		if (isRed(node.left) && isRed(node.right))
			flipColors(node);
		node.size = size(node.left) + size(node.right) + 1;

		return node;
	}

	private int size(Node node) {
		if (node == null)
			return 0;
		return node.size;
	}

	private boolean isRed(Node node) {
		if (node == null)
			return false;
		return node.color == Color.Red;
	}

	private boolean isBlack(Node node) {
		if (node == null)
			return false;
		return node.color == Color.Black;
	}

	private boolean contains(T val) {
		Node current = root;
		while (current != null) {
			int cmp = val.compareTo(current.data);
			if (cmp < 0)
				current = current.left;
			else if (cmp > 0)
				current = current.right;
			else
				return true;
		}
		return false;
	}

	public void delete(T val) {
		if (val == null)
			throw new IllegalArgumentException("argument to delete() is null");
		if (!contains(val))
			return;

		if (!isRed(root.left) && !isRed(root.right))
			root.color = Color.Red;

		root = delete(root, val);
		if (root != null)
			root.color = Color.Black;
	}

	private Node delete(Node node, T val) {
		if (val.compareTo(node.data) < 0) {
			if (!isRed(node.left) && !isRed(node.left.left))
				node = moveRedLeft(node);
			node.left = delete(node.left, val);
		} else {
			if (isRed(node.left))
				node = rotateRight(node);
			if (val.compareTo(node.data) == 0 && (node.right == null))
				return null;
			if (!isRed(node.right) && !isRed(node.right.left))
				node = moveRedRight(node);
			if (val.compareTo(node.data) == 0) {
				Node temp = min(node.right);
				node.data = temp.data;
				node.right = deleteMin(node.right);
			} else
				node.right = delete(node.right, val);
		}
		return balance(node);
	}

	private Node deleteMin(Node node) {
		if (node.left == null)
			return null;

		if (!isRed(node.left) && !isRed(node.left.left))
			node = moveRedLeft(node);

		node.left = deleteMin(node.left);
		return balance(node);
	}

	private Node min(Node node) {
		if (node.left == null)
			return node;
		else
			return min(node.left);
	}

	// make a left-leaning link lean to the right
	private Node rotateRight(Node node) {
		Node temp = node.left;
		node.left = temp.right;
		temp.right = node;
		temp.color = temp.right.color;
		temp.right.color = Color.Red;
		temp.size = node.size;
		node.size = size(node.left) + size(node.right) + 1;
		return temp;
	}

	// make a right-leaning link lean to the left
	private Node rotateLeft(Node node) {
		Node temp = node.right;
		node.right = temp.left;
		temp.left = node;
		temp.color = temp.left.color;
		temp.left.color = Color.Red;
		temp.size = node.size;
		node.size = size(node.left) + size(node.right) + 1;
		return temp;
	}

	// flip the colors of a node and its two children
	private void flipColors(Node node) {
		node.color = getOppositeColor(node.color);
		node.left.color = getOppositeColor(node.left.color);
		node.right.color = getOppositeColor(node.right.color);
	}

	private Color getOppositeColor(Color color) {
		if (color == Color.Black)
			return Color.Red;
		else
			return Color.Black;
	}

	// Assuming that node is red and both node.left and node.left.left
	// are black, make node.left or one of its children red.
	private Node moveRedLeft(Node node) {
		flipColors(node);
		if (isRed(node.right.left)) {
			node.right = rotateRight(node.right);
			node = rotateLeft(node);
			flipColors(node);
		}
		return node;
	}

	// Assuming that node is red and both node.right and node.right.left
	// are black, make node.right or one of its children red.
	private Node moveRedRight(Node node) {
		flipColors(node);
		if (isRed(node.left.left)) {
			node = rotateRight(node);
			flipColors(node);
		}
		return node;
	}

	// restore red-black tree invariant
	private Node balance(Node node) {
		if (isRed(node.right))
			node = rotateLeft(node);
		if (isRed(node.left) && isRed(node.left.left))
			node = rotateRight(node);
		if (isRed(node.left) && isRed(node.right))
			flipColors(node);

		node.size = size(node.left) + size(node.right) + 1;
		return node;
	}

	private enum Color {
		Red, Black;
	}

	private class Node {
		private T data;
		private Node left;
		private Node right;
		private Color color = Color.Black;
		private int size;

		public Node(T data, Color color, int size) {
			this.data = data;
			this.color = color;
			this.size = size;
		}

	}

	public class TreeVisualizer {

		public void drawInConsole() {
			draw(root, 0, '>');
		}

		private void draw(Node node, int shift, char leftRight) {
			if (node != null) {
				draw(node.right, shift + 1, '/');

				StringBuilder str = new StringBuilder();
				for (int i = 0; i < shift; i++) {
					str.append("          ");
				}
				str.append("" + leftRight + "--" + node.data + "("
						+ node.color.name() + ")");
				System.out.println(str);

				draw(node.left, shift + 1, '\\');
			}
		}

	}

	public Iterator<T> iterator() {
		return new Iterator<T>() {

			private Queue<Node> queue = new LinkedList<>();
			{
				if (root != null)
					queue.add(root);
			}

			public boolean hasNext() {
				return !queue.isEmpty();
			}

			public T next() {
				Node current = queue.poll();
				if (current == null)
					throw new NoSuchElementException();
				if (current.left != null)
					queue.add(current.left);
				if (current.right != null)
					queue.add(current.right);
				return current.data;
			}
		};
	}

}
