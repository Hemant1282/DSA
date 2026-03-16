public class RemDupStrings {

    public static void Rem_Dup_Strings(String str,int i,boolean[] map,StringBuilder sb){
        //base case
        if(i == str.length()){
            System.out.println(sb);
            return;
        }
        //main logic
        if(map[str.charAt(i)-'a'] != true){
            map[str.charAt(i)-'a'] = true;
            Rem_Dup_Strings(str, i + 1, map, sb.append(str.charAt(i)));
        }
        else{
            Rem_Dup_Strings(str, i+1, map, sb);
        }
        

    }
    public static void main(String[] args) {
        String str = "programming";
        boolean map[] = new boolean[256];
        Rem_Dup_Strings(str, 0, map, new StringBuilder(""));
    }

}
