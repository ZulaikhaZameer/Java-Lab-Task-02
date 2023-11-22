import java.util.Scanner;
public class LargeSmallNum {
    public static void main(String ar[]) {
        System.out.println("Enter four numbers");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        if(num1 > num2){
            if(num1 > num3){
                if(num1 > num4){
                    System.out.println(num1 + " is largest number");
                }else{
                    System.out.println(num4 + " is the larget number");
                }
            }else{
                if(num3 > num4){
                    System.out.println(num3 + " is the largest number");
                }else{
                    System.out.println(num4 + " is the larget number");
                }
            }
        }else{
            if(num2 > num3){
                if(num2 > num4){
                    System.out.println(num2 + " is the largest number");
                }else{
                    System.out.println(num4 + " is the largest number");
                }
            }else{
                if(num3 > num4){
                    System.out.println(num3 + " is the largest number");
                }else{
                    System.out.println(num4 + " is the largest number");
                }
            }
        }

        if(num1 < num2){
            if(num1 < num3) {
                if(num1 < num4){
                    System.out.println(num1 + " is the smallest number");
                }else{
                    System.out.println(num4 + " is the smallest number");
                }
            }else{
                if(num3 < num4) {
                    System.out.println(num3 + " is the smallest number");
                }else{
                    System.out.println(num4 + " is the smallest number");
                }
            }
        }else{
            if(num2 < num3) {
                if(num2 < num4) {
                    System.out.println(num2 + " is the smallest number");
                }else{
                    System.out.println(num4 + " is the smallest number");
                }
            }else{
                if(num3 < num4) {
                    System.out.println(num3 + " is the smallest number");
                }else{
                    System.out.println(num4 + " is the smallest number");
                }
            }
        }
        

        scanner.close();
    }
}
