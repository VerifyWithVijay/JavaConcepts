package myPackage;

import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();

        switch(browser.toLowerCase())
{           case "chrome":
                System.out.println("Launch Chrome browser");

            case "firefox":
                System.out.println("Launch Firefox browser");
                break;
            case "safari":
                System.out.println("Launch Safari browser");
                break;

            default:
                System.out.println("Please pass the right browser");
                break;
        }
    }
}
