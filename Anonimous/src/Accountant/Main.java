package Accountant;

public class Main {
   static int amount=12;
    public static void main(String[] args) {

        Director director=new Director();
        director.force(3, new Counter() {
            @Override
            public String report(int month) {
               int result = amount*month;
                System.out.println(String.valueOf(result));
                return String.valueOf(result);
            }
        });
    }
}
