public class Recursion {

    //factorial number
    public static int fact(int n){
        //base case
        if(n == 1){
            return 1;
        }
        //main logic
        return n * fact(n-1);
    }


    //fibonacci series
    public static int fib(int n){
        //base case
        if(n == 1){
            return 0;
        }   
        if(n == 2){
            return 1;
        }
        //main logic
        return fib(n-1) + fib(n-2);
    }

    //find the last occurrence of an element in an array
    public static int findlastoccur(int arr[],int target,int i){
        //base case 
        if(i == arr.length){
            return -1;
        }
        //main logic
        int isfound = findlastoccur(arr, target, i+1);
        if(isfound == -1 && arr[i] == target){
            return i;
        }
        return isfound;
        
    }


    //brute force
    public static int xtopown(int x,int n){
        //base case
        if(n == 1){
            return x;
        }
        //main logic
        return x * xtopown(x, n-1);
    }

    //optimized power
    public static int optimized_pow(int x,int n){
        //base case
        if(n == 0){
            return 1;
        }
        //main logic
        int res = optimized_pow(x, n/2) * optimized_pow(x, n/2);
        if(n%2 == 1){
            res = res * x;
            return res;
        }
        return res;
    }


    public static void main(String[] args) {
        int ans = optimized_pow(2, 3);
        System.out.println(ans);
    }

}
