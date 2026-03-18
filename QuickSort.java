public class QuickSort {

    public static void Quick_Sort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //main logic
        int pidx = Partition(arr,si,ei);
        Quick_Sort(arr, si, pidx-1);
        Quick_Sort(arr, pidx+1, ei);
    }

    public static int Partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j = si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {7,4,3,2,1};
        Quick_Sort(arr, 0,arr.length-1);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }   
}
