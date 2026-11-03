// Name: SUDHANSHU SINGH
// Roll No: 2510303511
// Assignment 14 - Question 1

class Main {
    public static void main(String[] args) {

        String s = "programming";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowels: " + count);
    }
}