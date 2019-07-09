class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String x1 = Integer.toString(x);
        String x2 = "";
        for (int i = 0; i < x1.length(); i++) {
            x2 = x1.charAt(i) + "" + x2; 
        }
        return x1.equals(x2);
    }
}