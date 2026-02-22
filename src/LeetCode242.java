public class LeetCode242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] arrS = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arrS[s.charAt(i) - 'a']++;
            arrS[t.charAt(i) - 'a']--;
        }
        for (int n : arrS) {
            if (n != 0) return false;
        }
        return true;
    }
}
