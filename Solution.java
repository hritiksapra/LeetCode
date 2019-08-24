import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = x.nextInt();
            int q = x.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = x.nextInt();
            }
            int ars[] = new int[q];
            for (int j = 0; j < q; j++) {
                int a = x.nextInt();
                int b = x.nextInt();
                arr[a] = b;
                int max = -1;
                for (int k = 0; k < n; k++) {
                    for (int l = n - 1; l >= i; l--) {
                        if (isEvenBit(k,l, arr)) {
                            max = l - k + 1;
                            break;
                        }
                    }
                    if (max != -1) {
                        break;
                    }
                }
                ars[j] = max;   
            }
            System.out.print("Case #"+i+":");
            for (int j = 0; j < ars.length; j++) {
                System.out.print(" "+ars[j]);
            }
            System.out.println();
        }
    }
    public static boolean isEvenBit(int a, int b, int[] arr) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum ^ arr[i];
        }
        String s = Integer.toBinaryString(sum);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        if (count % 2 == 0) {
            return true;
        }  
        return false;
    }
}