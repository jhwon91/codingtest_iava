import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int line = Arrays.stream(br.readLine().split(""))
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.print(line);
    }
}
