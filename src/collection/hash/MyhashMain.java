package collection.hash;

public class MyhashMain {
	public static void main(String[] args) {
		MyHashSet set = new MyHashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		System.out.println(set);
		
		boolean result = set.add(4); //중복 데이터
		System.out.println("중복 데이터 저장 결과 : " + result);
		System.out.println(set);
		
		System.out.println("중복여부 : " + set.contains(3));
		System.out.println("중복여부 : " + set.contains(99));
		
		
	}
}
