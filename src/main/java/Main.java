import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Texts.invitation);
        int rand = new Random().nextInt(100);
        int tries = 5;
        System.out.println(rand);

        while (true) {
            System.out.println(Texts.rules);
            var input = new Scanner(System.in);
            if (!input.hasNextInt()) {
                System.out.println(Texts.thisIsSad + " " + input.next());
                return;
            }
            var x = input.nextInt();
            if (x > 99) {
                System.out.println(Texts.numberIsGreater);
            } else if (x < 0) {
                System.out.println(Texts.numberIsLower);
            }

            if (x == rand) {
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


