public class PrimeNumber {
    public static void main(String[] args) {
        primeNumber(22);
    }

    static void primeNumber(int n){
        int cnt = 0;
        for(int i = 2; i * i < n; i++){
            if(n % i == 0) cnt++;
        }

        if(cnt > 0) System.out.println("It's not a prime number!");
        else System.out.println("It's a prime number!");
    }
}
