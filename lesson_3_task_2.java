public class lesson_3_task_2 {

/*      Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
 Результат: a4b3cd2 */

 public static void main(String[] args) {
    String s = "aaaabbbcdd";
    System.out.println(work(s));
    }
    
    static String work(String s) {
       StringBuilder stringBuilder = new StringBuilder();
       int count = 0;
       char cur = s.charAt(0);

         for (int i = 0; i < s.length(); i++) {
         char item = s.charAt(i);
         if (item == cur) {
            count++;
    } 
         else {
            stringBuilder.append(cur);
           if (count > 1) {
              stringBuilder.append(count);
              count = 1;
    }
    cur = item;
    }
    }
    stringBuilder.append(cur);
    if (count > 1) {
        stringBuilder.append(count);
    }
    return stringBuilder.toString();
    }
}
