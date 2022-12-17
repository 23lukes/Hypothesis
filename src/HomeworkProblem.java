import java.util.Scanner;

public class HomeworkProblem {
        public static boolean test(String s1, String s2, int n1, int n2) {
            return s1.compareTo(s2) == (n1-n2);
        }
        public static void main(String[] args) {
            Scanner kboard = new Scanner(System.in);
            System.out.print("Enter 1: ");
            String s1 = kboard.nextLine();
            System.out.print("Enter 2: ");
            String s2 = kboard.nextLine();
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);
            System.out.println(test(s1, s2, n1, n2));
        }
    }


