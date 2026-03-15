public class BitOperation {

    public static void Bit_Operation(int num){
        int lsb = num & 1;
        if(lsb == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }

    public static int get_ith_bit(int num,int i){
        int bitmask = (1<<i);
        if((num & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int set_ith_bit(int num,int i){
        int bitmask = 1<<i;
        return num | bitmask;
    }

    public static int clear_ith_bit(int num,int i){
        int bitmask = ~(1<<i);
        return num & bitmask;
    }

    public static void update_ith_bit(int num,int i,int target){
        if(target == 0){
            clear_ith_bit(num, i);
        }
        else{
            set_ith_bit(num, i);
        }
    }

    public static int clear_ibits(int num,int i){
        int bitmask = ((~1)<<(i-1));
        return num & bitmask;
    }

    public static int clear_rangeofBits(int num,int i,int j){
        int a = (~0 << (j + 1));
        int b = (1<<i)-1;
        int bitmask = a | b;
        return num & bitmask;
    }

    public static int fast_Exp(int num,int pow){
        int ans = 1;
        while(pow > 0){
            if((pow & 1) != 0){
                ans = ans * num;
            }
            num = num * num;
            pow = pow >> 1;
        }
        return ans;
    }

    //remove last set bit
    public static int remove_last_set_bit(int num){
        return num & (num - 1);
    }

    public static void main(String[] args) {
        
    }
}
