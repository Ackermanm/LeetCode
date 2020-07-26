public class L07ReverseInteger {

    public int reverse(int x) {
        int result = 0;
        int xAbs = Math.abs(x);
        int size = Integer.toString(xAbs).length();
        for (int i = 1; i <= size; i++) {
            result = result * 10 + xAbs % 10;
            xAbs = xAbs / 10;
        }

        if (x >= 0)
            return result;
        else
            return -result;
    }
}
