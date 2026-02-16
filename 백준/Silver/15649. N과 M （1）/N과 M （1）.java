import java.io.*;
import java.util.*;

public class Main {
    static int M;
    static int N;
    static boolean[] visited;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        result = new int[M];

        recur(0);

        System.out.print(sb);
    }

    static void recur(int depth){
        if(depth == M){
            for(int i = 0 ;i<M;i++){
                sb.append(result[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = 1; i<=N;i++){
            if(visited[i] == false){
                visited[i] = true;
                result[depth] = i;
                recur(depth+1);
                visited[i] = false;
            }
        }
    }
}