package racingcar.domain;

import racingcar.util.StringUtil;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;
    private static final int THRESHOLD = 4;
    private final String name;
    private int location;

    public Car(String name) {
        validate(name);

        this.name = name;
    }

    public Car(String name, int location) {
        this(name);
        this.location = location;
    }

    private void validate(String name) {
        if (StringUtil.isNullOrEmpty(name)) {
            throw new IllegalArgumentException("한대 이상의 자동차를 입력해주세요.");
        }
        if (StringUtil.isOverMaxLength(name, MAX_NAME_LENGTH)) {
            throw new IllegalArgumentException("차 이름은 5자 이하여야 합니다.");
        }
    }

    public void move(int num) {
        if (isMoveFoward(num))
            this.location++;
    }

    private boolean isMoveFoward(int number) {
        if (number >= THRESHOLD)
            return true;
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int getLocation() {
        return this.location;
    }
}
