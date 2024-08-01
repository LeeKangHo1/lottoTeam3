package lottoTeam3;

import java.util.ArrayList;
import java.util.List;

public class LottoRecord {
	private List<Integer> lotteryNums;
	private int lotteryBonus;
	private List<LottoData[]> buyLotto;
	private List<Integer> prizeMoney;
	private int totalPrizeMoney;

	public LottoRecord() {
		lotteryNums = new ArrayList<>();
		buyLotto = new ArrayList<>();
	}

	public void SetLottery(List<Integer> lotteryNums, int lotteryBonus) {
		this.lotteryNums = lotteryNums;
		this.lotteryBonus = lotteryBonus;
		int a = buyLotto.get(3)[2].getNums()[1];
	}

	public void addBuyLotto(LottoData[] lottoDatas) {
		buyLotto.add(lottoDatas);
	}

	public static LottoRecord tryParse(String line) {
		line.split("/");
		return null;
	}

	public boolean hasBought() {
		return !buyLotto.isEmpty();
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (LottoData[] lottoDatas : buyLotto) {
			for (LottoData lottoData : lottoDatas) {
				stringBuilder.append(lottoData).append(' ');
			}
			stringBuilder.append('\n');
		}

		return stringBuilder.toString();
	}

}