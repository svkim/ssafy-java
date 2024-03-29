package com.util;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {10, 30, 5, 59, 90};
		
		//1. 문자열 형식으로 표현
		System.out.println(Arrays.toString(num));
		
		//2. sort
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		//3. binary search
		int key = 30;
		System.out.println(Arrays.binarySearch(num, key));
		
		//4. fill
		int[] a = new int[100];
		Arrays.fill(a, -1);
		
		//5. copy
		int[] a1 = {1, 2, 3, 4, 5};
		int[] a2 = Arrays.copyOf(a1, 3);
		int[] a3 = Arrays.copyOf(a1, 10);
		int[] a4 = Arrays.copyOfRange(a1, 2, 4);
		
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(a4));
		
		//6. equals()
		int[] b1 = {1, 2, 3};
		int[] b2 = {1, 2, 3};
		System.out.println(Arrays.equals(b1, b2));
		
		
		System.out.println();

	}

}
