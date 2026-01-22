import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    private String[] _menuStrings = 
    {"1. Add Entry", 
    "2. View Entries", 
    "3. Save to File", 
    "4. Read from File", 
    "5. Add Category",
    "6. Quit"};

    public String DisplayMenu(){
        System.out.println("Pick an option:");
        for (String string : _menuStrings) {
            System.out.println(string);
        }
        String userChoiceString = scanner.nextLine();
        return userChoiceString;
    }
}
