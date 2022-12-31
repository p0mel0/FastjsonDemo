package top.p0melo.demo;

import java.math.BigDecimal;

public class Apple implements Fruit{
    private BigDecimal price;

    public BigDecimal getPrice() {
        System.out.println("getgetgetPrice!");
        return price;
    }

    public void setPrice(BigDecimal price) {
        System.out.println("setsetsetPrice!");
        this.price = price;
    }
}
