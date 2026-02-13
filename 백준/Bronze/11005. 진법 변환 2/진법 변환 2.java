
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        ArrayList<Character> arr = new ArrayList<>();

        while(N > 0){
            int rem = N % B;
            if (rem < 10 ){
                arr.add( (char) (rem+'0') );
            } else {
                arr.add( (char) (rem - 10 + 'A') );
            }
            N /= B;
        }

        for(int i = arr.size()-1; i >= 0;i--){
            System.out.print(arr.get(i));
        }

    }
}