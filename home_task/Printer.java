package home_task;

public class Printer {
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '*';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}

class Calculator {
    public int calculate(char op, int a, int b) {
        int ans = 0;
        if (op == '-') {
            ans = a - b;
        } 
        else if (op == '+') {
            ans = a + b;
        } 
        else if (op == '*') {
            ans = a * b;
        } 
        else if (op == '/') {
            ans = a / b;
        }
        return ans;
       
    }

}
