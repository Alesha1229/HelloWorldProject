package extrawork4;

import java.util.HashMap;
import java.util.Map;

public class MapFichesExample {
    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<>();
        testMap.getOrDefault("a","not found"); // добавляет дэфолт блок, еслт не найден ключ
        testMap.putIfAbsent("a","abc"); // устанавлиывет ключу а значение abc, если до этого ключ пустой
    }
}
