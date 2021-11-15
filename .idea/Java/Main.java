import java.util.ArrayList;

public  class Main{
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Aktolkyn");
        Programmer programmer1 = new Programmer("Bakhyt");
        Programmer programmer2 = new Programmer("Askar");

        Kitchener kitchener = new Kitchener("Asylym");
        Kitchener kitchener1 = new Kitchener("Berik");
        Kitchener kitchener2 = new Kitchener("Serik");

        Driver driver = new Driver("AIgerim");
        Driver driver1 = new Driver("Ainur");
        Driver driver2 = new Driver("Akerke");

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(programmer);
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(kitchener);
        employees.add(kitchener1);
        employees.add(driver1);

        for (Employee employee:employees) {
            employee.voice();
        }

        ArrayList<Programmable> canProg = new ArrayList<>();
        canProg.add(programmer);
        canProg.add(programmer1);
        canProg.add(programmer2);
        for (Programmable programmable:canProg){
            programmable.canProgramming();
        }


    }
}