import java.util.ArrayList;
import java.util.Scanner;


public class Tracker 
{
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Entry> _entries = new ArrayList<>();
    private ArrayList<String> _categories = new ArrayList<>();

    public Tracker(ArrayList<String> presetCategories){
        _categories = new ArrayList<>(presetCategories);
    }

    public void AddEntry(){
        System.out.println("How much did you spend? ");
        float cost = Float.parseFloat(scanner.nextLine());
        System.out.println("Category? ");
        String category = scanner.nextLine();
        Entry newEntry = new Entry(cost, category);
        _entries.add(newEntry);
    }
    public void AddCategory(){
        DisplayCategories();
        System.out.println("What is the new category you would like to add? ");
        _categories.add(scanner.nextLine());
    }
    public void DisplayEntries(){
        for (Entry entry : _entries) {
            System.out.println(String.format("%s: $%.2f", entry.GetCategory(), entry.GetCost()));
        }
    }
    public void DisplayCategories(){
        int i = 1;
        for (String category : _categories) {
            System.out.println(i + ". " + category);
            i++;
        }
    }
}
