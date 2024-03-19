package lotto.view;

import org.kokodak.Console;

public class InputView {
    public static int moneyForPurchaseInput() {
        String moneyForPurchase = Console.readLine();
        return changeInputToInt(moneyForPurchase);
    }

    private static int changeInputToInt(String moneyForPurchase) {
        checkPossibleChangeToInt(moneyForPurchase);
        return Integer.parseInt(moneyForPurchase);
    }

    private static void checkPossibleChangeToInt(String moneyForPurchase) {
        try {
            Integer.parseInt(moneyForPurchase);
        } catch (NumberFormatException e) {
            throw new IllegalStateException("exception 문구");
        }
    }
}
