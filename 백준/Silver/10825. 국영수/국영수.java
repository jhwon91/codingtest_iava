import java.util.*;
import java.io.*;

public class Main {
    static class Student{
        String name;
        int a,b,c;

        Student(String name, int a, int b, int c){
            this.name = name;
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Student> students = new ArrayList<>();

        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            students.add(new Student(name, a, b, c));
        }

        Collections.sort(students, (x,y) ->{
            if(x.a != y.a){
                return y.a - x.a;
            }

            if(x.b != y.b){
                return x.b - y.b;
            }

            if(x.c != y.c){
                return y.c - x.c;
            }
            return x.name.compareTo(y.name);
        });

        StringBuilder sb = new StringBuilder();
        for(Student s : students){
            sb.append(s.name).append("\n");
        }

        System.out.print(sb);
    }
}
