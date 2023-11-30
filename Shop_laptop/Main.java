package Shop_laptop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Laptop> laptops = new HashSet<>();

        Laptop laptop1 = new Laptop();
        laptop1.ram = 6;
        laptop1.hdd = 500;
        laptop1.os = "Windows 10";
        laptop1.color = "черный";

        Laptop laptop2 = new Laptop();
        laptop2.ram = 12;
        laptop2.hdd = 512;
        laptop2.os = "Windows 11";
        laptop2.color = "черный";

        Laptop laptop3 = new Laptop();
        laptop3.ram = 6;
        laptop3.hdd = 128;
        laptop3.os = "Windows 7";
        laptop3.color = "белый";

        Laptop laptop4 = new Laptop();
        laptop4.ram = 6; 
        laptop4.hdd = 256;
        laptop4.os = "MAC";
        laptop4.color = "золотистый";

        Laptop laptop5 = new Laptop();
        laptop5.ram = 12;
        laptop5.hdd = 128;
        laptop5.os = "Windows 11";
        laptop5.color = "черный";

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);

        //  System.out.println(laptop2.equals(laptop5));

        // print(laptops);
        
 Map<Integer, String> mapLaptop = new HashMap<>();

         mapLaptop.put(1, "оперативная память");
         mapLaptop.put(2, "объем жесткого диска");
         mapLaptop.put(3, "операционная система");
         mapLaptop.put(4, "цвет");


         Scanner sc = new Scanner(System.in);
         System.out.println("Введите характеристики: 1. объем оперативной памяти");
         int ramUser = sc.nextInt();

         System.out.println("введите объем накопителя");
         int hddUser = sc.nextInt();

        


        //  System.out.println("введите операционную систему");
        //  String osUser = sc.nextLine();



        //  System.out.println("введите желаемый цвет");
        //  String colorUser = sc.nextLine();


         for (Laptop lap : laptops) {
            if((lap.getRam()>=ramUser) && (lap.getHdd()>=hddUser)){

                System.out.println(lap.toString());

                sc.close();
            }
        }






    }

    static void print(Set<Laptop> laptops) {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);

        }
    }
       

            
            
         





    }

   
              
        
    

