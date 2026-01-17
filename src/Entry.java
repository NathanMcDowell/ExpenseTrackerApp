import java.util.Scanner;

public class Entry {
    
    // Figure out date attribute
    private float _cost;
    private String _description;

    Scanner scanner = new Scanner(System.in);

    public Entry(){
        System.out.println("How much did you spend? ");
        _cost = Float.parseFloat(scanner.nextLine());
    }
    public float GetCost(){
        return _cost;
    }
}
