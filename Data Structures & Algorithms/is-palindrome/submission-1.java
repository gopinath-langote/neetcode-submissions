class Solution {
    public boolean isPalindrome(String s) {
        int sIndex = 0;
        int eIndex = s.length() - 1;

        while (sIndex < eIndex) {
            char sChar = Character.toLowerCase(s.charAt(sIndex));
            if (!isAlphaNumeric(sChar)) {
                sIndex++;
                continue;
            }
            char eChar = Character.toLowerCase(s.charAt(eIndex));
            if (!isAlphaNumeric(eChar)) {
                eIndex--;
                continue;
            }
            if (sChar != eChar) {
                return false;
            }

            sIndex++;
            eIndex--;
        }

        return true;
    }

    public boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
