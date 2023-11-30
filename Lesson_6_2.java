import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Lesson_6_2 {
    public static void main(String[] args) {



            
        criteriaFiltr();


    }
       
        static void criteriaFiltr(){

         Map<Integer,String> filterParams = new HashMap<>();
        

        System.out.println(" Введите цифру, соответствующую необходимому критерию"+ 
        '\n'+"1 - ОЗУ" +
        '\n'+ "2 - Объем жесткого диска"+
        '\n'+"3- Операционная система"+
        '\n'+"4 - Цвет"+
        '\n'+"5 - Начать поиск"); 

         Scanner scanner = new Scanner(System.in);  /*объявили сканер */
        
        //  int value = scanner.nextInt();   /* считали значение */
       
       
          
            System.out.println("чтобы  выборать введите 1-4 или начать поиск 5");
            int value = scanner.nextInt();
                        
            if (value==1) {
                System.out.println("Введите  значение  ОЗУ:");

                String ram = scanner.nextLine();

                    filterParams.put(1, ram);
                    System.out.println("жду значени");
            }       
               if (value==2) {
                System.out.println("Введите  значение " + "Объем ЖД" + ":");
                String hdd = scanner.nextLine();
                filterParams.put(2, hdd);
            }        
             if (value==3) {
                System.out.println("Введите  значение " + "Операционка" + ":");
                String oS = scanner.nextLine();
                filterParams.put(3, oS);

            }   
            if (value==4) {
                System.out.println("Введите  значение " + "Цвет" + ":");
                String usercolor = scanner.nextLine();
                filterParams.put(4, usercolor);

            }  
            if (value==5){

            }       
                           

                               scanner.close(); 
                                   }
    

    }

    

    

