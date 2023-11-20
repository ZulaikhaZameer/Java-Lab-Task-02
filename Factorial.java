import java.util.Scanner;
public class Factorial {
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = scanner.nextInt();
        int factorial = 1;

        for(int i=1; i<=num; i++){
            factorial = factorial * i;
        }

        System.out.println("Factorial of "+ num + " : " + factorial);

        scanner.close();
    }
}
