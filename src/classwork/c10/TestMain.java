package classwork.c10;

public class TestMain {
    public static void main(String[] args) {
        String str = "This my string";
        String str2 = "This my string";        // можно сравнить //регистр тоже важен
        String str3 = new String("This my string");     // нельзя сравнить(тк через конструктор)
        System.out.println(str == str2);
        System.out.println(str == str3);
        System.out.println(str.equals(str3)); // он выведит true, а не false(оно может сравнить с конструктором)
        System.out.println(str.compareTo(str3));// сравнивает, и выводит в числах разницу

        String addString = str + str2;
        System.out.println(addString); // строки можно сложить(склеить)
        System.out.println(str.concat(str2)); // или так
        System.out.println(String.join(" ", str, str2)); // или так, со вставкой пробела, или любого текста
        System.out.println(String.join(" and ", str, str2, str3)); // сложил три строки, и между ними and

        String[] arr = new String[]{str, str2, str3};
        System.out.println(String.join(" and ", arr)); // соеденить массивы строк можно

        String myBestString = "                 This my string              ";
        System.out.println(myBestString);
        System.out.println(myBestString.trim()); // убрало пробелы

        System.out.println(myBestString.length()); // но тут пробелы есть


        myBestString = myBestString.trim(); // строки не измееняемый обьект, поэтому если хотим их изменить, пишем так
        System.out.println(myBestString.length());


        System.out.println(myBestString.charAt(5)); // вывести 5ую букву считается с нуля



        char[] charArr = myBestString.toCharArray();
        int count = 0;
        for (char ch : charArr) {
            if (ch == 'i') {
                                                       // посчитали кол во буквы i в строчке charArr

                count++;
            }
        }
        System.out.println("count:"+count);

        System.out.println(myBestString.substring(5)); // вывести строчку начиная с 5ого символа
        System.out.println(myBestString.substring(5,7)); // вывести строчку начиная с 5ого символа по 7ой







    }
}
