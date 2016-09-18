package Stack;
import java.util.Stack;

// single lane car parking system where car at last can be removed at first and cars at first removed last
public class CarWashSystem {

	Stack s = new Stack();
	int maxNumberOfCars = 10;
	public int getCarLength(){
		return s.size();
	}
	public boolean insertCarToLane(Car c)
	{
		if(getCarLength() > maxNumberOfCars)
			return false;
		else {
			s.push(c);
			return true;
		}
	}
	public boolean washNextCar()
	{
		Car c = (Car)s.pop();
		if(c != null)
		{
			return true;
		}
		return false;
	}
}
