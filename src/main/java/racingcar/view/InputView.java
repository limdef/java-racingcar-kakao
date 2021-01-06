package racingcar.view;

import racingcar.util.StringUtil;

import java.util.Scanner;

public class InputView {

    private static Scanner sc = new Scanner(System.in);

    public static String[] getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return StringUtil.splitComma(sc.next());
    }

    public static int getTryNo() {
        System.out.println("시도할 회수는 몇회인가요?");
        return sc.nextInt();
    }
}