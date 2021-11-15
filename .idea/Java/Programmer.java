public class Programmer extends Employee implements Programmable {


    public Programmer(String name) {

       super(name);
    }


    @Override
    public void canProgramming() {
        System.out.println("I am programming");
    }
}