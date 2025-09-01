import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out)))
        {
            int targetCount = Integer.parseInt(reader.readLine());
            Set<Integer> targetIntegerSet = new HashSet(targetCount);
            String targetArrString = reader.readLine();
            StringTokenizer tokenizer = new StringTokenizer(targetArrString);
            while (tokenizer.hasMoreTokens()) {
                String intAsString = tokenizer.nextToken();
                int parsedInt = Integer.parseInt(intAsString);
                targetIntegerSet.add(parsedInt);
            }
            int havingCount = Integer.parseInt(reader.readLine());
            String havingArrString = reader.readLine();
            tokenizer = new StringTokenizer(havingArrString);
            while (tokenizer.hasMoreTokens()) {
                String intAsString = tokenizer.nextToken();
                if (targetIntegerSet.contains(Integer.parseInt(intAsString))) {
                    writer.write("1");
                } else {
                    writer.write("0");
                }
                if (tokenizer.hasMoreTokens()) {
                    writer.write(" ");
                }
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}