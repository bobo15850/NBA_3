package common.statics;

public class Field {
	private String field;

	private Field(String field) {
		this.field = field;
	}

	public String toString() {
		return this.field;
	}

	public static final Field playerId = new Field("playerId");
	public static final Field teamName = new Field("teamName");
	public static final Field date = new Field("date");
	public static final Field season = new Field("season");
	public static final Field isPlayOff = new Field("isPlayOff");
	public static final Field playerName = new Field("playerName");
	public static final Field age = new Field("age");
	public static final Field position = new Field("position");
	// 普通赛季数据
	public static final Field numOfGame = new Field("numOfGame");
	public static final Field numOfStart = new Field("numOfStart");
	public static final Field minute = new Field("minute");
	public static final Field totalHit = new Field("totalHit");
	public static final Field totalShot = new Field("totalShot");
	public static final Field shot = new Field("shot");
	public static final Field threeHit = new Field("threeHit");
	public static final Field threeShot = new Field("threeShot");
	public static final Field three = new Field("three");
	public static final Field twoShot = new Field("twoShot");
	public static final Field twoHit = new Field("twoHit");
	public static final Field two = new Field("two");
	public static final Field shotEFF = new Field("shotEFF");
	public static final Field freeHit = new Field("freeHit");
	public static final Field freeShot = new Field("freeShot");
	public static final Field free = new Field("free");
	public static final Field offRebound = new Field("offRebound");
	public static final Field defRebound = new Field("defRebound");
	public static final Field totRebound = new Field("totRebound");
	public static final Field assist = new Field("assist");
	public static final Field steal = new Field("steal");
	public static final Field block = new Field("block");
	public static final Field fault = new Field("fault");
	public static final Field foul = new Field("foul");
	public static final Field point = new Field("point");
	// 高级赛季数据
	public static final Field playerEFF = new Field("playerEFF");
	public static final Field realShot = new Field("realShot");
	public static final Field threeEFF = new Field("threeEFF");
	public static final Field freeEFF = new Field("freeEFF");
	public static final Field offReboundEFF = new Field("offReboundEFF");
	public static final Field defReboundEFF = new Field("defReboundEFF");
	public static final Field totReboundEFF = new Field("totReboundEFF");
	public static final Field assistEFF = new Field("assistEFF");
	public static final Field stealEFF = new Field("stealEFF");
	public static final Field blockEFF = new Field("blockEFF");
	public static final Field faultEFF = new Field("faultEFF");
	public static final Field useEFF = new Field("useEFF");
	public static final Field offWinShare = new Field("offWinShare");
	public static final Field defWinShare = new Field("defWinShare");
	public static final Field winShare = new Field("winShare");
	public static final Field winSharePer48 = new Field("winSharePer48");
	public static final Field offBoxPM = new Field("offBoxPM");
	public static final Field defBoxPM = new Field("defBoxPM");
	public static final Field BoxPM = new Field("BoxPM");
	public static final Field replaceValue = new Field("replaceValue");

	public static final Field[] player_sort_fields = { Field.teamName, Field.age, Field.position, Field.numOfGame, Field.numOfStart, Field.minute, Field.point, Field.shot, Field.totRebound,
			Field.assist, Field.steal, Field.block, Field.fault, Field.foul, Field.totalHit, Field.totalShot, Field.threeHit, Field.threeShot, Field.three, Field.twoShot, Field.twoHit, Field.two,
			Field.shotEFF, Field.freeHit, Field.freeShot, Field.free, Field.offRebound, Field.defRebound, Field.playerEFF, Field.realShot, Field.threeEFF, Field.freeEFF, Field.offReboundEFF,
			Field.defReboundEFF, Field.totReboundEFF, Field.assistEFF, Field.stealEFF, Field.blockEFF, Field.faultEFF, Field.useEFF, Field.offWinShare, Field.defWinShare, Field.winShare,
			Field.winSharePer48, Field.offBoxPM, Field.defBoxPM, Field.BoxPM, Field.replaceValue };
	public static final Field[] player_advanced_selection_fields = { Field.numOfGame, Field.numOfStart, Field.minute, Field.point, Field.shot, Field.totRebound, Field.assist, Field.steal,
			Field.block, Field.fault, Field.foul, Field.totalHit, Field.totalShot, Field.threeHit, Field.threeShot, Field.three, Field.twoShot, Field.twoHit, Field.two, Field.shotEFF, Field.freeHit,
			Field.freeShot, Field.free, Field.offRebound, Field.defRebound, Field.playerEFF, Field.realShot, Field.threeEFF, Field.freeEFF, Field.offReboundEFF, Field.defReboundEFF,
			Field.totReboundEFF, Field.assistEFF, Field.stealEFF, Field.blockEFF, Field.faultEFF, Field.useEFF, Field.offWinShare, Field.defWinShare, Field.winShare, Field.winSharePer48,
			Field.offBoxPM, Field.defBoxPM, Field.BoxPM, Field.replaceValue };
}
