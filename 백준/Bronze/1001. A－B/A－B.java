import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        String[] strings = input.split(" ");
        int num1 = Integer.parseInt(strings[0]);
        int num2 = Integer.parseInt(strings[1]);
        System.out.println(num1 - num2);

    }
}