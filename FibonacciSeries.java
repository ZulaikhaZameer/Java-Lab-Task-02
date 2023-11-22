public class FibonacciSeries {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;

        System.out.print(num1 + ", " + num2);

        while (num1 + num2 < 200) {
            int series = num1 + num2;
            System.out.print(", " + series);

            num1 = num2;
            num2 = series;
        }
    }
}
