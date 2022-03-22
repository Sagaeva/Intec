package be.intecbrussel.eatables;

public class Cone implements Eatable {

     private Flavor [] balls;

     public Cone(){

     }

      public Cone(Flavor[] balls) {
          this.balls = balls;
     }


     @Override
     public void eat() {
         System.out.print("I eat cone with these flavors:");
         for(int i =0; i < balls.length; i++){
             System.out.print(" " + balls[i] + " ");
         }
         System.out.println();


     }
}
