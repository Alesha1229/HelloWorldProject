package classwork.c18.JsonExample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class JsonExample {
    public static void main(String[] args) throws JsonProcessingException {


        Person person = new Person(1,"Anton2", Arrays.asList("write","dance"), false);
        // чтение
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
        System.out.println(result);
        // запись
        Person currentPerson = mapper.readValue(result, Person.class);
        System.out.println(currentPerson);
    }
}
