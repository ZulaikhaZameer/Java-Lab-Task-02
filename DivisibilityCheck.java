import java.util.Scanner;
public class DivisibilityCheck{
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number:");
        int num = scanner.nextInt();

        if((num % 5 == 0) && (num % 11 == 0)){
            System.out.println("The number is divisible by 5 and 11");
        }
        else{
            System.out.println("The number is not divisible by 5 and 11");
        }

        scanner.close();
    }
}

