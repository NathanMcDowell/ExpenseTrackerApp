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
            try{
                int userChoiceInt = Integer.parseInt(menu.DisplayMenu());
            
                switch (userChoiceInt) {
                    case 1: // Add Entry
                        for (int i = 0; i < 20; i++) {System.out.println();}
                        tracker.AddEntry();
                        break;
                
                    case 2: // View Entries
                        for (int i = 0; i < 20; i++) {System.out.println();}
                        tracker.DisplayEntries();
                        break;
                
                    case 3: // Save to File
                        for (int i = 0; i < 20; i++) {System.out.println();}
                        System.out.println("Under construction- Save to file");
                        break;
                
                    case 4: // Read from File
                        for (int i = 0; i < 20; i++) {System.out.println();}
                        System.out.println("Under construction- Read from file");
                        break;
                
                    case 5: // Add Category
                        for (int i = 0; i < 20; i++) {System.out.println();}
                        tracker.AddCategory();
                        break;
                
                    case 6: // Quit
                        for (int i = 0; i < 20; i++) {System.out.println();}
                        System.out.println("Have a good day!");
                        done = true;
                        break;
                
                    default:
                        for (int i = 0; i < 20; i++) {System.out.println();}
                        System.out.println("Input a valid number:");
                        break;
                    }
            } catch (NumberFormatException e){
                for (int i = 0; i < 20; i++) {System.out.println();}
                System.out.println("Input a valid number: ");
            }
        }while(!done);
        
    }
}
