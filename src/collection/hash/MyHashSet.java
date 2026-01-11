package collection.hash;

import java.util.Arrays;

public class MyHashSet {
	
	//set 자료구조
	//List : 순서유지,중복허용,인덱스접근 >>> 순서가 중요하거나 중복된 요소 허용해야하는경우
	//ex : 티겟팅시스템
	//set : 유일성 >> 중복된 요소가 존재하지 X set 추가 이미존재하는값이면 무시
	// 		순서 보장X 입력(1 2 3 4 5) <> 출력( 2 3 4 5 1)
	//      빠른검색 : 내부값을 빠르게 파악할수있음
	//     중복을 허용하지 않고 요소의 유무만 중요한 경우
	//ex : 회원아이디집합, 고유한항목
	
	private int[] elemnetData = new int[10];
	private int size = 0;
	
	//set 값을 추가하는방법
	public boolean add(int value) {
		if (contains(value)) {
			return false;
		}
		elemnetData[size] = value;
		size++;
		return true;
	}
	//set 안에 동일한 자료가 있는지 파악
	boolean contains(int value) {
		for (int data : elemnetData) {
			if (data == value) {
				return true;
			}
		}
		return false;
	}
	
	public int getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		return "MyHashSet{" +
				"elemnetData=" + Arrays.toString(Arrays.copyOf(elemnetData, size)) +
				", size=" + size +
				'}';
	}
}
