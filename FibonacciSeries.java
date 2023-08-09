public class FibonacciSeries {
    public static void main(String[] args) {
        withoutRecursion(5);
        withRecursion(0, 1, 5);
    }

    static void withoutRecursion(int n){
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++){
            System.out.println(a);

            int c = a + b;
            a = b;
            b = c;
        }
    }

    static void withRecursion(int a, int b, int n){
        if(n == 0)
            return;

        int c = a + b;
        System.out.println(a);
        withRecursion(b, c, n-1);
    }
}
