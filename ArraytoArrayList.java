package horse;
import java.util.*;

class VehicleProcessor {
    private String[] vehicleArray;
    private List<String> vehicleList;
    private HashMap<Integer, String> vehicleMap;

    // Constructor
    public VehicleProcessor(String[] vehicleArray) {
        this.vehicleArray = vehicleArray;
        this.vehicleList = new ArrayList<>();
        this.vehicleMap = new HashMap<>();
    }

    // Method to convert Array to ArrayList
    public void convertArrayToList() {
        Collections.addAll(vehicleList, vehicleArray);
        System.out.println("ArrayList: " + vehicleList);
    }

    // Method to convert ArrayList back to Array
    public void convertListToArray() {
        String[] arrayConverted = vehicleList.toArray(new String[0]);
        System.out.println("Converted Array: " + Arrays.toString(arrayConverted));
    }

    // Method to create and populate HashMap
    public void createHashMap() {
        for (int i = 0; i < vehicleArray.length; i++) {
            vehicleMap.put(i + 1, vehicleArray[i]);
        }
    }

    // Method to retrieve values from HashMap
    public void displayHashMapValues() {
        for (int key : vehicleMap.keySet()) {
            System.out.println("Vehicle with key " + key + ": " + vehicleMap.get(key));
        }
    }
}

public class ArraytoArrayList {
    public static void main(String[] args) {
        String[] vehicleArray = {"car", "bus", "motorbike"};

        // Creating an object of VehicleProcessor
        VehicleProcessor processor = new VehicleProcessor(vehicleArray);

        // Performing operations
        processor.convertArrayToList();
        processor.convertListToArray();
        processor.createHashMap();
        processor.displayHashMapValues();
    }
}
