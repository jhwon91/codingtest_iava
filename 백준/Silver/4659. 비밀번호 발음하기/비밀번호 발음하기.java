
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String word = sc.nextLine();
            if(word.equals("end")){
                break;
            }

            if(isAcceptable(word)){
                System.out.println("<"+word+"> is acceptable.");
            }else{
                System.out.println("<"+word+"> is not acceptable.");
            }
        }
        sc.close();
    }

    static boolean isAcceptable(String password){
        // 조건 1: 모음(a,e,i,o,u) 하나를 반드시 포함
        boolean hasVowel = false;
        for(int i = 0; i<password.length();i++){
            if(isVowel(password.charAt(i))){
                hasVowel = true;
                break;
            }
        }
        if(!hasVowel) return false;

        // 조건 2: 모음이 3개 혹은 자음이 3개 연속으로 오면 안됨
        int count = 1;
        boolean vowel = isVowel(password.charAt(0));;
        for(int i = 1; i<password.length();i++){
            if(isVowel(password.charAt(i)) == vowel){
                count++;
                if(count >= 3){
                    return false;
                }
            }else{
                count = 1;
                vowel = isVowel(password.charAt(i));
            }
        }

        // 조건 3: 같은 글자가 연속 두번 (ee, oo 제외)
        for(int i = 0; i<password.length()-1;i++){
            if(password.charAt(i) == password.charAt(i+1)){
                char c = password.charAt(i);
                if(c != 'e' && c != 'o'){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isVowel(char c){
        return "aeiou".indexOf(c) >= 0;
    }
}
