package homework.h20;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private static List<String> students = new ArrayList<>();

    public static void main(String[] args) {
        MainH20.getStudents(students);
        System.out.println(students);
    }

}
