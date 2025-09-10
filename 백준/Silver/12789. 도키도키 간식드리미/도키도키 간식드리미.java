import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            Stack<Integer> stack = new Stack<>();
            int expectedNum = 1;
            int inputCount = Integer.parseInt(reader.readLine());
            int[] numArr = new int[inputCount];
            String secondLine = reader.readLine();
            StringTokenizer st = new StringTokenizer(secondLine);
            int i = 0;
            while (i < inputCount) {
                numArr[i++] = Integer.parseInt(st.nextToken());
            }
            int j = 0;
            while(j < inputCount || stack.size() > 0) {
                if (j < inputCount && expectedNum == numArr[j]) {
                    ++expectedNum;
                    ++j;
                } else if (!stack.empty() && stack.peek().equals(expectedNum)) {
                    stack.pop();
                    ++expectedNum;
                } else if (j >= inputCount && stack.peek() != expectedNum) {
                    break;
                } else if (!stack.empty() && !stack.peek().equals(expectedNum)) {
                    stack.push(numArr[j]);
                    ++j;
                } else if (stack.empty()) {
                    stack.push(numArr[j]);
                    ++j;
                }

            }
            if (inputCount != (expectedNum - 1)) {
                writer.write("Sad");
            } else {
                writer.write("Nice");
            }
            writer.flush();

        } catch (IOException e) {

        }
    }
}
