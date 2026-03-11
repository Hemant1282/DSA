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

    //counting sort
    public static void Count_Sort(int arr[]){
        int largest = LargestInArr.Largest_In_Arr(arr);
        int count[] = new int[largest+1];

        for(int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i = 0;i<count.length;i++){
            if(count[i]>0){
                while(count[i]>0){
                    arr[j] = i;
                    count[i]--;
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3};
        Count_Sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
