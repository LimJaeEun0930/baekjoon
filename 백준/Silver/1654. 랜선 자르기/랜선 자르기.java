import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선 개수
            int k = Integer.parseInt(st.nextToken()); // 필요한 랜선 개수

            int[] ropes = new int[n];
            long max = 0;
            for (int i = 0; i < n; i++) {
                ropes[i] = Integer.parseInt(reader.readLine());
                max = Math.max(max, ropes[i]);
            }

            long low = 1;
            long high = max;
            long answer = 0;

            while (low <= high) {
                long mid = (low + high) / 2;

                // mid 길이로 잘라봤을 때 몇 개 나오는지 계산
                long pieces = 0;
                for (int rope : ropes) {
                    pieces += rope / mid;
                }

                if (pieces >= k) {
                    // 충분히 많이 잘렸으면 길이를 더 늘려본다
                    answer = mid;
                    low = mid + 1;
                } else {
                    // 부족하면 길이를 줄여야 한다
                    high = mid - 1;
                }
            }

            writer.write(String.valueOf(answer));
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
