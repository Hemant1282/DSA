public class BinarySearch {
    //To apply binary search the array must be sorted
    public static int Binary_Search(int arr[], int target){
        int first = 0;
        int last = arr.length-1;
        while(first < last){
            int mid = (first + last)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                first = mid + 1;
            }
            else{
                last = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int index = Binary_Search(arr, 5);
        System.out.println("The index of the target element is "+index);
    }
}
