import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    ArrayList<Integer> numberList = new ArrayList<Integer>();
    ArrayList<Integer> checkedNum = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);

    int maxOccurenceTimes = -1;
    int maxOccurenceNumber = -1;

    int repetition = in.nextInt();

    for (int i = 0; i < repetition; i++) {
      int number = in.nextInt();
      numberList.add(number);
    }

    for (int number : numberList) {
      if (!checkedNum.contains(number)) {
        int counter = Collections.frequency(numberList, number);
        if (counter > maxOccurenceTimes) {
          maxOccurenceTimes = counter;
          maxOccurenceNumber = number;
        }
      }
    }
    System.out.println(maxOccurenceNumber);
    
  }
}
