package homework.h17;

import java.util.List;
import java.util.Optional;

public class Document {
    private List<String> documents;
    private String phoneNumber;
    private String email;

    public void setDocuments(List<String> documents) {
        this.documents = documents;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
