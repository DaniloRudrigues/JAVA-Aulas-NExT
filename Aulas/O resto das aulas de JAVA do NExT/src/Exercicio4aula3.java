import java.util.Scanner;

public class Exercicio4aula3 { 
    public static void main(String[] args){
        Scanner scam = new Scanner(System.in);
        int n = scam.nextInt();
        int[] fib = new int[n];
        fib[0] = 1;
        System.out.println(fib[0]);
        fib[1] = 1;
        System.out.println(fib[1]);
        for(int c=2;c<n;c++){
            fib[c] = fib[c-1] + fib[c-2];
            System.out.println(fib[c]);
        }
        scam.close();
    }
}
