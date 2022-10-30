package homework2;

public class Hatckback extends Cars{
    @Override
    public int getMonthlyRental() {
        System.err.println("Hatchback tipi araç aylık kiralama yapılmaz");
        return -1;
    }
}
