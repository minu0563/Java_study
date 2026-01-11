package collection.hash;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
	
	static final int CAPACITY = 10;
	
	public static void main(String[] args) {
		//1 ,2 ,5 ,8, 14 ,99, 9
		
		LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
		for (int i = 0; i < CAPACITY; i++) {
			buckets[i] = new LinkedList<>();
		}
		
		add(buckets, 1);
	}
	
	private static void add(LinkedList<Integer>[] buckets, int value) {
		int hashIndex = hashIndex(value);
		LinkedList<Integer> bucket = buckets[hashIndex];
		if (!bucket.contains(value)) {
			bucket.add(value);
		}
	}
	
	private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
		int hashIndex = hashIndex(searchValue);
		LinkedList<Integer> bucket = buckets[hashIndex];
		return bucket.contains(searchValue);
	}
	
	static int hashIndex(int value) {
		return value % CAPACITY;
	}
	
}
