import java.util.Scanner;;
public class Factors {
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();
        System.out.println("Factors of "+ num + " are:");

        for(int i=1; i<=num; i++){
            for(int j=num; j>=1; j--){
                if((i*j) == num){
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
