import java.util.Scanner;
public class Percentage{
    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks obtained in CP: ");
        int marks1 = scanner.nextInt();
        System.out.println("Enter marks obtained in DLD: ");
        int marks2 = scanner.nextInt();
        System.out.println("Enter marks obtained in IS: ");
        int marks3 = scanner.nextInt();
        System.out.println("Enter marks obtained in PS: ");
        int marks4 = scanner.nextInt();
        System.out.println("Enter marks obtained in CS: ");
        int marks5 = scanner.nextInt();
        System.out.println("Enter marks obtained in LAAG: ");
        int marks6 = scanner.nextInt();

        int obtMarks = marks1 + marks2 + marks3 + marks4 + marks5 + marks6;
        System.out.println("Obtained Marks: "+ obtMarks);

        float percentage = ((float)obtMarks / 450) * 100;
        System.out.println("Percentage: "+percentage+"%");

        if(percentage >= 85){
            System.out.println("Grade: A+");
        }
        else if(percentage >=80 && percentage <85){
            System.out.println("Grade: A");
        }
        else if(percentage >=75 && percentage <80){
            System.out.println("Grade: B+");
        }
        else if(percentage >=70 && percentage <75){
            System.out.println("Grade: B");
        }
        else if(percentage >=65 && percentage <70){
            System.out.println("Grade: C+");
        }
        else if(percentage >=60 && percentage <65){
            System.out.println("Grade: C");
        }
        else if(percentage >=55 && percentage <60){
            System.out.println("Grade: D+");
        }
        else if(percentage >=50 && percentage <55){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F2");
        }

        scanner.close();
    }
}