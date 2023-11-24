import java.util.Scanner;
public class NumGenerator{
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i <= 100; i++) {
            System.out.print(i);

            if (i < 100) {
                System.out.print(", ");
            }
            if (i % 10 == 0 && i < 100) {
                System.out.println("\nPress Enter to Continue.........");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
