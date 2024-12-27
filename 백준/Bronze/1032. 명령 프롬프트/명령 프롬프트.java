import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        String[] inputs = new String[count];
        while (--count >= 0) {
            inputs[count] = bf.readLine();
        }
        byte[] diffIndexes = new byte[inputs[0].length()];
        for (int i = 0; i < inputs[0].length(); ++i) {
            char ch = inputs[0].charAt(i);
            for (String s : inputs) {
                char ch2 = s.charAt(i);
                if (ch != ch2) {
                    diffIndexes[i] = 1;
                }
                ch = ch2;
            }
        }

        StringBuilder sb = new StringBuilder(inputs[0].length());
        for (int i = 0; i < inputs[0].length(); ++i) {
            if (diffIndexes[i] == 1) {
                sb.append('?');
            } else {
                sb.append(inputs[0].charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}