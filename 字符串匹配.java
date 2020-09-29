import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine().trim();
        String t = cin.nextLine().trim();
        cin.close();
        if (strend(s, t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean strend(String s, String t) {
        if (s == null || (s.length() < t.length())) {
            return false;
        }
        if (s.substring(s.length() - t.length()).equals(t)) {
            return true;
        }
        return false;
    }
}