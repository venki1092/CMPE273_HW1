package Arrays;

public class LotteryPlayer {
	int playerid; 
	String playerName;
	int lotteryId;
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getLotteryId() {
		return lotteryId;
	}
	public void setLotteryId(int lotteryId) {
		this.lotteryId = lotteryId;
	}
	public LotteryPlayer(int playerid, String playerName, int lotteryId) {
		super();
		this.playerid = playerid;
		this.playerName = playerName;
		this.lotteryId = lotteryId;
	}
	
}
