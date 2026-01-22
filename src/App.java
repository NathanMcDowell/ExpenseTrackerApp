import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<String> presetCategories = 
            new ArrayList<>(List.of("Groceries", "Gas", "Rent", "Utilities", "Recreation"));
        Tracker tracker = new Tracker(presetCategories);
        Menu menu = new Menu();
        // Entry testEntry = new Entry();
        // System.out.print("$");
        // System.out.println(testEntry.GetCost());

        // tracker.AddEntry();
        // tracker.AddEntry();
        // tracker.DisplayEntries();
        // tracker.DisplayCategories();
        boolean done = false;
        do{
            int userChoiceInt = menu.DisplayMenu();
            switch (userChoiceInt) {
                case 1: // Add Entry
                    tracker.AddEntry();
                    break;
            
                case 2: // View Entries
                    tracker.DisplayEntries();
                    break;
            
                case 3: // Save to File
                    System.out.println("Under construction- Save to file");
                    break;
            
                case 4: // Read from File
                    System.out.println("Under construction- Read from file");
                    break;
            
                case 5: // Add Category
                    tracker.AddCategory();
                    break;
            
                case 6: // Quit
                    System.out.println("Have a good day!");
                    done = true;
                    break;
            
                default:
                    System.out.println("Input a valid option:");
                    break;
            }
        }while(!done);
        
    }
}
