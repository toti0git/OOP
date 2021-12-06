public class Driver extends Employee implements Drivable{



    public Driver(String name) {
        super(name);

    }


     @Override
     public void candrive() {
         System.out.println("I am driving a car");
     }
 }