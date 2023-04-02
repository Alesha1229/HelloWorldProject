package classwork.c4;

import java.util.Arrays;

public class ClassWorkFourLesson {
    public static void main(String[] args) {
        first();
        // second();
        third();


    }

   /* private static void second() {
        int[] arr3 = new int [10]; // создал масив с длиной 10

            if (arr3[i]<10) {
            }

            System.out.println("arr3[" + i + "] = " + arr3[i]);
            // System.out.println(Arrays.toString(arr3));
        }
    } */

    private static void first() {
        int[] arr = {0, 1, 2}; // первый вариант объявления
        int[] arr2 = new int[5]; // second массив размером 5
        /*System.out.println("third element:" + arr[2]); //вызвал элемент номер 2
        System.out.println("third element:" + arr2[2]);
         arr2[2] = 10; // заменили второй элемент на 10ку
        System.out.println("third element:" + arr2[2]);
        System.out.println("arr length:" + arr.length);
        Random random = new Random();
        for (int i = 0; i < arr2.length; i++) { //заполняем массив
            arr2[i] = random.nextInt(10);*/
        //System.out.println("arr2[" + i + "] = " + arr2[i]);
        //System.out.println(Arrays.toString(arr2));
        arr2[0]=7;
        arr2[1]=0;
        arr2[2]=3;
        arr2[3]=5;
        arr2[4]=6;

        int sum = 0;
        for (int val : arr2) {
            sum += val;
            //System.out.println(sum);
        }
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }



    private static void third() {


    }





}


