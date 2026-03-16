public class SingleNumber{

    public static int Single_Number(int arr[]){
        int res = 0;
        for(int i = 0;i<arr.length;i++){
            res = res ^ arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}