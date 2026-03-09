public class KadanesAlgo {

    public static int Kadanes_Algo(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i = 0;i<arr.length;i++){
            currsum += arr[i];
            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(maxsum,currsum);
        }
        return maxsum;
    }
    public static void main(String args[]){

    }
}
