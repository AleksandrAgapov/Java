package Shop_laptop;



public class Laptop {

    int ram;
    int hdd;
    String os;
    String color;

    @Override
    public String toString() {

        return " ram: " + ram + ", hdd: " + hdd + ", OS: " + os + ", Color: " + color;
    }

    /* методы для сравнения объектов */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Laptop)) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return  hdd == laptop.hdd && os.equals(laptop.os) && color.equals(laptop.color);
    }


    @Override
    public int hashCode() {

        return ram * hdd + 2 * os.hashCode() + 3 * color.hashCode();
    }

    public int getRam(){
       return ram;
    }
    public int getHdd(){
        return hdd;
    }
    public String getOs(){
        return os;
    }
    public String getColor(){
        return color;
    }




 }

