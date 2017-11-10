/**
 * @(#)Book.java
 *
 *
 * @author
 * @version 1.00 2017/11/8
 */


public class laptop {
    private String model ;
    private int ipadress;

    public String model() {
        return model;
    }

    public void setmodel(String title) {
        this.model = model;
    }

    public int getipadress() {
        return ipadress;
    }

    public void setipadress(int ipadress) {
        this.ipadress = ipadress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        laptop laptop = (laptop) o;

        return ipadress == laptop.ipadress;
    }

    @Override
    public int hashCode() {
        return ipadress;
    }
}