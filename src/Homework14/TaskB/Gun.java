package Homework14.TaskB;

public class Gun {
    String name;
    String tipeName;
    String nameBullet;
    int countOfBullet;
    String modification;
    String nameOwner;

    public static void main(String[] args) {
        Gun PPSH = new Gun();
        PPSH.name = "П.П.Ш.";
        PPSH.tipeName = "пистолет пулемет";
        PPSH.nameBullet = "99 mm";
        PPSH.countOfBullet = 40;
        PPSH.modification = "барабанный магазин 120 патронов, и прицельное приспособление,рукаять";
        PPSH.nameOwner = "Сергей Шарапов";
        System.out.println(PPSH.name+"\n"
                +PPSH.tipeName+"\n"
                +PPSH.nameBullet+"\n"
                +PPSH.countOfBullet+" В магазине\n"
                +PPSH.modification+"\n"
                + PPSH.nameOwner);
        System.out.println();
        Gun Magnum44 = new Gun();
        Magnum44.name = "Магнум 44";
        Magnum44.tipeName ="револьвер";
        Magnum44.nameBullet ="458 - Hunters Bullets";
        Magnum44.countOfBullet = 6;
        Magnum44.modification ="улчшенный барабан";
        Magnum44.nameOwner ="Грязный Гарри";
        System.out.println(Magnum44.name+"\n"
                +Magnum44.tipeName+"\n"
                +Magnum44.nameBullet+"\n"
                +Magnum44.countOfBullet+" в барабанне\n"
                +Magnum44.modification+"\n"
                + Magnum44.nameOwner);

    }

}
