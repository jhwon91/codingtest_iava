import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String T = br.readLine();

        for(int i = 0; i<T.length(); i+=10){
            System.out.println(T.substring(i,Math.min(i+10, T.length())));
        }
    }
}
