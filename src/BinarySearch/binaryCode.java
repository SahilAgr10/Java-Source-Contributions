package BinarySearch;

public class binaryCode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,9};
        int target = 4;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]< target) start = mid+1;
            else end = mid-1;
        } return end;
    }
}
