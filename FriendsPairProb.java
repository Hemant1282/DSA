public class FriendsPairProb {

    public static int Friends_PairProb(int n){
        //base case
        if(n == 1 || n == 2){
            return n;
        }

        //main logic
        int singleways = Friends_PairProb(n-1);

        int pairways = (n-1) * Friends_PairProb(n-2);

        return singleways + pairways;
    }
    public static void main(String[] args) {
        
    }
}