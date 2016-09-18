package Interface;

import static org.junit.Assert.*;

import org.junit.Test;

public class LuckyWheelTest {

	@Test
	public void test() {
		LuckyWheel lw = new LuckyWheel();
		lw.doInsertQuater();
		String sResult = lw.doTurnCrank();
		assertNotEquals("Please insert Quater", sResult);
		System.out.println("you have won the "+sResult);
	}
	@Test
	public void test1() {
		LuckyWheel lw = new LuckyWheel();
		//lw.doInsertQuater();
		String sResult = lw.doTurnCrank();
		assertEquals("Please insert Quater", sResult);
		//System.out.println("you have won the "+sResult);
	}

}
