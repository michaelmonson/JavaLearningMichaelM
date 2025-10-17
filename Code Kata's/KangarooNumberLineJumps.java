import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        
        /* ------------------------------------------------------------
        //Solution works, but inefficient!
        int furthestKangaroo = x1 > x2 ? 1 : 2;
        
        long kangaroo1Pos = x1;
        long kangaroo2Pos = x2;
        
        //Calculate when they meet!
        while (kangaroo1Pos != kangaroo2Pos) {
            
            if (furthestKangaroo == 1 && x2 > x1) {
                return "NO";                
            } else if (furthestKangaroo == 2 && x1 > x2) {
                return "NO";
            }
            
            //Increment distances:
            kangaroo1Pos += v1;
            kangaroo2Pos += v2;
        }
        
        return "YES";
        
        --------------------------------------------------------------------------------------------
          Although above is a clean implementation for reasoning through, it is also brute force!
          After considering the math of things, and playing with A.I., I came up with a far more
          efficient solution!  (BELOW)
          
          Looping is the most common reason for failing hidden tests. Since the code literally steps 
          kangaroos forward one step at a time (x1 += v1; x2 += v2) until they meet or pass each other, 
          it will work fine work for SMALL numbers, but time out on large test cases (e.g. millions of jumps
          before passing).  You might need MILLIONS of iterations before concluding they'll never meet.           
          
          Also, there is a large risk of logical condition errors when the loop condition or equality check
          allows for an infinite loop, or misses cases where the kangaroo behind never catches up.
          
          So below is an efficient mathematical approach that never loops!
             - It is a mathmatical equation, so it runs in O(1) time
             - Handles all large values safely using 'long' data type
             - Avoids looping entirely.  No overflow, timeouts, and no false positives from simulation rounding!
             
          When both kangaroos jump at a constant rate, their positions after n jumps are:
            x1 + n*v1
            x2 + n*v2
            
          They meet if:  x1 + n*v1 = x2 + n*v2
          
          So Algebraicaly, we simply solve for 'n' based on the values that are already sent to us.
          We can do this because their velocity is constant for each Kangaroo!
          
          Solve for n:->  n = (x2 - x1) / (v1 - v2)
          
          For them to land on the same spot after the same whole number of jumps, two conditions must hold:
            1. The one behind is faster:
                  (v1 > v2) if x1 < x2  (otherwise they'll never catch up)
            2. The jump counts line up exactly:
                  (x2 - x1) must be evenly divisible by (v1 - v2) (no fractional jumps).                  
          
          That's it! No simulation needed - just pure math.
        -------------------------------------------------------------------------------------------- */
         
        //Mathmatical Solution (simply and brilliant!):
        
        if (v1 == v2) { //return immediately:
            return (x1 == x2) ? "YES" : "NO";
        }
        
        // Must be able to catch up (the kangaroo behind has a higher jump rate)
        if ((v1 > v2) && ((x2 - x1) % (v1 - v2) == 0)) {
            return "YES";
        }
        
        //Mathmatically, they will never reach, even if it takes quintillions if iterations to learn that:
        return "NO";
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
