package Homework19.Exam.TaskB;

public class Pita extends Bread{
    //это лаваш
    private String bake;
    private String pack;
    private String tradeName;

    public Pita(double weight, double price, String productCompany,String tradeName) {
        super(weight, price, productCompany);
        this.tradeName = tradeName;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    @Override
    public String getBake() {
        bake = "Лаваш готов!\nЯ Лавашик меня испекли ^u^";
        return bake;
    }

    @Override
    public void setBake(String bake) {
        this.bake = bake;
    }

    @Override
    public String getPack() {
        pack = "Лаваш упакован!";
        return pack;
    }

    @Override
    public void setPack(String pack) {
        this.pack = pack;
    }

    public String toString(){
        return String.format("Хлебобулочное изделие: %sЛаваш\n" +
                "Вес - %s\n" +
                "Ценна - %s\n" +
                "Производитель - %s\n" +
                "bake : %s\n" +
                "wrapUp : %s\n",tradeName,weight,price,productCompany,getBake(),getPack());
    }
}
