package LinearSearch;
import java.util.*;
public class RowColumnMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,8,10},{12,15,25}};
        int target = 123;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr, int target){
        int row =0;
        int col = arr.length-1;
        while (row<arr.length && col>0){
            if(arr[row][col]==target) return new int[]{row,col};
            else if(arr[row][col]< target) row ++;
            else col--;
        }
        return new int[] {-1,-1};
    }
}
