package oops.Inheritance;

public class Test {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        B obj1 = new B();
        obj1.show();

       A obj2 = new B();
       obj2.show();

      // B obj3 = new A();


    }
}
