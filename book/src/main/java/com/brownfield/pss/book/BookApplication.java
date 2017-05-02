package com.brownfield.pss.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages="com.brownfield.pss.book.proxy")
public class BookApplication/* implements CommandLineRunner*/{
	
	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}
	
	/*@Autowired
	InventoryRepository inventoryRepository;
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private BookingComponent bookingComponent;
	
	@Override
	public void run(String... strings) throws Exception {
		
		Inventory[] invs = { 
					new Inventory("BF100", "22-JAN-16", 100),
					new Inventory("BF101", "22-JAN-16", 100),
					new Inventory("BF102", "22-JAN-16", 100),
					new Inventory("BF103", "22-JAN-16", 100),
					new Inventory("BF104", "22-JAN-16", 100),
					new Inventory("BF105", "22-JAN-16", 100),
					new Inventory("BF106", "22-JAN-16", 100)};
		Arrays.asList(invs).forEach(inventory -> inventoryRepository.save(inventory));
				
		 
		
		BookingRecord booking = new BookingRecord("BF101", "NYC","SFO","22-JAN-16",new Date(),"101");
		Set<Passenger> passengers = new HashSet<Passenger>();
		passengers.add(new Passenger("Gean","Franc","Male", booking));
	//	passengers.add(new Passenger("Redi","Ivan","Female",booking));
	 	
		booking.setPassengers(passengers);
 		long record  = bookingComponent.book(booking);
			    
	}*/
}
