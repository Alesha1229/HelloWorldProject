package homework.h17;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainH17 {

    public static final String DEFAULT_DOC_FORMAT = "(\\d{4}-[a-z]{3}-){2}(\\d[a-z]){2}";
    public static final String DEFAULT_PHONE_FORMAT = "(\\d{4}-[a-z]{3}-){2}(\\d[a-z]){2}";
    public static final String DEFAULT_MAIL_FORMAT = "(\\d{4}-[a-z]{3}-){2}(\\d[a-z]){2}";
    public static void main(String[] args) {
        Map<String, Document> allDocs_Numbers_Emails = new HashMap<>();

    }
    public static String docOrPhoneOrMail(String str) {
        Pattern docNumber = Pattern.compile(DEFAULT_DOC_FORMAT);
        Pattern phoneNumber = Pattern.compile(DEFAULT_DOC_FORMAT);
        Pattern mail = Pattern.compile(DEFAULT_DOC_FORMAT);

        if (docNumber.matcher(str).matches()){
            return "thisDoc";
        } else if (phoneNumber.matcher(str).matches()){
            return "thisPhone";
        } else if(mail.matcher(str).matches()){
            return "thisMail";
        } else return null;

    }
}
