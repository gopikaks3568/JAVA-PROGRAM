import java.util.Scanner;

class exceptionTest {
    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero is not possible");
        } else {
            System.out.println("Result = " + a / b);
        }
    }

    public static void main(String args[]) {
        int x, y;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of x and y");
            x = sc.nextInt();
            sc.nextLine();
            y = sc.nextInt();
            sc.nextLine();
            divide(x, y);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Exiting");
        }
    }
}