package classwork.c9.cl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Month.JANUARY);
        System.out.println(Arrays.toString(Month.values()));
        System.out.println(Month.valueOf("FEBRUARY"));
        System.out.println("На каком месте Сентябрь:"+Month.SEPTEMBER.ordinal());
    }
}
