import java.util.Scanner;
public class PrimeNum {
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = scanner.nextInt();
        
        boolean isPrime = true;

        for (int i = 2; i * i <= num; i++) {
            for (int j = num; j >= 1; j--) {
                if ((i * j) == num) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) {
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

        scanner.close();
    }
}

