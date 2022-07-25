import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    long value = 35231;
        System.out.println(Arrays.equals(digitize(value), new int[]{1, 3, 2, 5, 3}));
    }
    public static int[] digitize(long n) {
        return new StringBuilder(String.valueOf(n)).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
