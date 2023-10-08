package BinarySearch;

public class orderAgnosticsearch {
    public static void main(String[] args) {
        int[] arr1 = {9,8,7,6,5,4,3,2,1};
        int[] arr = {1,2,3,4,5,6,7,9};
        int target = 4;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==target) return mid;

            if(isAsc){
                if(arr[mid]< target) start = mid+1;
                else end = mid-1;
            }
            else{
                if(arr[mid]< target) end = mid-1;
                else start = mid+1;
            }

        } return -1;
    }
}
