package com.aon.herald.tasks.task2;

public class SubArrayFinderTest {

	public static void main(String[] args) {
		int[] param1 = {4,9,3,7,8};
		int[] param2 = {3,7};

		int result = SubArrayFinder.findSubArrayStartIndex(param1, param2);
		System.out.println("findSubArrayStartIndex : "+result);
	}

}
