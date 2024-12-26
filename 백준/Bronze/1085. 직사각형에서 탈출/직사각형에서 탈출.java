import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        String[] strings = input.split(" ");
        int[] points = new int[strings.length];
        for (int i = 0; i < strings.length; ++i) {
            points[i] = Integer.parseInt(strings[i]);
        }
        int min = Math.min(Math.min(points[2] - points[0], points[0]), Math.min(points[3] - points[1], points[1]));
        System.out.println(min);
    }
}