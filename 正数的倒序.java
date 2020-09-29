import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String input = cin.nextLine().trim();
        cin.close();
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(input).reverse().toString());
    }
}