import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = sc.nextInt();

        if(checkPalindrome(num)){
            System.out.println("It is a palindrome number!");
        }
        else System.out.println("It is not a palindrome number!");
    }

    static boolean checkPalindrome(int num){
        int rev = 0;

        int temp = num;
        while(temp > 0){
            int rem = temp % 10;
            rev = (rev * 10) + rem;

            temp /= 10;
        }

        return num == rev;
    }
}
