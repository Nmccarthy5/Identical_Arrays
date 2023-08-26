//Author: Nathan MC
// Date: 08/26/2023
/**
 * 8.29 (Identical arrays) The two-dimensional arrays m1 and m2 are identical if they
 * have the same contents. Write a method that returns true if m1 and m2 are identical, using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 */
import java.util.*;

public class Identical_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//Input list 1
        int[][] one = new int[3][3];
        System.out.print("Enter list1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                one[i][j] = in.nextInt();
            }
        }
        //Input list 2
        int[][] two = new int[3][3];
        System.out.print("\nEnter list2:  ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                two[i][j] = in.nextInt();
            }
        }
        if (equals(one, two)) {
            System.out.println("The arrays are identical.");
        } else {
            System.out.println("The arrays are not identical. Try Again.");
        }
        in.close();
        
    }
// Yay! More mathmatical thingamabob. In acuality here is the boolean experation to make sure list 1 and 2 are identical
    public static boolean equals(int[][] m1, int[][] m2) {

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
}