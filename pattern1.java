import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
    // no of work to be done
    for(int row = 1; row <= n; row++){
        // to be stars to be printed
        int stars = row; // as we know that no of stars are equal to the row number
        for( int col = 1; col <= stars; col++ ){
            System.out.print("*\t");
        }
        System.out.println();
    }
     scn.close();
    }
}
