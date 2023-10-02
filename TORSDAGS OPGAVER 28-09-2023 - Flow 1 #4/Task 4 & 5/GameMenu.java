import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
    private ArrayList<String> options;

    public GameMenu(ArrayList<String> options) {
        this.options = options;
    }

    public String getAction() {
        System.out.println("Type a number to choose an action:");
        for (String option : options) {
            System.out.println(option);
        }

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        return choice;
    }
}
