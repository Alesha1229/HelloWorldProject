package ClassWork.С2;

public class HelloWorld {



    // public - видят все,
    // static - ненужный объект нашего класса,
    // void - ничего нам не возвращает
    // main- тарт приложения
    // psvm - сокращение main структуры
    public static void main(String[] args) {

// better give name, which mach with type of data

        byte a = 3;
        short b = 4;
        int c = 6;
        long e = 7;
        char letter = 'a'; // for letters

        float floatnumber =1.5f;
        double doublenumber = 1.6;

        boolean isTrue = true;
        boolean isFalse = false;

        byte number = 4;
        short biggerNumber = number;  // we can make smaller number to bigger (byte to short)

        int aa=5;
        int bb=3;
        System.out.println((double)aa/bb); // double v skobkah chto bi pokazivolo cifri posle tochki

        // sout - short version to print text
        System.out.println("Hello World");
        System.out.println(isTrue);     // ctrl+/ vse zakomentirovat\
        System.out.println("...................................................");

        int h = 1;
        System.out.println(++h);
        System.out.println(h++);
        System.out.println(h);

        h+=3; // +3 and change h

    }
}

