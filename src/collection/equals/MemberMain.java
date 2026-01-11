package collection.equals;

public class MemberMain {

    public static void main(String[] args) {
        Member member1 = new Member("idA");
        Member member2 = new Member("idB");
        
        System.out.println("member1 == member2 = " + (member1 == member2));
        System.out.println("member1 equls member2 = " + member1.equals(member2));
    }
}
