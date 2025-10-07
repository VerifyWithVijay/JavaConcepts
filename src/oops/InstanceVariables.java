package oops;

public class InstanceVariables {

    static String str = "Vijay";
    static String name;
    int num = 100;
    int value;
    public static void main(String[] args) {

        InstanceVariables iv = new InstanceVariables();
        System.out.println(iv.str);
        System.out.println(name="Ravi");
        System.out.println(iv.num);
        System.out.println(iv.value=200);


    }
}
