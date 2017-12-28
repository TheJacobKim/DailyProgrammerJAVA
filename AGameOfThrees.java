/**
 * Reddit Daily Programmer #239
 */

import java.util.*;

public class AGameOfThrees {
    public static int num = 0;

    public static void main(String args[]) {
        System.out.println("Input a random integer for a Game of Threes.");
        Scanner s = new Scanner(System.in);
        try {
            num = s.nextInt();
        } catch(NumberFormatException e) {
            System.out.println("Input integers");
            System.exit(1);
        }

        game(num);
    }

    public static int game(int n) {
        System.out.print(n + " ");

        if(n == 1) {
            return n;
        } else if(n%3 == 1) {
            System.out.println("-1");
            return game((n - 1)/3);
        } else if(n%3 == 2) {
            System.out.println("1");
            return game((n+1)/3);
        } else {
            System.out.println("0");
            return game(n/3);
        }
    }
}
