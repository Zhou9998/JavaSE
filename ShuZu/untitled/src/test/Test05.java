package test;

public class Test05 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Test05.ErFenFa(array, 7) == -1?"没有该元素":("该元素下标为"+Test05.ErFenFa(array, 7)));
    }

    public static int ErFenFa(int[] array, int i) {
        int begin = 0;
        int end = array.length - 1;
        while(begin <= end){
            int mid = (begin + end)/2;
            if (array[mid] == i){
                return mid;
            }else if (array[mid] < i){
                begin = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
