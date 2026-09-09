class Solution {
    public String shiftingLetters(String s, int[] shifts) {

        char[] arr = s.toCharArray();
        int shift = 0;

        for (int i = shifts.length - 1; i >= 0; i--) {

            shift = (shift + shifts[i]) % 26;

            arr[i] = (char) ('a' +
                    (arr[i] - 'a' + shift) % 26);
        }

        return new String(arr);
    }
}