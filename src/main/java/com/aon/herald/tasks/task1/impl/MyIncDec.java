package com.aon.herald.tasks.task1.impl;

import com.aon.herald.tasks.task1.InDec;

public class MyIncDec implements InDec {

	private int count = 0;

	public MyIncDec(int count) {
		this.count = count;
	}

	@Override
	public void increment() {
		this.count++;
	}

	@Override
	public void decrement() {
		this.count--;
	}

}
