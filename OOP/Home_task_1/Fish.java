package OOP.Home_task_1;

public class Fish extends Animal {



    public Fish() {
    }

    public Fish(String animalname){
        super(animalname);
        
    }

    public void swim(){
        System.out.println(animalname +" плывет");

      }
      public void toGo(){
        System.out.println(animalname+" рыбы не бегают");

      }

      public void toFly(){
        System.out.println(animalname +" рыбы не летают ");

      }

    
}
