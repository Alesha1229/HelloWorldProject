package classwork.c13.examplesT;

public class CollectionsMain {
    public static void main(String[] args) {
        KeyStorage firstkey = new KeyStorage(11);
        System.out.println(firstkey);
        KeyStorage<String> secondKey = new KeyStorage<>("Abc");
        KeyStorage<Integer> thirdKey = new KeyStorage<>(111);
        System.out.println(secondKey);
        System.out.println(thirdKey);
    }
}
