import java.io.*;
import java.util.*;

public class Main {
    public static boolean isPrime(int num){
        if(num<2)return false;
        for(int i = 2; i<num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        for(int i = 0; i<t; i++){
            if(isPrime(Integer.parseInt(st.nextToken()))) {
               count++;
            }
        }

        System.out.println(count);
    }
}