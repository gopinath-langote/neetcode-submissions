class Solution {
    public boolean isPalindrome(String s) {
        int sIndex = 0;
        int eIndex = s.length() - 1;

        s = s.toLowerCase();

        while (sIndex < eIndex) {
            char sChar = s.charAt(sIndex);
            char eChar = s.charAt(eIndex);
            if (!isAlphaNumeric(sChar)) {
                sIndex++;
                continue;
            }
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
        boolean isSmallChar = c >= 'a' && c <= 'z';
        boolean isCapitalChar = c >= 'A' && c <= 'Z';
        boolean isNumber = c >= '0' && c <= '9';
        return isSmallChar || isCapitalChar || isNumber;
    }
}
