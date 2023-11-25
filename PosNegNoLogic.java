import java.util.Scanner;

public class PosNegNoLogic {
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("The entered number is positive");
        } 
        else{
            if(num < 0){
                System.out.println("The entered number is negative");
            }
            else {
                System.out.println("The number is zero");
            }
        }

        scanner.close();
    }
}