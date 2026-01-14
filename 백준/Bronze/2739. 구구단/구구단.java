
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int i = 1 ; i<=9; i++){
            sb.append(String.format("%d * %d = %d",t,i,t*i)).append("\n");
        }
        System.out.print(sb);
    }
}
