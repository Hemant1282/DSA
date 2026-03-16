public class TillingProblem {

    public static int TillingProblem(int n){
        //base case
        if(n == 1 || n == 2){
            return n;
        }
        //main logic
        int verticalways = TillingProblem(n-1);
        int horizontalways = TillingProblem(n-2);

        return verticalways + horizontalways;
    }
    public static void main(String[] args) {
        
    }
}
