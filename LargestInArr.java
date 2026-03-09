import java.util.*;

public class LargestInArr {

    public static int Largest_In_Arr(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int largest = Largest_In_Arr(arr);
        System.out.println("The largest number in array is : "+largest);
    }
}
