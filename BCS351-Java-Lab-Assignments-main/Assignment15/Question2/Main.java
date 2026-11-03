// Name: SUDHANSHU SINGH
// Roll No: 2510303511
// Assignment No: 15
// Question No: 2

class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append(i).append(",");
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}