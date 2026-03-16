public class BinaryStrings {

    public static void Binary_Strings(int n,String sb,int lastplaced){
        //base case
        if(n == 0){
            System.out.println(sb);
            return;
        }
        //main logic    
        Binary_Strings(n-1, sb + "0", 0);
        if(lastplaced == 0){
            Binary_Strings(n-1, sb+("1"), 1);
        }
    }
    public static void main(String[] args) {
        Binary_Strings(3, new String(), 0);
    }
}
