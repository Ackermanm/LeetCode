import java.util.HashSet;
import java.util.Set;

public class L03LongestSubstringSWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int longest = s.length();
        boolean flag = false;
        while (longest >= 1) {
            for (int i = 0; i <= s.length() - longest; i++) {
                if (!hasRepeat(s.substring(i, i + longest))) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
            else {
                longest--;
            }
        }

        return longest;
    }

    public boolean hasRepeat(String string) {
        Set<Character> currentChar = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            if (!currentChar.contains(string.charAt(i))) {
                currentChar.add(string.charAt(i));
            } else {
                return true;
            }
        }
        return false;
    }
}
