import java.util.Scanner;
public class LastDigit {
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = scanner.nextInt();

        int lastNum = num % 10;
        if(lastNum == 0){
            System.out.println("Last digit is Zero!");
        }
        else if(lastNum == 1){
            System.out.println("Last digit is One!");
        }
        else if(lastNum == 2){
            System.out.println("Last digit is Two!");
        }
        else if(lastNum == 3){
            System.out.println("Last digit is Three!");
        }
        else if(lastNum == 4){
            System.out.println("Last digit is Four!");
        }
        else if(lastNum == 5){
            System.out.println("Last digit is Five!");
        }
        else if(lastNum == 6){
            System.out.println("Last digit is Six!");
        }
        else if(lastNum == 7){
            System.out.println("Last digit is Seven!");
        }
        else if(lastNum == 8){
            System.out.println("Last digit is Eight!");
        }
        else if(lastNum == 9){
            System.out.println("Last digit is Nine!");
        }

        scanner.close();
    }
}
