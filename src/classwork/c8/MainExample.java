package classwork.c8;

public class MainExample {
    public static void main(String[] args) {
        Parent badParent = new Child();
        final  int myInt; // final - заполннить можно только 1 раз
        myInt = 3;
        badParent.setName("Tom");
        System.out.println(badParent.getName());

        BadParent superBadParent = new BadParent();
        Personable personable = new BadParent();


    }
}
