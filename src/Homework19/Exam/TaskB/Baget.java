package Homework19.Exam.TaskB;

public class Baget extends Bread{
    private String lenght;
    private int longitudinalScars;
    private String tradeName;
    private String bake;
    private String scar;
    private String pack;

    public Baget(double weight, double price, String productCompany,String tradeName, String lenght, int longitudinalScars) {
        super(weight, price, productCompany);
        this.tradeName = tradeName;
        this.lenght = lenght;
        this.longitudinalScars = longitudinalScars;
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public int getLongitudinalScars() {
        return longitudinalScars;
    }

    public void setLongitudinalScars(int longitudinalScars) {
        this.longitudinalScars = longitudinalScars;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    @Override
    public String getBake() {
        bake = "Багет испекся";
        return bake;
    }

    @Override
    public void setBake(String bake) {
        this.bake = bake;
    }

    public String getPack() {
        pack = "Только в экологический пакет\nБагет упаковали";
        return pack;
    }

    public String getScar() {
        scar = "Рубцевать\nВ итоге рубцов - " + longitudinalScars;
        return scar;
    }

    public void setScar(String scar) {
        this.scar = scar;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String toString(){
        return String.format("Хлебобулочное изделие: %sБагет\n" +
                "Вес - %s\n" +
                "Длинна - %s\n" +
                "Ценна - %s\n" +
                "Производитель - %s\n" +
                "bake : %s\n" +
                "scar : %s\n" +
                "pack : %s",tradeName,weight,lenght,price,productCompany,getBake(),getScar(),getPack());
    }
}
