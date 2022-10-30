package Service;

import Customer.Customer;
import Customer.People;

public class RentACarService {
    public void rentACar(Customer customer){
        if(customer instanceof People){
            System.out.println("Hatchback arabalarını kiralayabilirsiniz");
        }else {
            System.out.println("Tüm arabaları kiralayabilirsiniz.");
        }
    }
}


