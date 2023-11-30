
import java.util.ArrayList;
import java.util.HashMap;

public class NamesCounter {

    private HashMap<String, Integer> names = new HashMap<>();
    ArrayList<String> list = new ArrayList<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {

        int count = 0;

        list.add(name);

        for (String s : list) {

            if (name == s) {
                count++;

            } else {
                names.put(name, 1);
            }
        }
        names.put(name, count);

    }

    public void showNamesOccurrences() {
        System.out.println(names);

    }

    public static void main(String[] args) {

        String name1;
        String name2;
        String name3;
        String name4;
        String name5;
        String name6;
        name1 = "Yulya";
        name2 = "Elena";
        name3 = "John";
        name4 = "Ivan";
        name5 = "Ivan";
        name6 = "Yulya";
        NamesCounter namesCounter = new NamesCounter();
        namesCounter.addName(name1);
        namesCounter.addName(name2);
        namesCounter.addName(name3);
        namesCounter.addName(name4);
        namesCounter.addName(name5);
        namesCounter.addName(name6);
        namesCounter.showNamesOccurrences();

    }
}
