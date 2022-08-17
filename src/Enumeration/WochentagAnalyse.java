package Enumeration;

public class WochentagAnalyse {

    public static void main(String[] args) {
        Wochentag montag = Wochentag.MONTAG;
        Wochentag mittwoch = Wochentag.MITTWOCH;
        Wochentag freitag = Wochentag.FREITAG;
        //System.out.println( freitag.ordinal());
        analysiereWochentag(montag);
        analysiereWochentag(mittwoch);
        analysiereWochentag(freitag);
    }

    private static void analysiereWochentag(Wochentag tag) {
        System.out.println(tag.toString() + " ist: ");
        switch (tag) {
            case FREITAG:
                System.out.println("Toll");
                break;
            case SAMSTAG:
                System.out.println("Super");
                break;
            case SONNTAG:
                System.out.println("Ziemlich gut...");
                break;
            default:
                System.out.println("so la la la....");
        }
    }

}
