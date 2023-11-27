import java.util.Scanner;
public class Triangles {
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first angle of the triangle:");
        int angle1 = scanner.nextInt();
        System.out.println("Enter second angle of the triangle:");
        int angle2 = scanner.nextInt();
        System.out.println("Enter third angle of the triangle:");
        int angle3 = scanner.nextInt();

        if(angle1 == 90 || angle2 == 90 || angle3 == 90){
            System.out.println("The triangle is right triangle");
        }
        else if(angle1 > 90 || angle2 > 90 || angle3 > 90){
            System.out.println("The triangle is obtuse triangle");
        }
        else if(angle1 < 90 || angle2 < 90 || angle3 < 90){
            System.out.println("The triangle is acute triangle");
        }
        scanner.close();
    }
}
