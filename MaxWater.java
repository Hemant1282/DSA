public class MaxWater {

    public static int Max_Water(int height[]){
        int first = 0;
        int last = height.length-1;
        int max_water = 0;
        while(first < last){
            int smaller_bar = Math.min(height[first],height[last]);
            int dist = last - first;
            int curr_water = smaller_bar * dist;
            max_water = Math.max(curr_water,max_water);

            if(height[first] <= height[last]){
                first ++;
            }
            else{
                last--;
            }
        }
        return max_water;
    }
    public static void main(String[] args) {
        
    }
}
