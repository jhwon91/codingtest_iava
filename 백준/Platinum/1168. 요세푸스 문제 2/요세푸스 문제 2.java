
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 1; i<=N; i++){
            arr.add(i);
        }


        int idx = 0;
        for(int i = 0; i<N;i++){
            idx = (idx + K - 1) % arr.size();
            sb.append(arr.remove(idx));
            if(i< N -1){
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.print(sb);

    }
}