package artbrrs.model;

import java.math.BigDecimal;

public class Anuncio {

    private Product product;
    private Double price;
    private Integer qnt;

    public Anuncio(Product product, Double price, Integer qnt) {
        this.product = product;
        this.price = price;
        this.qnt = qnt;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQnt() {
        return qnt;
    }

    public void setQnt(Integer qnt) {
        this.qnt = qnt;
    }

    @Override
    public String toString() {
        return "Anuncio{" +
                "product=" + product +
                ", price=" + price +
                ", qnt=" + qnt +
                '}';
    }
}
