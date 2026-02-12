
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> queue = new ArrayDeque<>();

        for(int i = 1 ; i<=N; i++){
            queue.addLast(i);
        }

        while(!queue.isEmpty()){
            for(int i = 0 ; i<K-1; i++){
                queue.addLast(queue.removeFirst());
            }
            sb.append(queue.removeFirst()).append(", ");
        }

        sb.delete(sb.length()-2, sb.length());
        sb.append(">");
        System.out.print(sb);
    }
}