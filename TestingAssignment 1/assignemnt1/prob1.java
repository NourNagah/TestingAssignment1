import java.util.Scanner;
public class prob1 {
    public static String watermelon(int w) {
        if (w > 100 || w < 1)
            return "input w out of range";
        if (w % 2 == 0 && w != 2)
            return "YES";
        else
            return "NO";

    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int w = input.nextInt();
       System.out.println( watermelon (w));
   }
}
