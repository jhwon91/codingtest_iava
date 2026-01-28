
import java.io.*;
import java.util.*;

public class Main {
    static class Point{
        int x;
        int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Point> points = new ArrayList<>();
        for(int i = 0; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new Point(x,y));
        }

        Collections.sort(points,(a,b)-> {
           if(a.x != b.x){
               return a.x - b.x;
           }
           return a.y - b.y;
        });

        StringBuilder sb = new StringBuilder();
        for(Point p : points){
            sb.append(p.x).append(" ").append(p.y).append("\n");
        }
        System.out.print(sb);

    }
}
