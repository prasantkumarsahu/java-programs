import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word :");
        String str = sc.next();

        if(checkPalindrome(str)){
            System.out.println("It is a palindrome string!");
        }
        else System.out.println("It is not a palindrome string!");
    }

    private static boolean checkPalindrome(String str) {
        int i = 0;
        int j = str.length()-1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
