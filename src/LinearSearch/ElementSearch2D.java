package LinearSearch;
import java.util.*;
public class ElementSearch2D {
    public static void main(String[] args) {
        int[][] arr ={ {1,2,3,5,6,7,9},{12,23,76,58,34},{123,543,789,345}};
        int target = 123;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;i++){
                if(arr[i][j]==target) return new int[] {i,j};
            }
        }return new int[] {-1,-1};

    }
}
