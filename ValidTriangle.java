import java.util.Scanner;
public class ValidTriangle{
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first angle of the triangle:");
        int angle1 = scanner.nextInt();
        System.out.println("Enter second angle of the triangle:");
        int angle2 = scanner.nextInt();
        System.out.println("Enter third angle of the triangle:");
        int angle3 = scanner.nextInt();

        if(angle1 + angle2 + angle3 == 180){
            System.out.println("The triangle is valid triangle.");
        }
        else{
            System.out.println("The triangle is not a valid triangle.");
        }
        scanner.close();
    }
}
