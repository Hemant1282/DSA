public class StringCompression{

    public static String String_Compression(String str){
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            sb.append(str.charAt(i));
            while (i != str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            if(count > 1){
                sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = String_Compression("aaabbbbcccd");
        System.out.println(str);
    }   
}
