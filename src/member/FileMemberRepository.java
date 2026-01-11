package member;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileMemberRepository implements MemberRepository {

    private static final String FIIL_NAME = "temp/member_txt.dat";
    private static final String DELMITER = ",";

    @Override
    public void add(Member member) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(
                FIIL_NAME, StandardCharsets.UTF_8, true));
            bw.write(member.getId() + DELMITER + member.getName() + DELMITER + member.getAge());
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Member> findAll() {
        List<Member> members = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(
                new FileReader(FIIL_NAME, StandardCharsets.UTF_8));
            String line;
            while ((line = br.readLine()) != null) {
                String[] memberData = line.split(",");
                members.add(new Member(memberData[0], memberData[1], Integer.valueOf(memberData[2]))); 
            }
            return members;
		} catch (FileNotFoundException e){
			return new ArrayList<>();
		} catch (IOException e){
			throw new RuntimeException(e);
		}
    }
}
