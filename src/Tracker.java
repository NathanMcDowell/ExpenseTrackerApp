import java.util.ArrayList;
import java.util.Scanner;


public class Tracker 
{
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Entry> _entries = new ArrayList<>();
    private ArrayList<String> _categories = new ArrayList<>();

    public void AddEntry(){
        System.out.println("How much did you spend? ");
        float cost = Float.parseFloat(scanner.nextLine());
        System.out.println("Category? ");
        String category = scanner.nextLine();
        Entry newEntry = new Entry(cost, category);
        _entries.add(newEntry);
    }
    public void DisplayEntries(){
        for (Entry entry : _entries) {
            System.out.println(String.format("%s: $%.2f", entry.GetCategory(), entry.GetCost()));
        }
    }
}
