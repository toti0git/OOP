public class Kitchener extends Employee implements Cookable{

    public Kitchener(String name) {
        super(name);
    }


    @Override
    public void cancook() {
        System.out.println("I am cooking");
    }
}