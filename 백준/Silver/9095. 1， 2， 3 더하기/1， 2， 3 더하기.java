import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int count = Integer.parseInt(reader.readLine());
            int[] dp = new int[12];
            dp[0] = 1;
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int i = 4; i <= 11; ++i) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
            for (int i = 0; i < count; ++i) {
                int num = Integer.parseInt(reader.readLine());
                writer.write(String.format("%d", dp[num]));
                if (i != count - 1) {
                    writer.write("\n");
                }
            }
            writer.flush();

        } catch (IOException e) {

        }

    }
}