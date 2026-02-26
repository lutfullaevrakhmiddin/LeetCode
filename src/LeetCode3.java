import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode3 {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
            }
            if (max < set.size()) {
                max = set.size();
            }
        }
        return max;
    }

    public static int lengthOfLongestSubstring1(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static int lengthOfLongestSubstring2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int left = 0, right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            if (map.containsKey(current) && left <= map.get(current)) {
                left = map.get(current) + 1;
            }
            max = Math.max(max, right - left + 1);
            map.put(current, right);
        }
        return max;
    }

    public static int lengthOfLongestSubstring3(String s) {
        int max = 0;
        for (int left = 0, right = 0; right < s.length(); right++) {
            int indexFirst = s.indexOf(s.charAt(right), left);
            if (indexFirst != right) {
                left = indexFirst  + 1;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
