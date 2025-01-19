package com.aon.herald.tasks.task2;

public class SubArrayFinder {

	public static int findSubArrayStartIndex(int[] array, int[] subArray) {
        if (array == null || subArray == null || subArray.length > array.length) return -1;

        for (int i = 0; i <= array.length - subArray.length; i++) {
            boolean match = true;
            for (int j = 0; j < subArray.length; j++) {
                if (array[i + j] != subArray[j]) {
                    match = false;
                    break;
                }
            }
            if (match) return i;
        }
        return -1;
    }

}
