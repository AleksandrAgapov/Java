package OOP.Home_task_1;





public class Animal {

      String animalname;



      public Animal() {

    }
     

    public Animal(String animalname) {
        this.animalname = animalname;

    }


    public String getName() {
        return animalname;
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
