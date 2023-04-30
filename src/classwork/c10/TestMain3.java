package classwork.c10;

import classwork.extrawork.Example;

public class TestMain3 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("1xample: ");

        builder.append("first")
                .append(" ")
                .append("example");  // создаёт строку из этих слов
        builder.setCharAt(0,'E'); // меняет 0ой символ на Е
        builder.insert(8, "First "); // вставляем текст в builder на 9ое место
        builder.delete(15,21); // удаляет с 15 по 21 символ
        builder.indexOf("First");

        //builder.reverse(); // реверс всех символов

        builder.replace(0,3,"abc");

        String result = builder.toString();
        System.out.println(builder.toString());
        System.out.println("...................................");
        String testCase = "This abba not";
        System.out.println(isPalindrome(1,testCase));
        System.out.println(isPalindrome(2,testCase));
        System.out.println(isPalindrome(10,testCase));
    }

    /*private static boolean isPalindrome(String str){
        StringBuilder builder = new StringBuilder(str);
        return str.equals(builder.reverse().toString());
    }*/
    private static boolean isPalindrome(int number, String str){
        String[] arr = str.split(" ");
        if (number> arr.length){
            System.out.println("number is too long");
            return false;

        }
      return isPalindrome(arr[number-1]);
    }

    private static boolean isPalindrome(String str){
        char[] arr = str.toCharArray();
        int size = arr.length/2;
        for(int i = 0;i<size;i++){
            if(arr[i] != arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
