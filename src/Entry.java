import java.util.Scanner;

public class Entry {
    
    // Figure out date attribute
    private float _cost;
    private String _category;

    Scanner scanner = new Scanner(System.in);

    public Entry(){
        System.out.println("How much did you spend? ");
        _cost = Float.parseFloat(scanner.nextLine());
        System.out.println("Category? ");
        _category = scanner.nextLine();

    }
    public Entry(float cost, String category){
        _cost = cost;
        _category = category;
    }
    public float GetCost(){
        return _cost;
    }
    public String GetCategory(){
        return _category;
    }
}
