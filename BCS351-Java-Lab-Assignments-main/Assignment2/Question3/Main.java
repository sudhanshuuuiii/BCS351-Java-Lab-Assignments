/*
Name: SUDHANSHU SINGH | Roll No: 2510303511 | Assignment No: 2 | Question No: 3
*/

public class Main {
    public static void main(String[] args) {

        int year = 2024;

        if ((year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0)) {

            System.out.println("Leap year");

        } else {
            System.out.println("Not a leap year");
        }
    }
}