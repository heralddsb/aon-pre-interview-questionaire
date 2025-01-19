package com.aon.herald.tasks.task1.impl;

import com.aon.herald.tasks.task1.InDec;

public class TimedIncDec implements InDec{

	private InDec delegate;

	public TimedIncDec(InDec delegate) {
		this.delegate = delegate;
	}

	@Override
	public void increment() {
		long startTime = System.currentTimeMillis();
		delegate.increment();
		long endTime = System.currentTimeMillis();
        System.out.println("increment() took " + (endTime - startTime) + " ms");
	}

	@Override
	public void decrement() {
		long startTime = System.currentTimeMillis();
        delegate.decrement();
        long endTime = System.currentTimeMillis();
        System.out.println("decrement() took " + (endTime - startTime) + " ms");
	}

}
