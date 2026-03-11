public class Sorting {

    //Bubble sort
    public static void BubbleSort(int arr[]){
        for(int i = 0; i< arr.length;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //Selection sort
    public static void Selection_sort(int arr[]){
        for(int i = 0;i<arr.length;i++){
            int minpos = i;
            for(int j = i + 1;j<arr.length;j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    //insertion sort
    public static void InsertionSort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int prev = i - 1;
            int curr_el = arr[i];
            while(prev>=0 && curr_el < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr_el;

        }
    }
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3};
        BubbleSort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
