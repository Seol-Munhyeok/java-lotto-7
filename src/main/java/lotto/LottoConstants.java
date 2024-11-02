package lotto;

public enum LottoConstants {
    MIN_NUMBER(1),
    MAX_NUMBER(45),
    SELECTED_NUMBER_COUNT(6),
    TICKET_PRICE(1000);

    private final int value;

    LottoConstants(int value) {
       this.value = value;
    }

    public int getValue() {
        return value;
    }
}
