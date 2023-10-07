package LinearSearch;

public class isEven {
    public static void main(String[] args) {
        int[] arr = {1,5,567,12356,765,3};
        System.out.println(evenDigits(arr));
    }
    static int evenDigits(int[] arr){
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(even(arr[i])){
                count = count +1;
            }
        }
        return count;
    }
    static boolean even(int num){
        return noOfDigits(num)%2==0;
    }

    private static int noOfDigits(int num) {
//        int count = 0;
//
//        while(num>0){
//            count++;
//            num=num/10;
//        }
//        return count;
        return (int)Math.log10(num)+1;
    }
}
