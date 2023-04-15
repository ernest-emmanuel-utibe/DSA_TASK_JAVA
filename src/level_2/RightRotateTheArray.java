package level_2;

public class RightRotateTheArray {
    public static int[] rightRotate(int[] digits) {
        int[] rotate = new int[digits.length];
        rotate[0] = digits[digits.length - 1];
        for (int i = 1; i < rotate.length; i++) {
            rotate[i] = digits[i - 1];
        }
        return rotate;
    }
}
