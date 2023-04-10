package classwork.c7.computer;

public abstract class Comp {
    private String hdd;
    private String ram;
    protected  String username;


public  abstract void printDisplay();

    public Comp(String hdd, String ram) {
        this.hdd = hdd;
        this.ram = ram;
    }




    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }


}
