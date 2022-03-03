import java.util.ArrayList;
import java.util.Scanner;

public class TheArrayThing {
    public static void ControllingArrays() {
        System.out.println(Texts.arraySizeQuestion);
        var size = new Scanner(System.in).nextInt();
        var arrInput = new Scanner(System.in);
        if (size <= 0) {
            System.out.println(Texts.arraySizeSorry + " " + size);
            return;
        }

        var listOfArrays = new ArrayList<Integer>(size);
        var sum = 0;

        System.out.println(Texts.provideNumbers);
        for (var els = 0; els <= size; els++) {
            System.out.println(Texts.provideSingleNumber);
            els = arrInput.nextInt();
            listOfArrays.add(els);
            sum += els;
        }
        if (!listOfArrays.isEmpty() || sum != 0) {
            System.out.println(Texts.averageFromNumbers + " " + sum / size);
            System.out.println(sum);
        } else {
            System.out.println(Texts.sorryEmptyArray);
        }
    }
}
