import java.util.Scanner;
public class PrintAverage {
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times you want to enter numbers?");
        int n = scanner.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++){
            System.out.println("Enter number "+ (i)+ ":");
            int num = scanner.nextInt();
            sum = sum + num;
        }
        float avg = (float) sum/n;
        System.out.println("Average: " + avg);
        scanner.close();
    }
}
