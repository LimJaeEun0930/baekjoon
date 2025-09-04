import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))){
            int count = Integer.parseInt(reader.readLine());
            int result = count;
            Stack<Character> charList;

            while (count-- > 0) {
                String str = reader.readLine();
                int strLength = str.length();
                charList = new Stack<>();
                //연속된 자모(alphabet)는 ok. 그후 다른 자모가 오면 안됨
                for (int i = 0; i < strLength; ++i) {
                    char c = str.charAt(i);
                    //큐에 존재하지 않는 요소라면 저장. 큐에 존재하면서 peek인 요소라면 무시. 큐에 존재하면서 peek가 아닌 요소라면 결과값 감소
                    if (!charList.contains(c)) {
                        charList.add(str.charAt(i));
                    } else {
                        if (charList.size() > 0 && charList.peek().equals(c)) {
                            continue;
                        } else {
                            result--;
                            break;
                        }
                    }
                }
            }
            writer.write(String.valueOf(result));
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}