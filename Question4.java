import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int integerBase = in.nextInt();

    for (int row = integerBase; row > 0; row--) {
      for (int time = 0; time < row; time++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
