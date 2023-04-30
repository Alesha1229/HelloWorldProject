package classwork.c11;

import java.util.Scanner;

public class MyBestExceptionExample {
    public static void main (String[] args) {

        // если разбежка в большую сторону (и больше 5 лет), ошибка (видимо охренел)
        // если в меньшую сторону (и больше 5) ошибка (льстец)

        int currentAge = 30;
        System.out.println("Please? enter the guess age");
        // мы попросим человека угадать наш возраст
        Scanner scanner = new Scanner(System.in);
        int guessedAge = scanner.nextInt();
        try{
        boolean isGameContinue = checkAge(currentAge,guessedAge);

        while (isGameContinue){
            System.out.println("Again pls");
            guessedAge = scanner.nextInt();
               isGameContinue = checkAge(currentAge,guessedAge);

            }



        } catch (MyBestException e){
            System.out.println("My age is " + e.getAge() + ". " + e.getMessage());
            e.printStackTrace();

        }
    }





    private static boolean checkAge(int currentAge, int guessedAge) throws MyBestException {
        int result = currentAge - guessedAge;
        // если угадал, мы говорим что угадал
        if (result == 0){
            System.out.println("You are right");
            return false;
        }
        // если +- 5 лет, мы говорим что не угадал
        if(result>-5 && result < 5){
            System.out.println("Try again, you are close enough");
            return true;
        } if(result>5) throw new MyBestException("Not expert :)",currentAge);
        throw new MyBestException("NOT EXPERT :(",currentAge);



    }

}
