import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);

        Tracker tracker = new Tracker();
        // Entry testEntry = new Entry();
        // System.out.print("$");
        // System.out.println(testEntry.GetCost());

        tracker.AddEntry();
        tracker.DisplayEntries();
        
    }
}
