import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Combination {
    private static final int ONE = 1;
    public int n;
    public int r;

    public Combination(int n, int r) {
        this.n = n;
        this.r = r;
    }

    public int getCombination() {
        if (r > n) {
            return 0;
        }
        if (r == n || r == 0) {
            return 1;
        }
        r = Math.min(r, n - r);
        long numerator = 1;
        long denominator = 1;

        for (int i = 0; i < r; i++) {
            numerator *= (n - i); // n, n-1, ..., n-r+1
            denominator *= (i + 1); // r, r-1, ..., 1
        }
        int result = (int) (numerator / denominator);
        return result;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        Combination[] combinations = new Combination[count];
        for (int i = 0; i < count; ++i) {
            int[] argss = new int[2];
            String[] strings = br.readLine().split(" ");
            argss[0] = Integer.parseInt(strings[0]);
            argss[1] = Integer.parseInt(strings[1]);
            combinations[i] = new Combination(argss[1], argss[0]);
        }
        for (int i = 0; i < count; ++i) {
            bw.write(String.format("%d\n", combinations[i].getCombination()));
        }
        br.close();
        bw.close();
    }
}