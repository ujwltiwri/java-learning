import java.util.Scanner;

public class subtract {
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

        int borrow = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        int[] ans = new int[n2];
        int k = ans.length - 1;

        while (k >= 0) {
            int diff = 0;
            int a1val;

            if (i > 0) {
                a1val = a1[i];
            } else {
                a1val = 0;
            }

            if (i >= 0) {
                diff = diff + a1[i];
            }

            if (j >= 0) {
                diff = diff + a2[j];
            }

            diff = a2[j] + borrow - a1val;

            if (diff < 0) {
                diff = diff + 10;
                borrow = -1;
            } else {
                borrow = 0;
            }

            // diff = a2[j] + borrow - a1[i];
            ans[k] = diff;

            i--;
            j--;
            k--;
            System.out.println(a1val);
        }

        // for (int p = 0; p < ans.length; p++) {
        // if (p == 0 && ans[p] == 0) {
        // // nothing
        // } else {
        // System.out.print("Answer: " + ans[p] + " ");
        // }
        // }

        scn.close();
    }
}
