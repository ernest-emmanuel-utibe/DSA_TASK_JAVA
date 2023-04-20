package level_2;

public class RearrangePositiveAndNegativeValue {
    public static int[] rearrangePositiveNegativeValues(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                if (digits[i] < digits[j]) {
                    int temporary = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temporary;
                }
            }
        }
        return digits;
    }
}
