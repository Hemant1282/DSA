import java.util.Scanner;
public class LinearSearch{

    public static int Linear_search(int arr[],int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int m = sc.nextInt();
        int arr[] = new int[m];

        //fill values in array
        for(int i = 0;i<m;i++){
            System.out.println("Enter value for index "+i+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target to find : ");
        int target = sc.nextInt();
        int index = Linear_search(arr, target);
        if(index != -1){
            System.out.println("The given target is at index "+target);
        }
        else{
            System.out.println("Element not found");
        }
    }    
}
