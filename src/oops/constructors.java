package oops;

public class constructors {

    constructors()
    {
        System.out.println("Default Constructor");
    }
    constructors(int a)
    {
        System.out.println("Default Constructor");
    }
    constructors(String str)
    {
        System.out.println("Default Constructor");
    }

    public static void main(String[] args) {

        constructors con = new constructors();
        constructors con1 = new constructors(10);
        constructors con2 = new constructors("Helo");
    }
}
