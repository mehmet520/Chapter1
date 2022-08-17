package Enumeration;

public enum OnlyOne {
    ONCE(true), ONCE2(false);

    private OnlyOne(boolean b) {
        System.out.println("constructing");
    }

    public static void main(String[] args) {
        OnlyOne firstCall = OnlyOne.ONCE;    // prints constructing
        OnlyOne secondCall = OnlyOne.ONCE2;   // doesn't print anything
        OnlyOne thirdCall = OnlyOne.ONCE;

    }
}
