class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String check1=str1+str2;
        String check2=str2+str1;
        if (check1.equals(check2)) {
            int m = str1.length();
            int n = str2.length();
            int ind = gcd(m, n);
            return str1.substring(0, ind);

        } else {
            return "";
        }

    }

    public static int gcd(int m, int n) {
        int gcd = 1;
        for (int i = Math.min(m, n); i > 0; i--) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
                break;

            }
        }
        return gcd;
    }
}