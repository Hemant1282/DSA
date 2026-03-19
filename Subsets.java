public class Subsets {

    public static void Find_Subsets(String str,String sb,int i){
        //base-case
        if(i == str.length()){
            System.out.println(sb);
            return;
        }
            //include
            Find_Subsets(str, sb+(str.charAt(i)),i+1);
            Find_Subsets(str, sb,i+1);
    }
    public static void main(String[] args) {
        Find_Subsets("abc", new String(), 0);
    }
}
