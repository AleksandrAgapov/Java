public class lesson_3_task_3 {
    /*Напишите метод, который принимает на вход строку (String) 
    и определяет является ли строка палиндромом (возвращает boolean значение).

     Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево. */
    public static void main(String[] args) {
String text = "A man, a plan — a canal, panama";
System.out.println(isPolindrom(text));
}

static boolean isPolindrom(String text){

text = text.toLowerCase().replace(" ", "").replace(",", "").replace("—", "");
StringBuilder sb = new StringBuilder();
for (int i = text.length()-1; i >= 0; i--) {
sb.append(text.charAt(i));
}
return text.contentEquals(sb);
}
}