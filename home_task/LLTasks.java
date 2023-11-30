// package home_task;
// import java.util.LinkedList;

// class LLTasks {
//     public static LinkedList<Object> revert(LinkedList<Object> ll) {
//         // Напишите свое решение ниже

// LinkedList<Object> newLl = new LinkedList<Object>();

// for (Object item : ll) {
//   newLl.addFirst(item);
// }

// return newLl;
// }

// // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer{ 
//     public static void main(String[] args) { 
//         LinkedList<Object> ll = new LinkedList<>();

//         if (args.length == 0 || args.length != 4) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//             ll.add(1);
//             ll.add("One");
//             ll.add(2);
//             ll.add("Two");
//             ll.add("23243");
//             ll.add("rege");
//             ll.add("rewr");
//             ll.add("klkj");
            
            

//         } else {
//             ll.add(Integer.parseInt(args[0]));
//             ll.add(args[1]);
//             ll.add(Integer.parseInt(args[2]));
//             ll.add(args[3]);
//         }

//         LLTasks answer = new LLTasks();
//         System.out.println(ll);
//         LinkedList<Object> reversedList = answer.revert(ll);
//         System.out.println(reversedList);
//     }
// }
// }