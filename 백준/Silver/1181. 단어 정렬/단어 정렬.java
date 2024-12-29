import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        TreeSet<String> set = new TreeSet<>((a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length()); // 길이 기준
            }
            return a.compareTo(b); // 사전순 기준
        });

        for (int i = 0; i < count; i++) {
            set.add(br.readLine()); // 중복 제거와 동시에 정렬
        }

        // 출력
        for (String s : set) {
            bw.write(s);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
