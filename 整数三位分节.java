import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String input = cin.nextLine(); // .strip();
        cin.close();
        if (input.isEmpty()) {
            return;
        }
        int begin = 0, end = input.length() % 3 == 0 ? 3 : input.length() % 3;
        StringBuilder sb = new StringBuilder();
        while (end < input.length()) {
            sb.append(input.substring(begin, end)).append(",");
            begin = end;
            end += 3;
        }
        sb.append(input.substring(begin, end));
        System.out.println(sb.toString());
    }
}