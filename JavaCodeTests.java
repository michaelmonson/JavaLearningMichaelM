import java.util.ArrayList;

public class JavaCodeTests {
   
    public static void main(String args[]) {
        
        //random tests

        //System.out.println(solution(str, end));

        //.........................................................
        //Q1: How can you test if a double value d is not a number?
        Double f1 = new Double(1.0 / 0.0);  
        boolean res = f1.isNaN();
  
        // printing the output
        if (res)
            System.out.println(f1 + " is NaN");
        else
            System.out.println(f1 + " is not NaN");
  
        // second example
        f1 = new Double(0.0 / 0.0);
        res = f1.isNaN();
  
        // printing the output
        if (res)
            System.out.println(f1 + " is NaN");
        else
            System.out.println(f1 + " is not NaN");

        System.out.println("Press enter to continue");
        try { System.in.read(); } catch(Exception e){ }

        
        //.........................................................
        //Q2:  i is an int of value 2 and the result variable is declared.  What does the following code print out, and why is it 4?
        int i = 2;
        int result = 0;
        switch(i) {
            case 1: result = 1; break;
            case 2: result = 2;
            case 3: result = 3; 
            case 4: result = 4;
            //default: result = 0;
        } 
        System.out.println("result = " + result);
        /*ANSWER: without a break statement in each case, it will automatically execute the remaining cases.
            Each break statement terminates the enclosing switch statement. Control flow continues with the first statement 
            following the switch block. The break statements are necessary because without them, statements in switch blocks fall through: 
            All statements after the matching case label are executed in sequence, regardless of the expression of subsequent case labels, 
            until a break statement is encountered.
        */

        System.out.println("Press enter to continue");
        try { System.in.read(); } catch(Exception e){ }


        //.........................................................
        /* The next block shows statements in a switch block that fall through... because 'break' statements are not used.
           The program displays the month corresponding to the integer month, but ALSO the months that follow in the year:
         */
        ArrayList<String> futureMonths =
            new java.util.ArrayList<String>();

        int month = 8;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                     break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
               System.out.println(monthName);
            }
        }

        System.out.println("Press enter to continue");
        try { System.in.read(); } catch(Exception e){ }

    }

}
