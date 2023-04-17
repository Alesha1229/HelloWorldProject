package classwork.c9.h8task2;

import java.util.Random;

public class Ambulance {
    public static void main(String[] args) {
        //создаются пациенты
        Pacient[] pacients =getPacients();

        for (Pacient pacient: pacients){
            //2) прописать метод лечения
            setMedicalPlan(pacient);
            //3) Выделить доктора
            Doctor doctor = getDoctorToPacient(pacient);
            // 4)Вылечить
            doctor.lechit();
        }

        /*   //2) прописать метод лечения
        setMedicalPlan(knownPacient);
        setMedicalPlan(unknownPacient);
        //3) Выделить доктора
        Doctor firstDoctor = getDoctorToPacient(knownPacient);
        Doctor secondDoctor = getDoctorToPacient(unknownPacient);
        // 4)Вылечить
        firstDoctor.lechit();
        secondDoctor.lechit();    */

    }


    /**
     * We give Doctor to Pacient
     * if medicalPlan = 1 - we give Terapist
     * if medicalPlan = 2 - we give dentist
     * @param pacient
     * @return
     */
    private static Doctor getDoctorToPacient(Pacient pacient){
        if(pacient.getMedicalPlan() == 1) return new Terapist();
        if(pacient.getMedicalPlan() == 2) return new Dentist();
        return  new Surgeon();
    }


    /**
     * set different madical plans to pacient
     * @param pacient
     */
    private static void setMedicalPlan(Pacient pacient){
        if (pacient.getName()==null){
            pacient.setMedicalPlan(1);
        } else {
            Random random = new Random();
            pacient.setMedicalPlan(random.nextInt(3));
        }

    }

    private static Pacient[] getPacients(){
        Pacient[] pacient = new Pacient[2];
        pacient[0] = new Pacient("Vasya Pupkin",23);
        pacient[1] = new Pacient();
        return pacient;
    }
}
