package homework.h8.task2;

import java.util.Scanner;

public class PlanLechenia {

    Hirurg hirurg = new Hirurg();
    Terapevt terapevt = new Terapevt();
    Dantist dantist = new Dantist();
    Scanner scanner = new Scanner(System.in);




    public PlanLechenia(){
        System.out.println("Выбери что тебе нужно вылечить:");
        System.out.println("1) Перелом");
        System.out.println("2) Вылечить зуб");
        System.out.println("Любое другое числло) Тоько выписать лекарства");
        int vibratLechenie = scanner.nextInt();
        if(vibratLechenie == 1) {
            hirurg.lechit();
            terapevt.lechit();
        } else if(vibratLechenie == 2) {
                dantist.lechit();
                terapevt.lechit();
        } else {
            terapevt.lechit();
        }
    }



}
