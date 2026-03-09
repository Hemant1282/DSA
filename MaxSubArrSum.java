public class MaxSubArrSum {

    public static int MaxSubArr_Sum(int arr[]){
        //prefix array fromation
        int prefix_arr[] = new int[arr.length];
        prefix_arr[0] = arr[0];

        for(int i = 1;i<arr.length;i++){
            prefix_arr[i] = arr[i] + prefix_arr[i-1];
        }

        //main loop
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int sum = i == 0? arr[j] : arr[j]-arr[i-1]; 
                max = Math.max(max,sum);
            }
        }
        return max;
    }
    public static void main(String[] args){

    }
}
