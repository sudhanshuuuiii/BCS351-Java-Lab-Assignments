/* Name: SUDHANSHU SINGH | Roll Number: 2510303511 | Assignment Number: 10 |Question Number: 3 */

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.set(1, 25);
        numbers.remove(3);

        System.out.println("Updated list: " + numbers);
        System.out.println("Size: " + numbers.size());
    }
}