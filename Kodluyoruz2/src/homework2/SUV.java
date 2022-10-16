package homework2;

public class SUV extends Cars{
    @Override
    public int getMonthlyRental() {
        return super.getMonthlyRental() + (100 / getAge() * 30);
    }
}
