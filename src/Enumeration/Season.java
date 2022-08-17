package Enumeration;

public enum Season {

    WINTER, SPRING("Medium"),
    SUMMER("High"), FALL("Medium");
    private String expectedVisitors;

    private Season() {
        this("NOT defined");
    }

    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}