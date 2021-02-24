package test;

public class Test04 {
    public static void main(String[] args) {
        int count = 0 ;
        int[] array = {4,45,2,1,23,65,86,47};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j] < array[i]) {
                    int m = array[j];
                   array[j] = array[i];
                   array[i] = m;
                   count++;
                }
            }
        }
        for (int i = 0; i <array.length; i++) {

            System.out.print(array[i]+" ");
        }
        System.out.println("\n" + count);
    }
}
