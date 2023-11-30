public class lesson_3_task_1 {
    // Дано четное число N (>0) и символы c1 и c2.
    // Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
    // Ответ: c1c2c1…c2 (всего N символов)
    static String nCount(int n,char c1, char c2){
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < n; i++) {
            if(i%2 ==0){ 
                sb.append(c1);
        
            }
            else sb.append(c2);
                   }
        return sb.toString();

    }
    public static void main(String[] args) {
        System.out.println(nCount(5, 'a', 'b'));

        
    }
}
   
