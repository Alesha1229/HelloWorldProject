package classwork.c16;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamEX {
    public static void main(String[] args) {


        MyBestInterface intStr = str -> str.substring(0, 2);
        intStr.test("abc");

        List<Integer> testValues = Arrays.asList(1, 2, 5, 3, 2, 1);
        Map<Integer, Long> result = testValues.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
        List<User> users = Arrays.asList(new User(20, "Nick"),
                new User(30, "Alesha"),
                new User(20, "Pavel"),
                new User(30, "Steve"));

        Map<Integer, List<User>> userByAge = users.stream()
                .collect(Collectors.groupingBy(User::getAge));
        System.out.println(userByAge);

        var employees = Arrays.asList(new Employee("Worker", 200),
                new Employee("Worker", 250),
                new Employee("Worker", 500),
                new Employee("Worker", 100),
                new Employee("Manager", 1000),
                new Employee("Manager", 1500),
                new Employee("Manager", 1100));

        var averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();
        System.out.println(averageSalary);

        var employeesByCategory = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory)); // рассортировали по категориям

        var salariesByCategory = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(salariesByCategory);

        var minSalariesByCategory = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,
                        Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(minSalariesByCategory);

        Map<Employee, String> tests = employees.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                Employee::getCategory));

        System.out.println(tests);


    }
}
