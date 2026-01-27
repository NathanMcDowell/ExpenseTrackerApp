import java.util.ArrayList;
import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Tracker 
{
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Entry> _entries = new ArrayList<>();
    private ArrayList<String> _categories = new ArrayList<>();

    public Tracker(ArrayList<String> presetCategories){
        _categories = new ArrayList<>(presetCategories);
    }

    public void AddEntry(){
        boolean costDone = false;
        boolean catDone = false;
        float cost = 0;
        while (!costDone) {
            try{
                System.out.println("How much did you spend? ");
                cost = Float.parseFloat(scanner.nextLine());
                costDone = true;
            } catch(NumberFormatException e){
                System.out.println("Input a valid option: ");
            }
        }
        while (!catDone) {
            try{
                System.out.println("Category? ");
                DisplayCategories();
                Integer categoryIndex = Integer.parseInt(scanner.nextLine());
                Entry newEntry = new Entry(cost, _categories.get(categoryIndex-1));
                _entries.add(newEntry);
                catDone = true;
            } catch(NumberFormatException e){
                System.out.println("Input a valid number: ");
            }catch (IndexOutOfBoundsException e) {
                System.out.println("Choice out of range");
            }
        }
        
        
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
        System.out.println("Press enter to return to menu");
        scanner.nextLine();
        for (int i = 0; i < 20; i++) {System.out.println();}
    }
    public void DisplayCategories(){
        int i = 1;
        for (String category : _categories) {
            System.out.println(i + ". " + category);
            i++;
        }
    }

}
