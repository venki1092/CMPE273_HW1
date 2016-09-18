package Interface;

public class HasQuater implements LuckyWheelState {
	LuckyWheel lw;
	public HasQuater(LuckyWheel lw)
	{
		this.lw = lw;
	}
	public Boolean insertQuater(){
		return false;
	}
	public String turnCrank(){
		return dispatchPrize();
	}
	public String dispatchPrize(){
		String prizes[] = {"pencils" , "card deck ", "pen drive ", "Torch ", "sticky notes ", "Apple iPad"};
		Double index = Math.random() * 6;
		lw.setNoQuaterState();
		return prizes[index.intValue()];
		
	}
}
