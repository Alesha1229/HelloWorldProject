package homework.h8;

public class Main {
    public static void main(String[] args) {
        System.out.println("Phone № 1:");
        Phone firstPhone = new Phone(3412,"s20",500);
        System.out.println();
        System.out.println("Phone № 2:");
        Phone secondPhone = new Phone(3488, "s21", 450);
        System.out.println();
        System.out.println("Phone № 3:");
        Phone thirdPhone = new Phone(7268,"s22", 400);

        System.out.println();
        Phone forExample = new Phone("MEGA Mobila",300,15); // пример вставки одного конструктора в другой

        System.out.println();
        System.out.println();
        System.out.println();

        firstPhone.receiveCall("Туз бубновый",5454);
        firstPhone.getNumber();

        secondPhone.receiveCall("Джейсон Стэтхом");      // Примеры перегруженных методов
        secondPhone.getNumber();

        thirdPhone.receiveCall("Раскумарщик");
        thirdPhone.getNumber();

        firstPhone.sendMessage();
    }

}
