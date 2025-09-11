import java.io.*;

public class Main {
    public static long factorial(long n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(reader.readLine());
            writer.write(String.format("%d",factorial(n)));
            writer.flush();
        } catch (IOException e) {

        }
    }
}
