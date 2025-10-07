package myPackage;

import java.util.Arrays;

public class arraysConcept {
    public static void main(String[] args) {
        String name = "Vijay";

        String arr[] = name.split("");
        for(String ss : arr)
        {
            System.out.println(ss);
        }

        String names[]={"Vijay", "ravi", "Indra", "Babu"};
        System.out.println(names.length);

        for(int i=0;i<names.length;i++)
        {
            System.out.println("Names are: " +names[i]);
        }

        System.out.println("***************");

        for(String Names: names)
        {
            System.out.println(Names);
        }

        System.out.println("&&&&&&&&&&&&&&&&");
        System.out.println(Arrays.toString(names));

        int marks[] = new int[5];
        marks[0]=20;
        System.out.println(marks[0]);
        System.out.println(marks.length);

    }
}
