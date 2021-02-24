package Test;

import java.lang.reflect.Array;
import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        int[] a = {-1,-1,-1,-1,-1};
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i]= random.nextInt(7);
            while(true){
                int l = 0;
                for (int j = 0; j < i; j++) {//i=1;
                    if (a[j] == a[i]){
                        a[i]=random.nextInt(7);
                        break;
                    }
                    l++;
                }
                if (l==i){
                    break;
                }
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }
    }
}
