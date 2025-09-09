import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static LinkedList<Integer> queue = new LinkedList<>();

    public static void rotateRight() {
        Integer lastE = queue.removeLast();
        queue.addFirst(lastE);
    }

    public static void rotateLeft() {
        Integer firstE = queue.removeFirst();
        queue.addLast(firstE);
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String firstLine = reader.readLine();
            int[] firstLineNums = new int[2];
            int emptyIndex = firstLine.indexOf(" ");

            firstLineNums[0] = Integer.parseInt(firstLine.substring(0, emptyIndex));
            for (int i = 1; i <= firstLineNums[0]; ++i) {
                queue.add(i);
            }

            firstLineNums[1] = Integer.parseInt(firstLine.substring(emptyIndex + 1));
            int[] targetNums = new int[firstLineNums[1]];

            String secondLine = reader.readLine();
            int i = 0;
            StringTokenizer st = new StringTokenizer(secondLine);
            while (st.hasMoreTokens()) {
                targetNums[i++] = Integer.parseInt(st.nextToken());
            }
            int sum = 0;
            for (int n : targetNums) {
                int left = queue.indexOf(n);
                int right = queue.size() - queue.indexOf(n);
                if (left < right) {
                    sum += left;
                    while (left-- > 0) {
                        rotateLeft();
                    }
                    queue.pollFirst();
                } else {
                    sum += right;
                    while (right-- > 0) {
                        rotateRight();
                    }
                    queue.pollFirst();
                }
            }
            writer.write(String.format("%d", sum));
            writer.flush();
        } catch (IOException e) {

        }

    }
}
