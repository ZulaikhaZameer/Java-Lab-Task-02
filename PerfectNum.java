import java.util.Scanner;;
public class PerfectNum{
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();
        int sum = 0;

        for(int i=1; i<=num; i++){
            for(int j=num; j>=1; j--){
                if((i*j) == num){
                    sum = sum + i;
                }
            }
        }
        if(sum == (num * 2)){
            System.out.println(num + " is a perfect number");
        }
        else{
            System.out.println(num + " is not a perfect number");
        }

        scanner.close();
    }
}
