package classwork.c13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        Set<String> firstSet = new HashSet<>();
        Set<String> secondSet = new TreeSet<>();
        firstSet.add("afirst");
        firstSet.add("csecond");
        firstSet.add("bthird");
        secondSet.add("bfirst");
        secondSet.add("cthird");
        secondSet.add("asecond");

        System.out.println(firstSet);
        System.out.println(secondSet);

        /*for(int i=0; i<100 ; i++){
            firstSet.add(""+i);
            secondSet.add(""+i);
        }*/

        System.out.println(firstSet);
        System.out.println(secondSet);

        System.out.println(firstSet.contains("first"));
        System.out.println(firstSet.isEmpty());
        System.out.println(firstSet.size());
        System.out.println(firstSet.remove("bthird"));

        Set<Person> myPersonSet = new TreeSet<>();
        myPersonSet.add(new Person("Alesha", "Kamin"));
        myPersonSet.add(new Person("Pavlik", "Kamin"));
        myPersonSet.add(new Person("Pavlik", "Boom"));

        System.out.println(myPersonSet);


    }
}
