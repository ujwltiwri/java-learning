import java.util.Scanner;

/**
 * sum
 */
public class sum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int[] ans = new int[(n1 > n2 ? n1 : n2) + 1];
        int carry = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        int k = ans.length - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            // for arr1
            if (i >= 0) {
                sum = sum + a1[i];
            }

            // for arr2
            if (j >= 0) {
                sum = sum + a2[j];
            }

            carry = sum / 10;
            sum = sum % 10;

            ans[k] = sum;

            i--;
            j--;
            k--;
        }

        for (int p = 0; p < ans.length; p++) {
            if (p == 0 && ans[p] == 0) {
                // nothing to do
            } else {
                System.out.print(ans[p] + " ");
            }
        }

        scn.close();
    }
}