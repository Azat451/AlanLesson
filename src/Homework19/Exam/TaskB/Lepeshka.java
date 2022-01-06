package Homework19.Exam.TaskB;

public class Lepeshka extends Bread{
    private double radius;
    private String bake;
    private String pack;
    private String drawPrints;
    private String varnish;

    public Lepeshka(double weight, double price, String productCompany, double radius) {
        super(weight, price, productCompany);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getBake() {
        bake = "Лепешка готова";
        return bake;
    }

    @Override
    public void setBake(String bake) {
        this.bake = bake;
    }

    @Override
    public String getPack() {
        pack = "Лепешка упакована";
        return pack;
    }

    @Override
    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getDrawPrints() {
        drawPrints = "Нанести узоры на лепешку";
        return drawPrints;
    }

    public void setDrawPrints(String drawPrints) {
        this.drawPrints = drawPrints;
    }

    public String getVarnish() {
        varnish = "Узоры нанесены на лепешку";
        return varnish;
    }

    public void setVarnish(String varnish) {
        this.varnish = varnish;
    }

        public String toString(){
        if (weight == 0.0){
            System.out.println("Лепешка фальшивая!");
        }else if (weight == 200.0){
            System.out.println(getWeight());
        }
        return String.format("Хлебобулочное изделие: Лепешка\n" +
                "Вес - %s\n" +
                "Радиус - %s\n" +
                "Ценна - %s\n" +
                "Производитель - %s\n" +
                "bake : %s\n" +
                "pack : %s\n" +
                "drawPrints: %s\n" +
                "varnish %s\n",weight,radius,price,productCompany,getBake(),getPack(),getDrawPrints(),getVarnish());
    }
}
