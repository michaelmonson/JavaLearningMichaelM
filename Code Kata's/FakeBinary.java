public class FakeBinary {
    
    /* Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. 
       Return the resulting string.
    */
    public static void main(String args[]) {

        String numberString = "45385593107843568";

        //My Solution:
        int length = numberString.length();
        
        StringBuilder binaryString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (Integer.valueOf(numberString.substring(i, i + 1)) >= 5) {
                binaryString.append('1');
            } else {
                binaryString.append('0');
            }
        }
        System.out.println("\n Michael's Solution: " + (binaryString.toString()));


        //Regex Solution:
        String newString = numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
        System.out.print(" REGEX: " + newString); 


        //Character Replacement Solution:
        final char charArray[] = numberString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = charArray[i] < '5' ? '0' : '1';
        }          
        System.out.print("\n Char String: " + new String(charArray) + "\n\n");
      
    }
}
