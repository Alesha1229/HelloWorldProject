package homework.h8.task2;

public class Pacient {
    private int vozrast;
    private int rost;
    private int ves;
    private String name;

    public Pacient(int vozrast, int rost, int ves, String name) {
        this.vozrast = vozrast;
        this.rost = rost;
        this.ves = ves;
        this.name = name;
        System.out.println("Добрый день: ");
        System.out.println(name);
        System.out.println();
        System.out.println("Информация о вас:");
        System.out.println("Возраст: "+vozrast);
        System.out.println("Рост: "+rost);
        System.out.println("Вес "+ves);
    }



}
