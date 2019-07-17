class zigzagConversion {
    public String convert(String s, int numRows) {
        char zz[][] = new char[numRows][s.length()];
        int i = 0;
        int j = 0;
        int curr = 0;
        if (numRows == 1) {
            return s;
        }
        
        while (curr < s.length()) {
            if(i == 0) {
                for (int a = 1; a <= numRows && curr < s.length(); a++) {
                    zz[i][j] = s.charAt(curr);
                    i++;
                    curr++;
                }
                i = zz.length - 2;
                j++;
            }
            else {
                zz[i][j] = s.charAt(curr);
                curr++;
                i--;
                j++;
            } 
        }
        
        return arrayToString(zz);
    }
    public String arrayToString(char[][] arr) {
        String zig = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == '\000') {
                    continue;
                } else {
                    zig += arr[i][j];
                }
            }
        }
        return zig;
    }
}