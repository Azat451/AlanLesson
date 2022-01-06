package Homework18.TaskA;

import java.util.Arrays;

public class Farm {
    private String AddressFarm;
    private Cow[] HerdCow;
    private Sheep[] HerdSheep;
    private Horse[] HerfHorse;
    private String FullnameFarmer;
    private String nameFarms;

    public Farm(String addressFarm, Cow[] herdCow, Sheep[] herdSheep, Horse[] herfHorse, String fullnameFarmer, String nameFarms){
        this.AddressFarm = addressFarm;
        this.HerdCow = herdCow;
        this.HerdSheep = herdSheep;
        this.HerfHorse = herfHorse;
        this.FullnameFarmer = fullnameFarmer;
        this.nameFarms = nameFarms;
    }

    public String getAddressFarm() {
        return AddressFarm;
    }

    public void setAddressFarm(String addressFarm) {
        AddressFarm = addressFarm;
    }

    public Cow[] getHerdCow() {
        return HerdCow;
    }

    public void setHerdCow(Cow[] herdCow) {
        HerdCow = herdCow;
    }

    public Sheep[] getHerdSheep() {
        return HerdSheep;
    }

    public void setHerdSheep(Sheep[] herdSheep) {
        HerdSheep = herdSheep;
    }

    public Horse[] getHerfHorse() {
        return HerfHorse;
    }

    public void setHerfHorse(Horse[] herfHorse) {
        HerfHorse = herfHorse;
    }

    public String getFullnameFarmer() {
        return FullnameFarmer;
    }

    public void setFullnameFarmer(String fullnameFarmer) {
        FullnameFarmer = fullnameFarmer;
    }

    public String getNameFarms() {
        return nameFarms;
    }

    public void setNameFarms(String nameFarms) {
        this.nameFarms = nameFarms;
    }

    @Override
    public String toString() {
        return String.format("Ферма - %s\n" +
                "Адрес фермы: %s\n" +
                "Стадо коров: %s\n" +
                "Отара овец: %s\n" +
                "Табун лошадей: %s\n" +
                "ФИО владельца фермы: %s\n",nameFarms,AddressFarm,Arrays.toString(HerdCow),Arrays.toString(HerdSheep),Arrays.toString(HerfHorse),FullnameFarmer);
    }
}
