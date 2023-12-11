package OOP.Home_task_1;

public class Birds extends Animal {


    public Birds() {
    }


    public Birds(String animalname){
        super(animalname);
        
    }


    public void toGo(){
        System.out.println(animalname+" бежит");

      }

      public void toFly(){
        System.out.println(animalname +" летит");

      }
       public void swim(){
        System.out.println(animalname+" плывет");

      }
}
