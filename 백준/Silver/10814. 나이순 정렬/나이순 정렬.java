import java.io.*;
import java.util.*;

public class Main {
    static class Sign{
        int age;
        String name;
        int index;

        Sign(int age, String name, int index){
            this.age = age;
            this.name = name;
            this.index = index;
        }

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Sign> signs = new ArrayList<>();

        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            signs.add(new Sign(age, name,i));
        }

        Collections.sort(signs, (a,b) ->{
           if(a.age != b.age){
               return a.age - b.age;
           }
           return a.index - b.index;
        });

        StringBuilder sb = new StringBuilder();
        for(Sign s : signs){
            sb.append(s.age).append(" ").append(s.name).append("\n");
        }
        System.out.print(sb);
    }
}
