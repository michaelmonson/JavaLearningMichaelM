import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
 * Write a function which takes a list of strings and returns each line prepended by the correct number.
 * The numbering starts at 1. The format is n: string. Notice the colon and space in between.
 * 
 * Examples:
 *    number(Arrays.asList()) # => []
 *    number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]
 */
public class LineNumberAppend {

    public static void main(String args[]) {
        List<String> linesFormatted = new ArrayList<>();
        linesFormatted = number(Arrays.asList("a", "b", "c"));
        linesFormatted = number(Arrays.asList("", "", "", "", ""));
    }    

    public static List<String> number(List<String> lines) {

      List<String> linesFormatted = new ArrayList<String>();
      for (int i = 0; i < lines.size(); i++) {
        linesFormatted.add(i + 1 + ": " + lines.get(i));
      }

      return linesFormatted;
    }

    //NOTE:  Took me 15 minutes to solve, because I was attempting it raw, without code hints or auto-complete.
}