import java.util.Scanner;

public class FactorialCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        int ans1 = factorialWithoutRecursion(n);
        int ans2 = factorialWithRecursion(n);

        System.out.println("Factorial of "+n+" without recursion is : "+ans1);
        System.out.println("Factorial of "+n+" with recursion is : "+ans2);
    }

    private static int factorialWithRecursion(int n) {
        if(n <= 1) return 1;

        return n * factorialWithRecursion(n-1);
    }

    private static int factorialWithoutRecursion(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }

        return fact;
    }
}
