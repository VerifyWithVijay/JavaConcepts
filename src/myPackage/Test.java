package myPackage;

public class Test {
    public static void main(String[] args) {

        int age = 19;
        System.out.println(age>18?"Eligible to vote":"Not eligible");

        int number=1;
        String result = (number>18)?(number>25?"Goa-Can drink": "Goa-Can't drink")  :"You can't go to Goa";
        System.out.println(result);

        int a = 45,b=20;
        System.out.println(a>b?"a is greater":"b is greater");

        int n = 11;
        System.out.println(n%2==0?"Even Number":"Odd Number");

        int x = -50, y=40, z=30;

        int largest = (x>y) ? (x>z)?x:y  : (y>z)?y:z;
        System.out.println(largest);



    }
}
