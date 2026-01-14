import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] weeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int result = 0;
        for(int i = 0; i<month;i++){
            result += days[i];
        }
        System.out.println(weeks[(day + result) % 7]);
    }
}
