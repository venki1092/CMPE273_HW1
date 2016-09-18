package Interface;

public class NoQuater implements LuckyWheelState {
	LuckyWheel lw;
	public NoQuater(LuckyWheel lw)
	{
		this.lw = lw;
	}
	public Boolean insertQuater(){
			lw.setHasQuaterState();
			return true;
	}
	public String turnCrank(){
		return "Please insert Quater";
	}
	public String dispatchPrize(){
		return "";
	}
}
