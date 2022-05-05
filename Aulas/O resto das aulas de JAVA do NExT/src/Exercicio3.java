import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner scam = new Scanner(System.in);
        int var = scam.nextInt();
        long resp = 1;
        for(int i = 1; i <= var;i++){
            resp *= i;
        }
        System.out.println(resp);
        scam.close();
    }
}
