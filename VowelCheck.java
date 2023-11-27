import java.util.Scanner;
public class VowelCheck {
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = scanner.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if(ch>='a' && ch<='z'){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.println("You entered a vowel");
            }
            else{
                System.out.println("You entered a consonant");
            }
        }
    
        scanner.close();
    }
}
