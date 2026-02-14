import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();

        for(int i = 0; i <S.length(); i++){
            int num = S.charAt(i) - '0';
            String bin = Integer.toBinaryString(num);
            if(i == 0){
                sb.append(bin);
            } else {
                String padded = "000" + bin;
                sb.append(padded.substring(padded.length() - 3));
            }
        }
        System.out.println(sb);
    }
}