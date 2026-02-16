import java.io.*;
import java.util.*;

public class Main {
    static int map[][];
    static boolean check[][];
    static int count;
    static int N;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ArrayList<Integer> result = new ArrayList<>();
        map = new int[N][N];
        check = new boolean[N][N];

        for(int i = 0; i<N; i++){
            String[] arr = br.readLine().split("");
            for(int j =0 ;j<N; j++){
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }

        for(int i =0;i <N; i++){
            for(int j =0; j<N; j++){
                if(map[i][j] == 1 && !check[i][j]){
                    count = 0;
                    check[i][j] = true;
                    dfs(i,j);
                    result.add(count);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int r :result){
            System.out.println(r);
        }
    }
    static void dfs(int y , int x){
        int[] dy = {0, 1, 0, -1};
        int[] dx = {1, 0, -1, 0};
        count++;
        for(int i = 0 ; i< 4;i++){
            int nextY = y + dy[i];
            int nextX = x + dx[i];
            if(0<= nextY && nextY < N && 0<= nextX && nextX <N){
                if(map[nextY][nextX] == 1 && !check[nextY][nextX]){
                    check[nextY][nextX] = true;
                    dfs(nextY,nextX);
                }
            }
        }
    }
}