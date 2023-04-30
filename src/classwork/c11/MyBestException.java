package classwork.c11;

public class MyBestException extends  Exception{
    private int age;

    public MyBestException(String message, int age){
        super(message);
        this.age = age;





    }

    public int getAge() {
        return age;
    }
}
