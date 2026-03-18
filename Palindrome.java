import java.util.Scanner;

public class Palindrome{

    public static boolean Check_Palindrome(int num){
        //original number
        int org_num = num;

        int reverse = 0;
        while(num > 0){
            int lastdigit = num%10;
            reverse = reverse * 10 + lastdigit;
            num = num / 10;
        }

        if(org_num == reverse){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        //input number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        if(Check_Palindrome(a)){
            System.out.println("The given number is palindrome.");
        }
        else{
            System.out.println("The given number is not a palindrome.");
        }
        sc.close();
    }
}


