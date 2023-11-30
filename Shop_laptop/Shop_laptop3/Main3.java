package Shop_laptop.Shop_laptop3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main3 {

    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Model 1", 8, 256, "Windows 10", "Black"));
        laptops.add(new Laptop("Model 2", 16, 512, "Windows 10", "Silver"));
        laptops.add(new Laptop("Model 3", 8, 512, "MacOS", "Grey"));
        laptops.add(new Laptop("Model 4", 16, 256, "Linux", "White"));
        laptops.add(new Laptop("Model 5", 8, 512, "Windows 10", "Black"));

        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "RAM");
        criteria.put(2, "Storage");
        criteria.put(3, "Operating System");
        criteria.put(4, "Color");

        Map<String, Integer> filterParams = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (Map.Entry<Integer, String> entry : criteria.entrySet()) {
            System.out.println("Enter minimum value for " + entry.getValue() + ":");
            int value = scanner.nextInt();
            filterParams.put(entry.getValue(), value);
        }

        Set<Laptop> filteredLaptops = new HashSet<>();
        for (Laptop laptop : laptops) {
            if (laptop.getRam() >= filterParams.get("RAM") &&
                    laptop.getStorage() >= filterParams.get("Storage"))

            // &&
            // laptop.getOs().equals(filterParams.get("Operating System")) &&
            // laptop.getColor().equals(filterParams.get("Color")))
            {
                filteredLaptops.add(laptop);
            }
        }
       scanner.close();
       
        System.out.println("\nFiltered Laptops:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }
}
