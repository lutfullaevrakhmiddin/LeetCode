public class LeetCode868 {
    public static void main(String[] args) {
        System.out.println("22 uchun natija: " + binaryGap(22)); // Output: 2
        System.out.println("8 uchun natija: " + binaryGap(8));   // Output: 0
        System.out.println("5 uchun natija: " + binaryGap(5));   // Output: 2
    }

    public static int binaryGap(int n) {
        String str = Integer.toBinaryString(n);
        int lastBitIndex = -1;
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                if (lastBitIndex != -1) {
                    max = Math.max(max, i - lastBitIndex);
                }
                lastBitIndex = i;
            }
        }
        return max;
    }
}