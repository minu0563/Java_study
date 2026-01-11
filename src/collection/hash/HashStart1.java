package collection.hash;

import java.util.Arrays;

public class HashStart1 {
	// 해시 알고리즘 >> 데이터
	//
	
	public static void main(String[] args) {
		Integer[] inputArray = new Integer[4];
		
		inputArray[0] = 1;
		inputArray[1] = 2;
		inputArray[2] = 5;
		inputArray[3] = 8;
		
		System.out.println("inputArray" + Arrays.toString(inputArray));
		
		int searchValue = 8;
		
		for (int value : inputArray) {
			if(value == searchValue) {
				System.out.println(value + " 가 배열 안에 있습니다");
			}
		}
	}
	
}
