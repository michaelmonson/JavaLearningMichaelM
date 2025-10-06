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

/*
 *
 */
class Result {

    /*
     * Add staircase function to print pattern
     * Implement staircase function to print a staircase pattern based on input integer.
     *
     * Staircase Example:  Here is a staircase of size n = 4:
     *     #
     *    ##
     *   ###
     *  ####
     *
     * Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
     *
     * Function Description: Write a program that prints a staircase of size n.
     * 
     * Complete the staircase function with the following parameter(s):  int 'n' = type integer.
     * 
     * Print a staircase as described above. No value should be returned from the method.
     * Note: The last line is not preceded by spaces. All lines are right-aligned.
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {            
            String spaces = "";
            String stair = "#";
            
            //Build leading spaces:
            for (int j = 1; j < n - i; j++) {
                spaces += " ";
            }
            
            //Build current stair:
            for (int k = 0; k < i; k++) {
                stair += "#";                
            }
            
            System.out.println(spaces + stair);            
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
