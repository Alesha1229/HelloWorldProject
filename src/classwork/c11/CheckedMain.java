package classwork.c11;

public class CheckedMain {
    public static void main(String[] args) {
        int result;
        try {
            result = 1 / 0;    // пробуем, будет ли тут ошибка
            try {

            } catch (Exception e){ //можно в один try вкладывать несколько
        }
        } catch (ArithmeticException | IndexOutOfBoundsException e){ // если ошибка есть, выполняется catch(чёрточка значит:или то, или то)
            System.out.println("Oops1");
            result=0;

        } catch (Exception e){ // catch может быть много
        System.out.println("Oops2");
        result=0;

    }
        finally {
            System.out.println("This is end of try block!!"); // выводится, если есть ошибка, или же нет
        }
        System.out.println(result);
    }

}
