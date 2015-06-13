package beans;

public class SeasonPlayer extends Bean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 主键
	protected String playerId;// 球员编号
	protected String season;// 赛季
	protected String teamName;// 球队名称
	protected int isPlayOff;// 是否为季后赛
	// 求普通赛季数据
	private String playerName;// 球员名称
	private double age;// 年龄
	private String position;// 位置
	private double numOfGame;// 参赛场数
	private double numOfStart;// 首发次数
	private double minute;// 上场时间
	private double totalHit;// 总命中数
	private double totalShot;// 总出手数
	private double shot;// 总命中率
	private double threeHit;// 三分命中数
	private double threeShot;// 三分出手数
	private double three;// 三分命中率
	private double twoShot;// 两分出手数
	private double twoHit;// 两分命中数
	private double two;// 两分命中率
	private double shotEFF;// 投篮效率
	private double freeHit;// 罚球命中数
	private double freeShot;// 罚球出手数
	private double free;// 罚球命中率
	private double offRebound;// 前场篮板
	private double defRebound;// 后场篮板
	private double totRebound;// 总篮板
	private double assist;// 助攻数
	private double steal;// 抢断数
	private double block;// 盖帽数
	private double fault;// 失误
	private double foul;// 犯规
	private double point;// 得分
	// 球员高级赛季数据
	private double playerEFF;// 球员效率值
	private double realShot;// 真实命中率
	private double threeEFF;// 三分效率
	private double freeEFF;// 罚球效率
	private double offReboundEFF;// 进攻篮板效率
	private double defReboundEFF;// 防守篮板效率
	private double totReboundEFF;// 总篮板效率
	private double assistEFF;// 助攻效率
	private double stealEFF;// 抢断效率
	private double blockEFF;// 盖帽效率
	private double faultEFF;// 失误率
	private double useEFF;// 使用率
	private double offWinShare;
	private double defWinShare;
	private double winShare;
	private double winSharePer48;
	private double offBoxPM;// 进攻贡献值
	private double defBoxPM;// 防守贡献值
	private double BoxPM;// 贡献值
	private double replaceValue;// 替换价值

	public static String getAvgSqlString() {
		String[] changedField = { "minute", "totalHit", "totalShot", "threeHit", "threeShot", "twoShot", "twoHit", "freeHit", "freeShot", "offRebound", "defRebound", "totRebound", "assist", "steal",
				"block", "fault", "foul", "point" };
		String[] unchangedField = { "playerId", "season", "teamName", "isPlayOff", "playerName", "age", "position", "numOfGame", "numOfStart", "shot", "three", "two", "free", "shotEFF", "playerEFF",
				"realShot", "threeEFF", "freeEFF", "offReboundEFF", "defReboundEFF", "totReboundEFF", "assistEFF", "stealEFF", "blockEFF", "faultEFF", "useEFF", "offWinShare", "offWinShare",
				"defWinShare", "winShare", "winSharePer48", "offBoxPM", "offBoxPM", "defBoxPM", "BoxPM", "replaceValue" };
		StringBuffer buffer = new StringBuffer();
		buffer.append("round(seasonplayer." + changedField[0]).append(" / ").append("numOfGame,2) as '").append(changedField[0]).append("'");
		for (int i = 1; i < changedField.length; i++) {
			buffer.append(",").append("round(seasonplayer." + changedField[i]).append(" / ").append("numOfGame,2) as '").append(changedField[i]).append("'");
		}
		for (int i = 0; i < unchangedField.length; i++) {
			buffer.append(",").append("seasonplayer." + unchangedField[i]);
		}
		return buffer.toString();
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getIsPlayOff() {
		return isPlayOff;
	}

	public void setIsPlayOff(int isPlayOff) {
		this.isPlayOff = isPlayOff;
	}

	public String getPlayerName() {
		if (this.playerName.contains("'")) {
			this.playerName = this.playerName.replace('\'', '-');
		}
		return playerName;
	}

	public void setPlayerName(String playerName) {
		if (playerName.contains("'")) {
			playerName = playerName.replace('\'', '-');
		}
		this.playerName = playerName;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getNumOfGame() {
		return numOfGame;
	}

	public void setNumOfGame(double numOfGame) {
		this.numOfGame = numOfGame;
	}

	public double getNumOfStart() {
		return numOfStart;
	}

	public void setNumOfStart(double numOfStart) {
		this.numOfStart = numOfStart;
	}

	public double getMinute() {
		return minute;
	}

	public void setMinute(double minute) {
		this.minute = minute;
	}

	public double getTotalHit() {
		return totalHit;
	}

	public void setTotalHit(double totalHit) {
		this.totalHit = totalHit;
	}

	public double getTotalShot() {
		return totalShot;
	}

	public void setTotalShot(double totalShot) {
		this.totalShot = totalShot;
	}

	public double getShot() {
		return shot;
	}

	public void setShot(double shot) {
		this.shot = shot;
	}

	public double getThreeHit() {
		return threeHit;
	}

	public void setThreeHit(double threeHit) {
		this.threeHit = threeHit;
	}

	public double getThreeShot() {
		return threeShot;
	}

	public void setThreeShot(double threeShot) {
		this.threeShot = threeShot;
	}

	public double getThree() {
		return three;
	}

	public void setThree(double three) {
		this.three = three;
	}

	public double getTwoShot() {
		return twoShot;
	}

	public void setTwoShot(double twoShot) {
		this.twoShot = twoShot;
	}

	public double getTwoHit() {
		return twoHit;
	}

	public void setTwoHit(double twoHit) {
		this.twoHit = twoHit;
	}

	public double getTwo() {
		return two;
	}

	public void setTwo(double two) {
		this.two = two;
	}

	public double getShotEFF() {
		return shotEFF;
	}

	public void setShotEFF(double shotEFF) {
		this.shotEFF = shotEFF;
	}

	public double getFreeHit() {
		return freeHit;
	}

	public void setFreeHit(double freeHit) {
		this.freeHit = freeHit;
	}

	public double getFreeShot() {
		return freeShot;
	}

	public void setFreeShot(double freeShot) {
		this.freeShot = freeShot;
	}

	public double getFree() {
		return free;
	}

	public void setFree(double free) {
		this.free = free;
	}

	public double getOffRebound() {
		return offRebound;
	}

	public void setOffRebound(double offRebound) {
		this.offRebound = offRebound;
	}

	public double getDefRebound() {
		return defRebound;
	}

	public void setDefRebound(double defRebound) {
		this.defRebound = defRebound;
	}

	public double getTotRebound() {
		return totRebound;
	}

	public void setTotRebound(double totRebound) {
		this.totRebound = totRebound;
	}

	public double getAssist() {
		return assist;
	}

	public void setAssist(double assist) {
		this.assist = assist;
	}

	public double getSteal() {
		return steal;
	}

	public void setSteal(double steal) {
		this.steal = steal;
	}

	public double getBlock() {
		return block;
	}

	public void setBlock(double block) {
		this.block = block;
	}

	public double getFault() {
		return fault;
	}

	public void setFault(double fault) {
		this.fault = fault;
	}

	public double getFoul() {
		return foul;
	}

	public void setFoul(double foul) {
		this.foul = foul;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public double getPlayerEFF() {
		return playerEFF;
	}

	public void setPlayerEFF(double playerEFF) {
		this.playerEFF = playerEFF;
	}

	public double getRealShot() {
		return realShot;
	}

	public void setRealShot(double realShot) {
		this.realShot = realShot;
	}

	public double getThreeEFF() {
		return threeEFF;
	}

	public void setThreeEFF(double threeEFF) {
		this.threeEFF = threeEFF;
	}

	public double getFreeEFF() {
		return freeEFF;
	}

	public void setFreeEFF(double freeEFF) {
		this.freeEFF = freeEFF;
	}

	public double getOffReboundEFF() {
		return offReboundEFF;
	}

	public void setOffReboundEFF(double offReboundEFF) {
		this.offReboundEFF = offReboundEFF;
	}

	public double getDefReboundEFF() {
		return defReboundEFF;
	}

	public void setDefReboundEFF(double defReboundEFF) {
		this.defReboundEFF = defReboundEFF;
	}

	public double getTotReboundEFF() {
		return totReboundEFF;
	}

	public void setTotReboundEFF(double totReboundEFF) {
		this.totReboundEFF = totReboundEFF;
	}

	public double getAssistEFF() {
		return assistEFF;
	}

	public void setAssistEFF(double assistEFF) {
		this.assistEFF = assistEFF;
	}

	public double getStealEFF() {
		return stealEFF;
	}

	public void setStealEFF(double stealEFF) {
		this.stealEFF = stealEFF;
	}

	public double getBlockEFF() {
		return blockEFF;
	}

	public void setBlockEFF(double blockEFF) {
		this.blockEFF = blockEFF;
	}

	public double getFaultEFF() {
		return faultEFF;
	}

	public void setFaultEFF(double faultEFF) {
		this.faultEFF = faultEFF;
	}

	public double getUseEFF() {
		return useEFF;
	}

	public void setUseEFF(double useEFF) {
		this.useEFF = useEFF;
	}

	public double getOffWinShare() {
		return offWinShare;
	}

	public void setOffWinShare(double offWinShare) {
		this.offWinShare = offWinShare;
	}

	public double getDefWinShare() {
		return defWinShare;
	}

	public void setDefWinShare(double defWinShare) {
		this.defWinShare = defWinShare;
	}

	public double getWinShare() {
		return winShare;
	}

	public void setWinShare(double winShare) {
		this.winShare = winShare;
	}

	public double getWinSharePer48() {
		return winSharePer48;
	}

	public void setWinSharePer48(double winSharePer48) {
		this.winSharePer48 = winSharePer48;
	}

	public double getOffBoxPM() {
		return offBoxPM;
	}

	public void setOffBoxPM(double offBoxPM) {
		this.offBoxPM = offBoxPM;
	}

	public double getDefBoxPM() {
		return defBoxPM;
	}

	public void setDefBoxPM(double defBoxPM) {
		this.defBoxPM = defBoxPM;
	}

	public double getBoxPM() {
		return BoxPM;
	}

	public void setBoxPM(double boxPM) {
		BoxPM = boxPM;
	}

	public double getReplaceValue() {
		return replaceValue;
	}

	public void setReplaceValue(double replaceValue) {
		this.replaceValue = replaceValue;
	}

}
