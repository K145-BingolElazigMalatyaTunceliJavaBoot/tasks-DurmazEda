import java.util.Random;

public class Question1 {

    public static void main(String[]args){

        Random random = new Random();
        int point = random.nextInt(100);

        if (point > 0 && point < 35) {

            System.out.println(point + " " + " Harf karşılığı: FF");

        } else if (point > 35 && point < 50) {

            System.out.println(point + " " + " Harf karşılığı: DC");

        } else if (point > 50 && point < 70) {

            System.out.println(point + " " +  "Harf karşılığı: BB");

        } else if (point > 70 && point < 100) {

            System.out.println(point + " " + "Harf karşılığı: AA");

        }
    }



}
