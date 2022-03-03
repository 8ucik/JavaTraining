import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void TheGame() {
        System.out.println(Texts.invitation);
        int rand = new Random().nextInt(100);
        int tries = 5;

        while (true) {
            System.out.println(Texts.rules);
            var input = new Scanner(System.in);
            if (!input.hasNextInt()) {
                System.out.println(Texts.thisIsSad + " " + input.next());
                return;
            }

            var guess = input.nextInt();
            if (guess > 99) {
                System.out.println(Texts.numberIsGreater);
            } else if (guess < 0) {
                System.out.println(Texts.numberIsLower);
            }

            if (guess == rand) {
                System.out.println(Texts.winner);
                break;
            } else {
                System.out.println(Texts.tryAgain);
                tries--;
                System.out.println(Texts.triesLeftP1 + " " + tries + Texts.triesLeftP2);
            }
            if (tries == 0) {
                System.out.println(Texts.oupsNotThisTime + " " + rand);
                break;
            }
        }
    }

}
