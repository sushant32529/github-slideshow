import java.util.Scanner;

public class fibonacciMemoization {
    static int f[]=new int[100];
    public static int fib(int n)
    {

        if ( n <= 1 ) {
            return n;
        }
        if(f[n] != -1){
            return f[n];
        }
        f[n]=fib(n-1) + fib(n-2);
        return f[n];
    }

    public static void main(String[] args) {
        for(int i=0 ; i < 100 ; i++){
            f[i] = -1;
        }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
}
