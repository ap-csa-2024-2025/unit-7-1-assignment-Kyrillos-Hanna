import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";
    ArrayList<String> wordList = new ArrayList<String>();
    System.out.println("Please enter words, enter STOP to stop the loop.");
    while (!input.equals("STOP"))
    {
      input = sc.nextLine();
      wordList.add(input);
    }
    wordList.remove(wordList.size() - 1);
    System.out.println("\n" + wordList.size());
    System.out.println(wordList);

    String first = wordList.get(0);
    wordList.set(wordList.size() - 1, first);
    
    if (wordList.size() > 2) {
      wordList.remove(0);
    }

    System.out.println(wordList);

    sc.close();
  }
}
