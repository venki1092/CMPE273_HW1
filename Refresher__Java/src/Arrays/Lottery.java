package Arrays;

import java.util.ArrayList;

public class Lottery {
	String[] lotteryPrizes = {"iphone 6","1000 $ cash prize","500 $ cash prize"};
	LotteryPlayer[] winners = new LotteryPlayer[3];
	int numberOfWinners;
	int maxLotteryPlayers ;
	ArrayList<LotteryPlayer> lp = new ArrayList<LotteryPlayer>();

	
	public Lottery()
	{
		numberOfWinners = 0;
		maxLotteryPlayers = 50;
	}
	public int getMaxLotteryPlayers() {
		return maxLotteryPlayers;
	}

	public void setMaxLotteryPlayers(int maxLotteryPlayers) {
		this.maxLotteryPlayers = maxLotteryPlayers;
	}

	public int getNumberOfWinners() {
		return numberOfWinners;
	}

	public void setNumberOfWinners(int numberOfWinners) {
		this.numberOfWinners = numberOfWinners;
	}
	
	public boolean addLotteryPlayer(LotteryPlayer lp)
	{
		return this.lp.add(lp);
	}
	public LotteryPlayer[] decideLotteryWinners()
	{
		int groupSize = lp.size()/3;
		if(lp.size() > 8)
		{
			Double dTemp = (Math.random() * groupSize);
			winners[0] = lp.get(dTemp.intValue());
			dTemp = (Math.random() * groupSize);
			winners[1] = lp.get(dTemp.intValue() + groupSize);
			dTemp = (Math.random() * groupSize);
			winners[2] = lp.get(dTemp.intValue() + 2 * groupSize);			
			numberOfWinners = 3;
		}
		else
		{
			Double dTemp = (Math.random() * groupSize);
			winners[0] = lp.get(dTemp.intValue());
			numberOfWinners = 1;
		}		
		return winners;
	}
	public void printWinners()
	{
		for(int i = 0; i < numberOfWinners; i++ )
			System.out.println("winner:" + winners[i].playerName + " Prize:"+lotteryPrizes[i]);
	}
	
}
