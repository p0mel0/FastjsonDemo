package top.p0melo.demo;

public class Store {
    private String name;

    private Fruit fruit;

    public String getName() {
        System.out.println("getgetgetName!");
        return name;
    }

    public void setName(String name) {
        System.out.println("setsetsetName!");
        this.name = name;

    }

    public Fruit getFruit() {
        System.out.println("getgetgetFruit!");
        return fruit;

    }

    public void setFruit(Fruit fruit) {
        System.out.println("setsetsetFruit!");
        this.fruit = fruit;

    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", fruit=" + fruit +
                '}';
    }
}
