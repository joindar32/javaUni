package lab4;

public class Division {
    private static double divide(double num1, double num2) throws CustomDivisionException {
        if (num2 == 0) {
            throw new CustomDivisionException("Делить на ноль нельзя.");
        } else {
            return num1 / num2;
        }
    }

    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 0;
        double res;

        try {
            res = divide(num1, num2);
            System.out.print("Результат деления: " + res);
        } catch(CustomDivisionException e) {
            System.out.println(e.getMessage());
            e.writeToLog("log.txt");
        }
    }
}
