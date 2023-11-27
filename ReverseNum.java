import java.util.Scanner;
public class ReverseNum{
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scanner.nextInt();
        int reverseNum = 0;

        while(num != 0){
            reverseNum = (reverseNum * 10)+ (num % 10);
            num = num / 10;
        }

        System.out.print("Reverse number is: "+ reverseNum);
        scanner.close();
    }
}
