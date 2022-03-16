public class AutoboxingCuriosity {

    public static void main(String args[]) {

        AutoboxingCuriosity autoboxing = new AutoboxingCuriosity();
        //Pass two Integers
        autoboxing.myMethod(4, 6);

        //Pass two Double's:
        autoboxing.myMethod(34.30, 62.34);

        //Pass two Long's (the 'myMethod' overload accepting two doubles is called when passing through Long's, for precission)
        autoboxing.myMethod(34440L, 543L);

        

    }

    //NOTE:  The two methods below have been defined similarly, so which method will be called? :-)

    public void myMethod(double val1, double val2) 
    {
        System.out.println("> First method called (two doubles)");
    }

    public void myMethod(int val1, int val2)
    {
        System.out.println("> Second method called (two integers)");
    }

}