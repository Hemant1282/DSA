public class Substrings {

    public static String Sub_Strings(String str,int si,int ei){
        StringBuilder sb = new StringBuilder();
        for(int i = si;i<ei;i++){
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String ans = Sub_Strings("Hemant",0,3);
        System.out.println(ans);
    }
}
