public class RotatedSortedArr {
    
    //without recursion
    public static int Rotated_Sorted_Arr(int arr[],int target){
        int low = 0;
        int high = arr.length-1;
        while(low < high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                return mid;
            }

            //check left sorted
            else if(arr[low] <= arr[mid]){
                if(arr[low] <= target && arr[mid] > target){
                    high = mid -1 ;
                }
                else {
                    low = mid + 1;
                }
            }
            else{
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    //using recursion
    public static int Rotated_SortArr(int arr[],int target,int si,int ei){
        //base case
        if(si > ei){
            return -1;
        }

        //main logic
        int mid = si + (ei - si)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            if (arr[si] <= target && arr[mid] > target) {
                Rotated_SortArr(arr, target, si, mid);
            } else {
                Rotated_SortArr(arr, target, mid+1, ei)
            }
        }
        else{
            if(arr[mid]<=target && target <= arr[ei]){
                return Rotated_SortArr(arr, target, mid + 1, ei);
            }
            else{
                return Rotated_SortArr(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
