package homework.h17;

import java.util.List;
import java.util.Optional;

public class Document {
    List<String> documents;
    Optional<String> phoneNumber;
    Optional<String> email;

    public Document(List<String> documents, Optional<String> phoneNumber, Optional<String> email) {
        this.documents = documents;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


}
