
import java.util.*;
import java.io.*;

public class Main {
    public static int gcm(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int GCM = gcm(A,B);
        int LCM = (A * B) / GCM;
        System.out.println(GCM);
        System.out.println(LCM);
    }
}