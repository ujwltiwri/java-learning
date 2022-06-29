import java.util.Scanner;

public class bar_chart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        int large = maxelement(a);

        for (int row = large; row > 0; row--) {
            for (int col = 0; col < a.length; col++) {
                if (a[col] == row || a[col] > row) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            // move to next line
            System.out.println();
        }

        scn.close();
    }

    public static int maxelement(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
