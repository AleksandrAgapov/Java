package home_task;

public class task_1 {

    public static void main(String[] args) {
        // System.out.println(printPrimeNums(15));
        // int x = 1;
        // int N = 1000;
        printPrimeNums();
    }



   
    
    public static void printPrimeNums() {
        int N = 1000;
        int x, y, flag;
        // System.out.println(N);

        for (x = 1; x <= N; x++) {
            if (x == 1 || x == 0)
                continue;

            flag = 1;

            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flag = 0;
                    break;
                }

            }
            if (flag == 1)
                System.out.println(x + " ");
        }
    }

}
