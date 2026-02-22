import java.util.Arrays;

public class LeetCode344 {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o', 'p'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int left =  0;
        int right = s.length - 1;
        while (left < right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString0Ms(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
