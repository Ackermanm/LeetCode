import java.util.HashSet;
import java.util.Set;

public class L03LongestSubstringSWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longest = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i + longest; j <= n; j++) {
                if (hasRepeat(s.substring(i, j))) {
                    break;
                } else {
                    longest++;
                }
            }
        }

        return longest - 1;
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
