

import java.io.*;
import java.util.*;

public class Main {

    static Long gcm(Long a, Long b){
        while(b!=0){
            Long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());
        Long G = gcm(A,B);
        for(int i = 0;i<G;i++){
            sb.append("1");
        }

        System.out.print(sb);
    }
}