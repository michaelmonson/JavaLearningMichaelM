public class StringEndsWith {   
    
    public static void main(String args[]) {
        
        //example values:
        String str = "samurai";
        String end = "ai";

        System.out.println(solution(str, end));
    }
    
    public static boolean solution(String str, String ending) {        

        int strLength = str.length();
        int endLength = ending.length();

        if (strLength >= endLength) {
            if (str.substring(strLength - endLength, strLength).equals(ending)) {
                return true;
            }  
        }
        return false;
    }

  }