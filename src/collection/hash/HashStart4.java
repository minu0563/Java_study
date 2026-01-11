package collection.hash;

import java.util.Arrays;

public class HashStart4 {
	//배열 의 크기(CAPACITY) = 10
	//나머지 연산 %
		/*
		1 % 10 = 1
		2 % 10 = 2
		5 % 10 = 5
		8 % 10 = 8
		14 % 10 = 4   몫  10
		99 % 10 = 9	  몫 9
		
		89 % 10 = 9   목 8   해시충돌
		
		
		해시인덱스
		
		
		 */
	
	static final int CAPACITY = 10;
	
	public static void main(String[] args) {
		System.out.println("hashIndex(1) = " + hashIndex(1));
		System.out.println("hashIndex(2) = " + hashIndex(2));
		System.out.println("hashIndex(5) = " + hashIndex(5));
		System.out.println("hashIndex(8) = " + hashIndex(8));
		System.out.println("hashIndex(14) = " + hashIndex(14));
		System.out.println("hashIndex(99) = " + hashIndex(99));
	
		Integer[] inputArray = new Integer[CAPACITY];
		add(inputArray, 1);
		add(inputArray, 2);
		add(inputArray, 5);
		add(inputArray, 8);
		add(inputArray, 14);
		add(inputArray, 99);
		System.out.println("inputArray = " + Arrays.toString(inputArray));
		
		//검색
		int searchValue = 14;
		int hashIndex = hashIndex(searchValue);
		System.out.println("searchValue = " + hashIndex);
		Integer result = inputArray[hashIndex];
		System.out.println(result);
		
	}
	private static void add(Integer[] inputArray, int value) {
		int hashIndex = hashIndex(value);
		inputArray[hashIndex(hashIndex)] = value;
	}
	
	static int hashIndex(int value) {
		return value % CAPACITY;
	}
	
}
