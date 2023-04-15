package level_1;

public class Infinite_Series {
    public static void infiniteSeries() {
        double pie = 0;
        int signToMultiply = 1;
        int numberOfTerm = 0;
        for (int i = 1; i <= 200000; i += 2) {
            double terms = (double) 4 / i * signToMultiply;
            pie += terms;
            System.out.printf("%-10d%.5f%n", numberOfTerm, pie);
            signToMultiply *= -1;
            numberOfTerm++;
            String pieString = String.valueOf(pie);
            if (pieString.startsWith("3.14159")) {
                System.out.printf("%-10d%.5f%n", numberOfTerm, pie);
                System.out.println("Pie starts with " + pieString + " after " + numberOfTerm + " terms");
                break;
            }
        }
    }

    public static void main(String[] args) {
        infiniteSeries();
    }
}
