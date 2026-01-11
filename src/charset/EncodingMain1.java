package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class EncodingMain1 {
    
    /*
        utf-8  >>>> 현대의 사실상 표준 인코딩 기술
    */

    private static final Charset EUC_KR = Charset.forName("EUC-KR");
    public static void main(String[] args) {
        encoding("A", EUC_KR);
        encoding("A", StandardCharsets.UTF_8);
    }

    // 문자를 >> 컴퓨터가 이해할수 있는 숫자(byte)로 변경하는것을 문자 인코딩이라고 함
    private static void encoding(String text, Charset charset) {
        byte[] bytes = text.getBytes(charset);

        System.out.printf("%s -> [%s] 인코딩 -> %s %sbyte\n", text, charset, Arrays.toString(bytes), bytes.length);
    }
}
