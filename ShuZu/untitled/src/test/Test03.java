package test;

public class Test03 {
    public static void main(String[] args) {
        int[] array = {4,45,2,1,23,65,86,47};
        int count = 0;
        for (int i = 1; i <= array.length; i++) {
            for (int j = 0; j <array.length - i; j++) {
                if (array[j] > array[j+1]){
                    int m = array[j];
                    array[j] = array[j+1];
                    array[j+1] = m;
                    count ++;
                }
            }
        }
        for (int i = 0; i <= array.length-1;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println(count);
        }
    }
