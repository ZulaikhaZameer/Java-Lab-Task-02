public class LogicCircuit {
    public static void main(String ar[]) {
        int a = 1;
        int b = 0;
        int c = 1;
        int d = 1;

        if (a == 1 && b == 1) {
            if ((a == 1 && b == 1) || c == 1) {
                if (d != 1) {
                    if ((d == 1 || c == 1)) {
                        System.out.println("Output value: true");
                    }
                }
            }
        } else {
            System.out.println("Output value: false");
        }
    }
}