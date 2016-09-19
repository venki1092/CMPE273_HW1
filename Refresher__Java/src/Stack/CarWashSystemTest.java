package Stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarWashSystemTest {

	@Test
	public void addElementTest() {
		 CarWashSystem cws = new CarWashSystem();
		 cws.insertCarToLane(new Car(1,"Venkatesh"));
		 cws.insertCarToLane(new Car(2,"VenkateshRamanujam"));
		 cws.insertCarToLane(new Car(3,"Rangarajan"));
		 assertEquals(3, cws.getCarLength());
	}
	@Test
	public void scenario1() {
		 CarWashSystem cws = new CarWashSystem();
		 cws.insertCarToLane(new Car(1,"Venkatesh"));
		 cws.insertCarToLane(new Car(2,"VenkateshRamanujam"));
		 cws.insertCarToLane(new Car(3,"Rangarajan"));
		 boolean b = cws.washNextCar();
		 assertEquals(b, true);
	}
	@Test
	public void scenario2() {
		CarWashSystem cws = new CarWashSystem();
		 cws.insertCarToLane(new Car(1,"Venkatesh"));
		 cws.insertCarToLane(new Car(2,"VenkateshRamanujam"));
		 cws.insertCarToLane(new Car(3,"Rangarajan"));
		 cws.washNextCar();
		 assertEquals(2, cws.getCarLength());
	}

}
