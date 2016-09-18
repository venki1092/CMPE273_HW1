package Interface;

public class LuckyWheel {
	LuckyWheelState hasQuaterState;
	LuckyWheelState noQuaterState;
	LuckyWheelState currentState;
	public LuckyWheel(){
		hasQuaterState = new HasQuater(this);
		noQuaterState = new NoQuater(this);
		currentState = noQuaterState;
	}
	public void setHasQuaterState()
	{
		currentState = hasQuaterState;
	}
	public void setNoQuaterState()
	{
		currentState = noQuaterState;
	}
	public Boolean doInsertQuater()
	{
		return currentState.insertQuater();
	}
	public String doTurnCrank()
	{
		return currentState.turnCrank();
	}
}
