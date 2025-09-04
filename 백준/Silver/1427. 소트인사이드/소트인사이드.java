import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    private static final Map<Byte, Byte> map = new HashMap<>(10);

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String input = reader.readLine();
            int inputLength = input.length();
            for (int i = 0; i < inputLength; ++i) {
                char keyNumber = input.charAt(i);
                byte key = Byte.parseByte(String.valueOf(keyNumber));
                if (map.containsKey(key)) {
                    map.put(key, (byte) (map.get(key) + 1));
                } else {
                    map.put(key, (byte) 1);
                }
            }
            StringBuilder sb = new StringBuilder(inputLength);
            for (int i = 9; i >= 0; --i) {
                Byte count = map.get((byte) i);
                if (Objects.nonNull(count)) {
                    for (Byte j = 0; j < count; ++j) {
                        sb.append(i);
                    }
                }
            }
            writer.write(sb.toString());
            writer.flush();
        } catch (IOException e) {

        }
    }

}