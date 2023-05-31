package homework.h17;

import java.util.List;
import java.util.Optional;

public class Document {
    List<String> documents;
    String phoneNumber;
    String email;

    public Document(List<String> documents, String phoneNumber, String email) {
        this.documents = documents;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documents=" + documents +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
