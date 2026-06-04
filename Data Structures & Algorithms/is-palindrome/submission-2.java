class Solution {
    public boolean isPalindrome(String s) {
        String replace = s.toLowerCase().replace(" ", "").replaceAll("[^a-zA-Z0-9]", "");
        // if (replace.length() == 1) return false;
        int l = 0, r = replace.length() - 1;
        while (l < r) {
            if (replace.charAt(l) != replace.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
