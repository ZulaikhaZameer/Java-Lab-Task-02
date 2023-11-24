import java.util.Scanner;;
public class OddSequence{
    public static void main(String ar[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();

        for(int i=1; i<=(num * 3);){
           if ((i % 2) != 0){
            System.out.print("-"+ i + ", ");
           }
           else{
            System.out.print(i + ", ");
           }
           i = i + 3;
        }

        scanner.close();
    }
}

