package Flight;
public class Pegasus extends FlightC implements CateringService {


    @Override
    public int abroadCatering() {
        System.out.println("Yiyecek ve içecek servimiz bulunmaktadır.");

    @Override
    public void domesticCatering() {

        System.out.println("Yiyecek ve içecek servimiz bulunmaktadır.");

    }

    @Override
        public int ticketPrice(boolean business) {

            setBusiness(business);
            if (isBusiness()){
                int price=(5*getBusinessPrice());
                return price;
            }
            else {
                return super.getEconomicPrice();
            }

    }
}