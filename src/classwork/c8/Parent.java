package classwork.c8;

public class Parent {
    protected String value = "I am String value";
    public Parent(){
        System.out.println("This is my default constrictor");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
