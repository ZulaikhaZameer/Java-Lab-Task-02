import java.util.Scanner;
public class CharType{
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = scanner.next().charAt(0);
        
        if(ch>='a' && ch<='z'){
            System.out.println("You entered a small letter");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("You entered a capital letter");
        }
        else{
            System.out.println("You entered a special character");
        }

        scanner.close();
    }
}