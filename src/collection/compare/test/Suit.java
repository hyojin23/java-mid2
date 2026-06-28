package collection.compare.test;

public enum Suit {
    SPADE(1, "스페이드", "\u2660"),
    HEART(2, "하트", "\u2665"),
    DIAMOND(3, "다이아몬드", "\u2666"),
    CLUB(4, "클로버", "\u2663");

    private final int order;
    private final String displayName;
    private final String symbol;

    Suit(int order, String displayName, String symbol) {
        this.order = order;
        this.displayName = displayName;
        this.symbol = symbol;
    }

    public int getOrder() {
        return order;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSymbol() {
        return symbol;
    }
}
