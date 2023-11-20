import java.util.Scanner;
public class Calculator {
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter 2nd number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter Operator:");
        char op = scanner.next().charAt(0);

        if(op == '+'){
            System.out.println("Addition: "+ (num1 + num2));
        }
        else if(op == '-'){
            System.out.println("Subtraction: "+ (num1 - num2));
        }
        else if(op == '*'){
            System.out.println("Multiplication: "+ (num1 * num2));
        }
        else if(op == '/'){
            System.out.println("Division: "+ (num1 / num2));
        }

        scanner.close();
    }
}
