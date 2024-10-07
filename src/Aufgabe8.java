import java.util.Scanner;
public class Aufgabe8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte den ersten Operanden eingeben: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Bitte den Operator eingeben: ");
        char operator = scanner.next().charAt(0);

        System.out.print("Bitte den zweiten Operanden eingeben: ");
        double operand2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Fehler: Division durch Null ist nicht erlaubt.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Ungültiger Operator. Bitte verwenden Sie +, -, * oder /.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Berechnung: " + operand1 + " " + operator + " " + operand2 + " = " + result);
        }

        scanner.close();
    }
}
