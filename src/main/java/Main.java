import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Texts.selectQuestion);
        System.out.println(Texts.options);
        var selection = new Scanner(System.in);
        switch (selection.nextInt()) {
            case 1:
                GuessingGame.TheGame();
                break;

            case 2:
                TheArrayThing.ControllingArrays();
                break;

            default:
                System.out.println(Texts.noSuchOption);
                break;
        }
    }
}
