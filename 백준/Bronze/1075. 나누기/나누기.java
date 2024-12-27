import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int f = Integer.parseInt(bf.readLine());
        int integer = n / 100 * 100;

        for (int i = 0; i < 100; ++i) {
            if ((integer + i) % f == 0) {
                System.out.printf("%02d", i);
                return;
            }
        }

    }
}