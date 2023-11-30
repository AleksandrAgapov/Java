public class programm_2 {
 //  Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
  public static void main(String[] args) {

    int[] mas =  {1,1,0,1,1,1};

    int Count = 0;
   
    for (int i = 0; i < mas.length; i++) {
        if(mas[i] == 1){
           Count ++;
        }
        else if (mas[i] == 0){
           continue;

        }
      
     }
    
   System.out.println("Количество максимальных  1: "+Count); 
  }
}


// решение изгруппы 

// nt[] mas = {1,1,0,1,1,1};
// int maxCount = 0;
// int count = 0;
// for (int i = 0; i < mas.length; i++) {
// if (mas[i] == 1){
// count++;
// }
// else if (maxCount < count){
// maxCount = count;
// count = 0;
// }
// else count = 0;
// }

// if (maxCount < count){
// maxCount = count;
// count = 0;
// }
// System.out.println("Количество максимальных 1: " + maxCount);


// от препода решение

// public static void main(String[] args) {

// int[] mas = {1, 1, 0, 1, 1, 1};
// int maxCount = 0;
// int count = 0;
// for (int i = 0; i < mas.length; i++) {
// if (mas[i] == 1) {
// count++;
// if (maxCount < count) {
// maxCount = count;
// }
// } else {
// count = 0;
// }
// }
// System.out.println("Количество максимальных 1: " + maxCount);