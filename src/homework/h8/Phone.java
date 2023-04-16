package homework.h8;

import java.util.Arrays;
import java.util.Scanner;

public class Phone {
    private int number;
    private String model;
    private int weight;

    int numberForExample;
    Scanner scanner = new Scanner(System.in);


    public Phone(int number, String model, int weight) {
        this.number = number;
        System.out.print("Number:");
        System.out.println(number);
        this.model = model;
        System.out.print("Model: ");
        System.out.println(model);
        this.weight = weight;
        System.out.print("Weight: ");
        System.out.println(weight);
    }
    public void receiveCall(String name){
        System.out.print("Входящий звонок:");
        System.out.println(name);
    }
    public void receiveCall(String name,int number){
        System.out.print("Входящий звонок:");
        System.out.println(name);
        System.out.print("Номер входящего звонка: ");
        System.out.println(number);
    }

    public void sendMessage(){
        System.out.print("Ваш номер:");
        System.out.println(number);
        System.out.println("Введите кол-во номеров, на которые желаете отправить смс:");
        int colvo = scanner.nextInt();
        int[] arr = new int[colvo];
        System.out.println("Введите сами номера:");
        for (int i = 0; i < arr.length; i++) {
            int numbers = scanner.nextInt();
            arr[i] = numbers;
        }
        System.out.println("Ваше смс отправлено на данные номера:");
        System.out.println((Arrays.toString(arr)));




    }



    public int getNumber() {
        System.out.print("Ваш номер: ");
        System.out.println(number);
        return number;
    }


    public Phone(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }


    public Phone(String model, int weight, int numberForExample) {
        this(model, weight);
        System.out.println(model);
        System.out.println(weight);
        this.numberForExample = numberForExample;
        System.out.println(numberForExample);
    }
}
