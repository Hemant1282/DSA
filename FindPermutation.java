public class FindPermutation {

    public static void Find_Permutation(String str,String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //main logic
        for(int i = 0;i<str.length();i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            Find_Permutation(newstr, ans+curr);
            
        }
    }
    public static void main(String[] args) {
        Find_Permutation("abc", new String());
    }
}
