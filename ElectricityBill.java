import java.util.Scanner;
public class ElectricityBill {
    public static void main(String ar[]) {
        System.out.println("Enter the units consumed: ");
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        int amount = 0;
        
        if(units <= 100){
            amount = units * 5;
        } else if(units <= 200){
            amount = (100 * 5) + ((units - 100) * 10);
        } else if(units <= 300){
            amount = (100 * 5) + (100 * 10) + ((units - 200) * 15);
        } else{
            amount = (100 * 5) + (100 * 10) + (100 * 15) + ((units - 300) * 20);
        }

        int ptvCharges = amount * (int)0.02;
        int meterCharges = 2000;
        int totalBill = amount + ptvCharges + meterCharges;

        System.out.println("Meter No. 123 12345 1234567U");
        System.out.println("Name: Zulaikha Zameer");
        System.out.println("Total Bill: Rs "+ totalBill);

        scanner.close();
    }
}
