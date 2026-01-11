package collection.hash;

public class StringHash {
	
	// a % 10 = ??????
	static final int CAPACITY = 10;
	
	public static void main(String[] args) {
		
		//char
		
		char charA = 'A';
		char charB = 'B';
		//hashCode
		System.out.println("hashCode(A) = "  + hashCode("A"));
		System.out.println("hashCode(B) = "  + hashCode("B"));
		System.out.println("hashCode(AB) = "  + hashCode("AB"));
		//hashIndex
		System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
		System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
		System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
	}
 
	static int hashCode(String str) {
		char[] charArray = str.toCharArray();
		int sum = 0;
		for (char c : charArray) {
			sum+= c;
		}
		return sum;
	}
	
	//위에서 만들어진 숫자를 해시코드
	
	
	
	static int hashIndex(int value) {
		return value % CAPACITY;
	}
	
	

}
