/*
 */

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Producto {

    private int id;
    private String name;
    private int category;
    private double price;
    private int aisle;
    private int bin;

    public Producto() {
    }

    public Producto(int id, String name, int category, double price, int aisle, int bin) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.aisle = aisle;
        this.bin = bin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        if (category >= 0 && category <= 9) {
            this.category = category;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        String n = String.valueOf(price);
        if (n.length() == 3) {
            n.substring(0, 3);
        }
        this.price = Double.parseDouble(n);
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        String n = String.valueOf(aisle);
        if (n.length() == 2) {
            this.aisle = aisle;
        }
    }

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        String n = String.valueOf(bin);
        if (n.length() == 2) {
            this.bin = bin;
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", aisle=" + aisle + ", bin=" + bin + '}';
    }
    

}
