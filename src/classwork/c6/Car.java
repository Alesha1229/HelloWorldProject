package classwork.c6;

import java.util.SortedMap;

public class Car {
    private String color;
    private int age;
    private String brand;
    private int wheelNumber = 4;
    private boolean isRadioPresent = true;
    String kpp = "Auto";
    private int currentSpeed = 0;
    // признаки
    // цвет машины, год машины, марка, кол-во колёс, двигатель, кузов, кпп

    // действия/методы: звестись, поехать, повернуть(лево.право), ускориться, замедлиться

    public Car() {
    }

    public Car(String color, int age, String brand) {
        this.color = color;
        this.age = age;
        this.brand = brand;
    }

    public Car(String color, int age, String brand, int wheelNumber, boolean isRadioPresent, String kpp) {
        this.color = color;
        this.age = age;
        this.brand = brand;
        this.wheelNumber = wheelNumber;
        this.isRadioPresent = isRadioPresent;
        this.kpp = kpp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public boolean isRadioPresent() {
        return isRadioPresent;
    }

    public void setRadioPresent(boolean radioPresent) {
        isRadioPresent = radioPresent;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    @Override
    public String toString() {
        return "Car hihihi HA{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", brand='" + brand + '\'' +
                ", wheelNumber=" + wheelNumber +
                ", isRadioPresent=" + isRadioPresent +
                ", kpp='" + kpp + '\'' +
                '}';
    }


    public void startDriving() {
        System.out.println("bbbrrrrttttt");
    }

    public void sound() {
        System.out.println("bebep");
    }

    public void goDirectly() {
        System.out.println("my car is going");
    }

    public void switchDirection(boolean isRightOne) {
        if (isRightOne) {
            System.out.println("we are moving to right");
        } else {
            System.out.println("we are moving left");
        }
    }

    public void changeSpeed(int speedChange) {
        currentSpeed += speedChange;
        if (speedChange > 0) {
            System.out.println("FASTER!, our speed is:" + currentSpeed);
        } else {
            System.out.println("slower, our speed is:" + currentSpeed);
        }
        if (currentSpeed <= 0) {
            System.out.println("trip is finished");
        }
    }
    private void printRandom(){
        System.out.println(0);
    }


}

