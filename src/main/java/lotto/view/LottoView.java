package lotto.view;

import lotto.model.LotteryWallet;
import lotto.model.WinningLottoNumbers;
import lotto.model.WinningLottoStatus;

public class LottoView {
	public void printlnInputMoney() {
		System.out.println("구입금액을 입력해 주세요.");
	}

	public void printlnError(IllegalArgumentException e) {
		System.out.println("[ERROR] "+e);
	}

	public void printlnPurchasedLottoResult(LotteryWallet wallet) {
		System.out.printf("수동으로 %d장, 자동으로 %d개를 구매했습니다.\n", wallet.numberOfPurchasedLottoManual(), wallet.numberOfPurchasedLottoAuto());
		System.out.println(wallet.lottosStatus());
	}

	public void printlnBlank() {
		System.out.println("");
	}

	public void printlnInputWinningLottoNumbers() {
		System.out.println("지난 주 당첨 번호를 입력해 주세요.");
	}

	public void printlnWinningLottoStatus(WinningLottoStatus winningLottoStatus) {
		System.out.println("당첨 통계");
		System.out.println("---------");
		System.out.println(winningLottoStatus.status());
	}

	public void printlnWinningLottoRateOfReturn(WinningLottoStatus winningLottoStatus, int usedMoney) {
		System.out.println(String.format("총 수익률은 %.2f입니다.", winningLottoStatus.getRateOfReturn(usedMoney)));
	}

	public void printlnInputWinningBonusNumber() {
		System.out.println("보너스 볼을 입력해 주세요.");
	}

	public void printlnInputManualLottoCount() {
		System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
	}

	public void printlnPurchasedManualLotto() {
		System.out.println("수동으로 구매할 번호를 입력해 주세요.");
	}
}
