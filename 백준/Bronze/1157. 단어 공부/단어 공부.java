
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = word.toLowerCase();
        int[] count = new int[26];

        for(int i = 0; i<word.length();i++){
            count[word.charAt(i) - 'a']++;
        }

        int maxCount = 0;
        for(int i: count){
            if(i > maxCount){
                maxCount = i;
            }
        }

        int maxCountNum = 0;
        char result = '?';
        for(int i = 0; i<count.length; i++){
            if(count[i] == maxCount){
                maxCountNum++;
                result =(char) ('a'+i);
            }
        }

        if(maxCountNum > 1){
            System.out.print("?");
        }else{
            System.out.print(String.valueOf(result).toUpperCase());
        }
    }
}
