public class TrappingRainwater {


    public static int Trapping_Rainwater(int height[]){
        //Left max array
        int left_max[] = new int[height.length];
        left_max[0] = height[0];
        for(int i = 1;i<height.length;i++){
            left_max[i] = Math.max(left_max[i-1],height[i]);
        }

        ///Right max array
        int right_max[] = new int[height.length];
        right_max[height.length-1] = height[height.length-1];
        for(int i = height.length-2;i>=0;i--){
            right_max[i] = Math.max(right_max[i+1],height[i]);
        }

        int sum = 0;
        for(int i = 0;i<height.length;i++){
            int small_bar = Math.min(left_max[i],right_max[i]);
            int bar_height = height[i];
            int trapped_water = small_bar-bar_height;
            sum+= trapped_water;
        }

        return sum;
    }
    public static void main(String args[]){
        int arr[] = {4,2,0,6,3,2,5};
        int ans = Trapping_Rainwater(arr);
        System.out.println(ans);
    } 
}
