public class Product {
    Long price;
    String name;
    String size;
    Long term;

    public Product() {
    }

    public Product(Long price, String name,  String size , Long term) {
        this.price = price;
        this.name = name;
        this.size = size;
        this.term = term;
    }


    public Long getId() {
        return price;
    }

    public void setId(Long price) {
        this.price = price;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getsize() {
        return size;
    }

    public void setsize(String size) {
        this.size = size;
    }

    public Long getterm() {
        return term;
    }

    public void setterm(Long term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", term=" + term +
                '}';
    }

}
