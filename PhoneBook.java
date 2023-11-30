import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import java.util.HashMap;
import java.util.List;




public class PhoneBook {
    
/*Напишите программу, представляющую телефонную книгу. Программа должна иметь следующие функции:

add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.

find(String name): Поиск номеров телефона по имени в телефонной книге.
Если запись с именем name существует, возвращает список номеров телефона для этой записи.
Если запись с именем name не существует, возвращает пустой список.

getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров телефона. */



private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

      public void add(String name, Integer phoneNum) {  
    
            
      
          ArrayList<Integer> phoneNums = phoneBook.getOrDefault(name, new ArrayList<>());

          phoneNums.add(phoneNum);
          phoneBook.put(name,phoneNums);
    
            }  
                 
                                     
                        
      
     public ArrayList<Integer> find(String name) {
      return phoneBook.getOrDefault(name, new ArrayList<>());


             }


      
    public static HashMap<String, ArrayList<Integer>> getPhoneBook() { /* Возвращает всю телефонную книгу в виде HashMap, 
                                                                     где ключи - это имена, а значения - списки номеров телефона. */
              return phoneBook;           
        

            

             }
        
      

public static void main(String[] args) {
     
      String name1;
      String name2;

      int phone1;
      int phone2;



      name1 = "Ivanov";
      name2 = "Petrov";
      phone1 = 123456;
      phone2 = 654321;



      PhoneBook myPhoneBook = new PhoneBook();
      myPhoneBook.add(name1, phone1);
      myPhoneBook.add(name1, phone2);
      myPhoneBook.add(name2, phone2);

      System.out.println(phoneBook);
 



}



}
