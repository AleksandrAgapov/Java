import java.util.Map;
import java.util.Stack;
import java.util.HashMap;
public class Main_3 {


 /*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3]) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
*/
public static void main(String[] args) {
String primer1 = "a+(d*3)";
// String primer2 = "[a+(1*3])";
// String primer3 = "<{a}+{(d*3)}>";
// String primer4 = "{a+]}{(d*3)}";
System.out.println(checkPrimer(primer1));

System.out.println();
// System.out.println(checkPrimer(primer2));
// System.out.println(checkPrimer(primer3));
// System.out.println(checkPrimer(primer4));
}

static boolean checkPrimer(String primer){
Stack<Character> stack = new Stack<>();
char[] arr = primer.toCharArray();
Map<Character, Character> map = new HashMap<>();
map.put('(', ')');
map.put('[', ']');
map.put('<', '>');
map.put('{', '}');

for (char cur: arr){
if (map.containsKey(cur)){
stack.push(cur);
}
if (map.containsValue(cur)){
if (stack.empty() || map.get(stack.pop()) != cur){
return false;
}
}
}
 return stack.empty();
}   
    
}
