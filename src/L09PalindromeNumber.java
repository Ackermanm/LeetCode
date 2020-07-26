public class L09PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else {
            String s = Integer.toString(x);
            int head = 0;
            int tail = s.length() - 1;
            while (head < tail) {
                if (s.charAt(head) == s.charAt(tail)) {
                    head++;
                    tail--;
                } else
                    return false;
            }

            return true;
        }
    }
}
