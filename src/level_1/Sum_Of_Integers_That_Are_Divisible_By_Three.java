package level_1;

public class Sum_Of_Integers_That_Are_Divisible_By_Three {
    public static int sumDivisibleBy3() {
        int sum = 0;
        for (int i = 1; i <= 81; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumDivisibleBy3());
    }
}
