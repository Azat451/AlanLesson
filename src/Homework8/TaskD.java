package Homework8;

public class TaskD {
    public static void main(String[] args) {
        int potato15 = 15,potato17 = 17,potato21 = 21,potato23 = 23,potato25 = 25;
        int num = 225;int count = 0;
        for (int i = 0;i <= num/potato15;i++){
            for (int j = 0;j <= num/potato17;j++){
                for (int h = 0;h <= num/potato21;h++){
                    for (int f = 0;f <= num/potato23;f++){
                        for (int r = 0;r <= num/potato25;r++){
                            if (i*potato15 + j*potato17 + h*potato21 + f*potato23 + r*potato25 == num){
                                count++;
                                System.out.println("15kg: " + i + " ");
                                System.out.println("17kg: " + j + " ");
                                System.out.println("21kg: " + h + " ");
                                System.out.println("23kg: " + f + " ");
                                System.out.println("25kg: " + r + " ");
                            }

                        }
                    }
                }
            }
        }
    }
}
