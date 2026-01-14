

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for(int n = 0; n<N; n++){
            String line = sc.nextLine();
            int[] count = new int[26];

            for(int i = 0; i < line.length(); i++){
                char c = line.charAt(i);
                if('a' <= c && c <= 'z'){
                    count[c-'a']++;
                }
            }

            int maxCountNum = -1;
            for(int i:count){
                if(i > maxCountNum){
                    maxCountNum = i;
                }
            }

            int duplicateNum = 0;
            char result  = '?';
            for(int i = 0; i<count.length; i++){
                if(count[i] == maxCountNum){
                    duplicateNum++;
                    result = (char) ('a' + i);
                }
            }

            if(duplicateNum > 1){
                System.out.println('?');
            }else {
                System.out.println(result);
            }
        }
        sc.close();
    }
}
