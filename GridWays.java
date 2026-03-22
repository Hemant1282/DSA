public class GridWays {

    public static int Grid_Ways(int row,int col,int rows,int cols){
        //base case 
        if(row == rows-1 && col == cols-1){
            return 1;
        }
        else if(row == rows || col == cols){
            return 0;
        }
        //main logic
        int way1 = Grid_Ways(row+1,col,rows,cols);
        int way2 = Grid_Ways(row, col+1, rows, cols);
        return way1 + way2;
    }

    //Optimized linear time solution
    public static int Opt_Grid_Ways(int rows,int cols){
        int numerator = fact((rows-1)+(cols-1));
        int denominator = fact(rows-1) * fact(cols-1);

        return numerator/denominator;
    }
    
    public static int fact(int n){
        int ans = 1;
        for(int i = n;i>=1;i--){
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans1 = Grid_Ways(0, 0, 4, 5);
        int ans = Opt_Grid_Ways(4, 5);
        System.out.println(ans1);
        System.out.println(ans);
    }   
}
