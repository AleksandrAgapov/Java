


// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

// import java.time.LocalTime;
// import java.util.Scanner;

// public class program_1 {
//   public static void main(String[] args) {
//    System.out.println("укажите ваше имя");
//    Scanner scanner = new Scanner(System.in);

//    String name = scanner.nextLine();

//    LocalTime time = LocalTime.now();
//    int hour = time.getHour();
   
//    if (hour >=5 && hour<12 ){ 
//     System.out.println("Доброе утро, " + name + "!");
//    }
//      else if(hour >=12 && hour<18){
//       System.out.println("Добры день, " + name + "!");
//      }


//      else if(hour >=18 && hour<23){
//       System.out.println("Добрый вечер, " + name + "!"); 
      
//     }
//      else {
//       System.out.println("Доброй ночи, " + name + "!"); 
//    }
//     }
//    }
  
// решение преподавателя


// public static void main(String[] args) {
// System.out.println("Укажите ваше имя");
// Scanner scanner = new Scanner(System.in);
// String name = scanner.nextLine();
// LocalTime time = LocalTime.now();
// int hour = time.getHour();
// if (hour >= 5 && hour < 12){
// System.out.println("Доброе утро, " + name + "!");
// } else if (hour >= 12 && hour < 18){
// System.out.println("Добрый день, " + name + "!");
// } else if (hour >= 18 && hour < 23){
// System.out.println("Добрый вечер, " + name + "!");
// } else {
// System.out.println("Доброй ночи, " + name + "!");
// }
// }
// }
      
   
   //  Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.  

   

//  Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.  


