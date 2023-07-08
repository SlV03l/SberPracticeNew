package org.sber.pizza;

public class PizzaOrder {
    private String name;
    private Size size;
    private boolean sauce;
    private String address;
    private boolean orderAccepted;

    public enum Size {
        SMALL("Маленькая"),
        MEDIUM("Средняя"),
        BIG("Большая");

        private final String label;

        Size(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    public PizzaOrder (String name, Size size, boolean sauce, String address) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean getSauce() {
        return sauce;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void order() {
        if (orderAccepted){
            System.out.println("Заказ уже принят");
        } else {
            orderAccepted = true;
            System.out.println("Заказ принят. " +
                    size.toString() +
                    " пицца «" +
                    name + "» " +
                    (sauce ? "с соусом " : "") +
                    "на адрес " + address + ".");
        }
    }

    public void cancel() {
        if (orderAccepted) {
            orderAccepted = false;
            System.out.println("Заказ отменен");
        } else {
            System.out.println("Заказ не был принят");
        }
    }

    @Override
    public String toString() {
        return "PizzaOrder: [" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", sauce=" + sauce +
                ", address='" + address + "'].";
    }
}