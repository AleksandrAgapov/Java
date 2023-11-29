package Shop_laptop_2;

public class Laptop {
    private static int count = 0;
    private int id;
    private String model;
    private String ram;
    private String storage;
    private String os;
    private String color;

    public Laptop(String model, String ram, String storage, String os, String color) {
        this.id = ++count;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void equals(){
        
    }
}

