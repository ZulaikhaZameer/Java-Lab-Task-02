import java.util.Scanner;
public class PalindromeCheck{
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scanner.nextInt();
        int originalNum = num;
        int reverseNum = 0;

        while(num != 0){
            reverseNum = (reverseNum * 10)+ (num % 10);
            num = num / 10;
        }

        if(reverseNum == originalNum){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
        scanner.close();
    }
}
