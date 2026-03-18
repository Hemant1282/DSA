public class TillingProblem {

    public static int Tilling_Problem(int n){
        //base case
        if(n == 1 || n == 2){
            return n;
        }
        //main logic
        int verticalways = Tilling_Problem(n-1);
        int horizontalways = Tilling_Problem(n-2);

        return verticalways + horizontalways;
    }
    public static void main(String[] args) {
        
    }
}
