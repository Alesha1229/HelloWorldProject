package classwork.c9.h8task2;

public class Pacient {
    private String name;
    private int age;
    // это то, к какому врачу мы собираемся его отправить
    private int medicalPlan;

    public Pacient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pacient() {
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getMedicalPlan() {
        return medicalPlan;
    }

    public void setMedicalPlan(int medicalPlan) {
        this.medicalPlan = medicalPlan;
    }

    public String getName() {
        return name;
    }
}
