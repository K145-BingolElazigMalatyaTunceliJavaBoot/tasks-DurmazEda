package Flight;


public class Thy extends FlightC implements CateringService{
    @Override
    public int abroadCatering() {
        System.out.println("We have tea and coffee service.");

        return 0;
    }



    @Override
    public void domesticTreats() {
        System.out.println("We have catering.");
    }

    @Override
    public int ticketPrice(boolean business) {
        setBusiness(business);

        if (isBusiness()) {

        setBusinessPrice(1200);
        int businessPrice = getBusinessPrice();
        return businessPrice;

    } else {
        setEconomicPrice(600);
        return getEconomicPrice();
    }
}
}