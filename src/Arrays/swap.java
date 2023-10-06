package Arrays;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int first  = 0;
        int last = arr.length-1;
        while (first<last){
            swapp(arr,first,last);
            first++;
            last--;
        }
    }
    static void swapp(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last]=temp;
    }
}
