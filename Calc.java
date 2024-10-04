import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c = 0.0;

        System.out.print("Enter the first number: ");
        a = in.nextDouble();
        System.out.print("Enter the second number: ");
        b = in.nextDouble();

        System.out.print("Choose the operation:" +
                "\n1. Addition" +
                "\n2. Subtraction" +
                "\n3. Multiplication" +
                "\n4. Division" +
                "\n5. Power" +
                "\nPlease enter the number of the operation: ");
        int operation = in.nextInt();

        switch (operation) {
            case 1:
                c = a + b;
                System.out.println(a + " + " + b + " = " + c);
                break;
            case 2:
                c = a - b;
                System.out.println(a + " - " + b + " = " + c);
                break;
            case 3:
                c = a * b;
                System.out.println(a + " * " + b + " = " + c);
                break;
            case 4:
                if (b != 0) {
                    c = a / b;
                    System.out.println(a + " / " + b + " = " + c);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            case 5:
                System.out.print("Enhance A or B?" +
                        "\n1. A" +
                        "\n2. B" +
                        "\nPlease enter your choice: ");
                int enhance = in.nextInt();
                if (enhance == 1) {
                    c = Math.pow(a, 2);
                    System.out.println(a + " squared = " + c);
                } else if (enhance == 2) {
                    c = Math.pow(b, 2);
                    System.out.println(b + " squared = " + c);
                } else {
                    System.out.println("Invalid choice.");
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
                break;
        }

        in.close();
    }
}
