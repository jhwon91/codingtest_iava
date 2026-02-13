
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();

        int mod = S.length() % 3;
        if (mod == 1) {
            S = "00" + S;
        } else if (mod == 2) {
            S = "0" + S;
        }

        for (int i = 0; i < S.length(); i = i + 3) {
            int first = (S.charAt(i) - '0') * 4;
            int second = (S.charAt(i + 1) - '0') * 2;
            int third = S.charAt(i + 2) - '0';
            sb.append(first + second + third);
        }

        System.out.print(sb);
    }
}