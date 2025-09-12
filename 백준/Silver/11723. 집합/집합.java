import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static Set<Integer> set = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    static String one = "1\n";
    static String zero = "0\n";

    static void operate(String cmd, int num) throws IOException {
        if (cmd.equals("add")) {
            set.add(num);
        } else if (cmd.equals("remove")) {
            set.remove(num);
        } else if (cmd.equals("check")) {
            String writingVal = set.contains(num) ? one : zero;
            sb.append(writingVal);
        } else if (cmd.equals("toggle")) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

    }
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int count = Integer.parseInt(reader.readLine());
            for (int i = 0; i < count; ++i) {
                String inputLine = reader.readLine();
                StringTokenizer st = new StringTokenizer(inputLine);
                String cmd = st.nextToken();
                if (cmd.equals("all")) {
                    for (int j = 1; j <= 20; ++j) {
                        set.add(j);
                    }
                    continue;
                } else if (cmd.equals("empty")) {
                    set.clear();
                    continue;
                }
                int number = Integer.parseInt(st.nextToken());
                operate(cmd, number);
            }
            if (sb.length() > 1) {
                sb.deleteCharAt(sb.length() - 1);
            }
            writer.write(sb.toString());
            writer.flush();
        } catch (IOException e) {

        }
    }
}
