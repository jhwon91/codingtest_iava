package doit.chap02;
import java.util.*;

public class MaxOfArrayRan {
    static int maxOf(int[] a){
        int max = a[0];

        for(int i = 1; i<a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
       Random rn = new Random();
       System.out.println("키의 최댓값을 구합니다.");

       int num =  rn.nextInt(10);
       int[] height = new int[num];
       System.out.println("사람 수 : " + num );
       for(int i = 0; i<height.length;i++){
           height[i] = 100 + rn.nextInt(90);
           System.out.println("height["+i+"] : " + height[i]);
       }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");


    }
}
