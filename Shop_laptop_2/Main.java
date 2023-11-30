package Shop_laptop_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

           
        // print(laptops);
        criteriaFiltr();
    }

    static void criteriaFiltr() {
        Set<Laptop> laptops = new HashSet<>();

        /* добавляем наши ноутбуки в коллекцию */

        laptops.add(new Laptop("Model 1", "8", "256", "Windows 10", "Black"));

        laptops.add(new Laptop("Model 2", "32", "512", "Windows 11", "Silver"));

        laptops.add(new Laptop("Model 3", "8", "512", "MacOS", "Grey"));

        laptops.add(new Laptop("Model 4", "16", "256", "Linux", "White"));

        laptops.add(new Laptop("Model 5", "8", "512", "Windows 10", "Black"));

        laptops.add(new Laptop("Model 6", "16", "1tb", "Windows 11", "White"));

        // Создаем фильтр куда будем помещать данные от пользователя

        Map<Integer, String> filterParams = new HashMap<>();

        System.out.println(" Введите цифру, соответствующую необходимому критерию" +
                '\n' + "1 - ОЗУ" +
                '\n' + "2 - Объем жесткого диска" +
                '\n' + "3- Операционная система" +
                '\n' + "4 - Цвет" +
                '\n' + "5 - Начать поиск");

        Scanner scanner = new Scanner(System.in); /* объявили сканер */

        while (true) {
            System.out.println("чтобы  выбрать введите 1-4, чтобы  начать поиск введите 5");
            int value = scanner.nextInt();
            scanner.nextLine();

            if (value == 1) {
                System.out.println("Введите  желаемый объем оперативной памяти" + ":");
                String ram = scanner.nextLine();
                filterParams.put(1, ram);
            }
            if (value == 2) {
                System.out.println("Введите  желаемый объем жесткого диска" + ":");
                String hdd = scanner.nextLine();
                filterParams.put(2, hdd);
            }
            if (value == 3) {
                System.out.println("Введите  операционную систему" + ":");
                String oS = scanner.nextLine();
                filterParams.put(3, oS);

            }
            if (value == 4) {
                System.out.println("Введите желаемый цвет" + ":");
                String usercolor = scanner.nextLine();
                filterParams.put(4, usercolor);

            }
            if (value == 5) {

                scanner.close();
                break;
            }
        }
        // создаем новый HashSet и заполняем его ноутбуками сравнивая параметры от
        // пользователя и магазина
        Set<Laptop> filteredLaptops = new HashSet<>();

        for (Laptop laptop : laptops) {
            if (laptop.getRam().equals(filterParams.get(1)) ||
                    laptop.getStorage().equals(filterParams.get(2)) ||
                    laptop.getOs().equalsIgnoreCase(filterParams.get(3)) ||
                            laptop.getColor().equalsIgnoreCase(filterParams.get(4))) {

                filteredLaptops.add(laptop);
            }
        }
        /* для вывод подходящих ноутбуков */
        System.out.println("\n Ноутбуки в наличии с вашими критериями :\n");
        for (Laptop item : filteredLaptops) {
            System.out.println(item);
        }

    }

    //  Метод для печати всех ноутбуков в магазине

    static void print(Set<Laptop> laptops) {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
       }
    }
}
