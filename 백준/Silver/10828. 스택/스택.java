
import java.util.*;
import java.io.*;

public class Main {
    static class IntStack{
        private int[] stack;
        private int top = -1;

        IntStack(int size){
            stack = new int[size];
        }

        void push(int v){
            stack[++top] = v;
        }

        int pop(){
            if(top < 0){
                return -1;
            }
            return stack[top--];
        }

        int size(){
            return top + 1;
        }

        int empty(){
            return top < 0 ? 1:0;
        }

        int top(){
            if(top < 0){
                return -1;
            }
            return stack[top];
        }



    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        IntStack stack = new IntStack(N);

        for(int i = 0; i<N; i++){
            String cmd = br.readLine();

            if(cmd.startsWith("push")){
                stack.push(Integer.parseInt(cmd.split(" ")[1]));
            }else if(cmd.equals("pop")){
                sb.append(stack.pop()).append("\n");
            }else if(cmd.equals("size")){
                sb.append(stack.size()).append("\n");
            }else if(cmd.equals("empty")){
                sb.append(stack.empty()).append("\n");
            }else if(cmd.equals("top")){
                sb.append(stack.top()).append("\n");
            }
        }

        System.out.print(sb);
    }
}
