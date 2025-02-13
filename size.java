package horse;
import java.util.ArrayList;
import java.util.Scanner;

// Class to handle ArrayList operations
class ArrayHandler {
    private ArrayList<Integer> numbers1;
    private ArrayList<Integer> numbers2;

    // Constructor
    public ArrayHandler() {
        numbers1 = new ArrayList<>();
        numbers2 = new ArrayList<>();
    }

    // Method to take input for both lists
    public void takeInput(Scanner scanner) {
        System.out.println("Enter the number of elements for the arrays:");
        int num = scanner.nextInt();

        System.out.println("Enter " + num + " numbers for the first array:");
        for (int i = 0; i < num; i++) {
            numbers1.add(scanner.nextInt());
        }

        System.out.println("Enter " + num + " numbers for the second array:");
        for (int i = 0; i < num; i++) {
            numbers2.add(scanner.nextInt());
        }
    }

    // Method to display the lists
    public void displayLists() {
        System.out.println("\nFirst Array: " + numbers1);
        System.out.println("Second Array: " + numbers2);
    }

    // Method to compare elements at the same index
    public void compareArrays() {
        System.out.println("\nComparing elements at the same positions:");
        int minSize = Math.min(numbers1.size(), numbers2.size());

        for (int i = 0; i < minSize; i++) {
            if (numbers1.get(i).equals(numbers2.get(i))) {
                System.out.println("Match at index " + i + ": " + numbers1.get(i));
            } else {
                System.out.println("Mismatch at index " + i + ": " + numbers1.get(i) + " is not equal to " + numbers2.get(i));
            }
        }
    }

    // Method to remove an element from both lists
    public void removeElement(Scanner scanner) {
        System.out.println("\nEnter an element to remove from both arrays:");
        int elementToRemove = scanner.nextInt();

        boolean removedFromFirst = numbers1.remove(Integer.valueOf(elementToRemove));
        boolean removedFromSecond = numbers2.remove(Integer.valueOf(elementToRemove));

        if (removedFromFirst || removedFromSecond) {
            System.out.println("\nUpdated Arrays after removing " + elementToRemove + ":");
            displayLists();
        } else {
            System.out.println("\nElement " + elementToRemove + " not found in either array.");
        }
    }
}

// Main class
public class size {  // Keeping class name "size"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayHandler handler = new ArrayHandler();  // Creating an object of ArrayHandler

        handler.takeInput(scanner);
        handler.displayLists();
        handler.compareArrays();
        handler.removeElement(scanner);

        scanner.close();
    }
}
