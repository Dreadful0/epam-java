package com.epam.lab8.task4.model.entities;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumOfElementsFJ {

	private int[] data;
	private int numOfThreads;
	
	public SumOfElementsFJ(int[] data, int numOfThreads) {
		this.data = data;
		this.numOfThreads = numOfThreads;
	}

	public long getSum(){
		ForkJoinPool pool = new ForkJoinPool(numOfThreads);
		return pool.invoke(new SumOfRange(0, data.length));
	}

	private class SumOfRange extends RecursiveTask<Long>{

		private int from;
		private int to;
		
		private SumOfRange(int from, int to) {
			this.from = from;
			this.to = to;
		}

		@Override
		protected Long compute() {
			if((to-from) < 20){
				return calculate(from, to);
			} else {
				int mid = (from + to)/2;
				SumOfRange firstHalf = new SumOfRange(from, mid);
				firstHalf.fork();
				long result = calculate(mid, to);
				return result+firstHalf.join();
			}
		}
		
		private Long calculate(int from, int to){
			long result = 0;
			for (int i = from; i < to; i++) {
				result += data[i];
			}
			return result;
		}
	}
	
}
