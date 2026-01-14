
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] T = new String[5];

        for(int i = 0; i<T.length; i++){
            T[i] = sc.nextLine();
        }

        int maxLength = 0;
        for (String s : T) {
            if(s.length() > maxLength){
                maxLength = s.length();
            }
        }

        StringBuilder result = new StringBuilder();
        for(int col = 0; col < maxLength; col++){
            for(int row = 0; row < T.length; row++){
                if(col < T[row].length()){
                    result.append(T[row].charAt(col));
                }
            }
        }

        System.out.print(result);

        sc.close();
    }
}
