public class Calculator {

    private Calculator() {
    }

    public static long sum(long a, long b) {
        return a + b;
    }
    public static double sum(long a, double b) {
        return a + b;
    }
    public static double sum(double a, long b) {
        return a + b;
    }
    public static double sum(double a, double b) {
        return a + b;
    }

    public static long diff(long a, long b) {
        return a - b;
    }
    public static double diff(long a, double b) {
        return a - b;
    }
    public static double diff(double a, long b) {
        return a - b;
    }
    public static double diff(double a, double b) {
        return a - b;
    }

    public static double quotient(long a, long b) {
        return calculationQuot(a, b);
    }
    public static double quotient(long a, double b) {
        return calculationQuot(a, b);
    }
    public static double quotient(double a, long b) {
        return calculationQuot(a, b);
    }
    public static double quotient(double a, double b) {
        return calculationQuot(a, b);
    }

    public static long product(long a, long b) {
        return a * b;
    }
    public static double product(long a, double b) {
        return a * b;
    }
    public static double product(double a, long b) {
        return a * b;
    }
    public static double product(double a, double b) {
        return a * b;
    }

    public static double exponentiation(long a, long b) {
        return calculationExp(a, b);
    }
    public static double exponentiation(double a, long b) {
        return calculationExp(a, b);
    }

    private static double calculationExp(double a, long b) {
        if (a == 0) {
            return 0.0;
        }
        if (a == 1) {
            return 1.0;
        }
        if (b == 0) {
            return 1.0;
        }
        double result = a;
        if (b < 0) {
            long c = -b;
            for (int i = 2; i <= c; i++) {
                result = result * a;
            }
            return 1.0 / result;
        }
        for (int i = 2; i <= b; i++) {
            result = result * a;
        }
        return result;
    }
    private static double calculationQuot(double a, double b) {
        if (b == 0) {
            return -1.0;
        }
        return a / b;
    }

}
