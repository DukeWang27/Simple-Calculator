import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the sceond number: ");
        int num2 = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the operator (+, -, *, /): ");
        String operator = scanner.nextLine();
        System.out.println("===Calculator===");
        switch(operator) {
            case "+":
                System.out.println(String.valueOf(num1) + " + " + String.valueOf(num2) + " = " + (double) num1 + num2);
                break;
            case "-":
                System.out.println(String.valueOf(num1) + " - " + String.valueOf(num2) + " = " + Double.valueOf((double)num1 - num2));
                break;
            case "*":
                System.out.println(String.valueOf(num1) + " * " + String.valueOf(num2) + " = " + Double.valueOf((double) num1 * num2));
                break;
            case "/":
                System.out.println(String.valueOf(num1) + " / " + String.valueOf(num2) + " = " + Double.valueOf((double) num1 / num2));
                break;
        }
    }

}
