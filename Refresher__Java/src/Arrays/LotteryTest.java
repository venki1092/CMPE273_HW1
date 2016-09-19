package Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class LotteryTest {

	@Test
	public void testScenario1() {
		Lottery l = new Lottery();
		l.addLotteryPlayer(new LotteryPlayer(1001, "Venkatesh Ramanujam", 2008));
		l.addLotteryPlayer(new LotteryPlayer(1002, "Venkatesh Ramanujam1", 2009));
		l.addLotteryPlayer(new LotteryPlayer(1003, "Venkatesh Ramanujam2", 2010));
		l.addLotteryPlayer(new LotteryPlayer(1004, "Venkatesh Ramanujam3", 2011));
		l.addLotteryPlayer(new LotteryPlayer(1005, "Venkatesh Ramanujam4", 2012));
		l.addLotteryPlayer(new LotteryPlayer(1006, "Venkatesh Ramanujam5", 2013));
		l.addLotteryPlayer(new LotteryPlayer(1007, "Venkatesh Ramanujam6", 2014));
		l.addLotteryPlayer(new LotteryPlayer(1008, "Venkatesh Ramanujam7", 2015));
		l.addLotteryPlayer(new LotteryPlayer(1009, "Venkatesh Ramanujam8", 2016));
		l.addLotteryPlayer(new LotteryPlayer(1010, "Venkatesh Ramanujam9", 2017));
		l.addLotteryPlayer(new LotteryPlayer(1011, "Venkatesh Ramanujam10", 2018));
		LotteryPlayer[] winners = l.decideLotteryWinners();
		l.printWinners();
		assertEquals(l.getNumberOfWinners(), 3);
		assertNotEquals(winners[0].playerid, winners[1].playerid);
		assertNotEquals(winners[2].playerid, winners[1].playerid);
	}
	@Test
	public void testScenario2() {
		Lottery l = new Lottery();
		l.addLotteryPlayer(new LotteryPlayer(1001, "Venkatesh Ramanujam", 2008));
		l.addLotteryPlayer(new LotteryPlayer(1002, "Venkatesh Ramanujam1", 2009));
		l.addLotteryPlayer(new LotteryPlayer(1003, "Venkatesh Ramanujam2", 2010));
		LotteryPlayer[] winners = l.decideLotteryWinners();
		assertEquals(l.getNumberOfWinners(), 1);
		l.printWinners();
	}
}
