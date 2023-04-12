package com.EIT.collections;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Integer> q1=new ArrayBlockingQueue<Integer>(3);
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
	
		try {
			q1.add(40);
		}catch(IllegalStateException e) {
			System.out.println("tryig to add to many items in queue");
		}
		
		for(Integer value:q1) {
			System.out.println("Queue value is "+value);
		}
		
		System.out.println("removed from queue "+q1.remove());
		System.out.println("removed from queue "+q1.remove());
		System.out.println("removed from queue "+q1.remove());
		
		try {
			System.out.println("removed from queue "+q1.remove());
		}catch(NoSuchElementException e) {
			System.out.println("tried to remove to many item in the queue");
		}

	}

}
