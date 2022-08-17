package Enumeration;

public enum Wochentag {
    MONTAG("MONDAY"), DIENSTTAG("THUSDAY"), MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG;

    private final String inEnglish;

    private Wochentag() {
        this("NOT DEFIND");
    }

    private Wochentag(String inEnglish) {
        this.inEnglish = inEnglish;
    }

    public String getInEnglish() {
        return inEnglish;
    }

}
