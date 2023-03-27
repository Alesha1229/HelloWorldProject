import java.util.Scanner;

public class ThirdLessonClasswork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("this is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("this is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("this is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("this is autumn");
                break;
        }
//        int temperature = scanner.nextInt();
//        if (temperature > 20) {
//            System.out.println("hot");
//        } else if (temperature >= 5) {
//            System.out.println("warm");
//        } else if (temperature > -100) {
//            System.out.println("cool");
//        }
//    }
//       String result = (temperature>=20) ? "hot"
//               : (temperature>=5) ? : "warm" : "cool" ;


//        System.out.println("Enter the number");
//        int myParam = scanner.nextInt();
//        System.out.println("Enter your username");
//        //String username = scanner.nextLine();
//        if (myParam > 5) {
//            System.out.println("my param is grater than 5");
//            // if (myParam>100){
//            //     System.out.println("too much");
//            // }
//        } else if (myParam > 3) {
//            System.out.println("My param is grater than 3");
//        } else if (myParam > 2) {
//            System.out.println("My param is grater than 2");
//        }


    }
}

