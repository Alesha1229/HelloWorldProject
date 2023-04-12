package classwork.c8;

public class BadParent implements Personable {
    private String name;

    public String getName() {
        return "this is bad papa" + name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
