package Homework19.Exam.TaskB;

public class Bread {
    protected double weight;
    protected double price;
    protected String productCompany;
    private String bake;
    private String pack;

    public Bread(double weight, double price, String productCompany) {
        this.weight = weight;
        this.price = price;
        this.productCompany = productCompany;
    }

    public Bread() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String producerCompany) {
        this.productCompany = productCompany;
    }

    public String getBake() {
        bake = "Хлеб готов";
        return bake;
    }

    public void setBake(String bake) {
        this.bake = bake;
    }

    public String getPack() {
        pack = "Хлеб упакован";
        return pack;
    }

    public void setPack(String wrapUp) {
        this.pack = wrapUp;
    }

    @Override
    public String toString(){
        return String.format("Обычная буханка хлеба\n" +
                "Вес - %s\n" +
                "Ценна - %s\n" +
                "Производитель - %s\n" +
                "%s\n" +
                "%s\n", weight, price, productCompany,getBake(),getPack());
    }
}
