package EqualsHashCodeToString;


public abstract class Fahrzeug implements Verkaeuflich, Cloneable {

    public static final int DEFAULT_TUNEWERT = 50;

    public static int erstellteFahrzeuge = 0;

    static {
        System.out.println("Die Fahrzeug-Klasse wurde initialisiert");
    }

    // Instanz-Variablen (Attribute, Member)
    // <Datentyp> <name> [<Zuweisung>];
    private int leistung; // PS
    private String hersteller;
    private int preis;

    // Instanz-Methoden
    // <R�ckgabedatentyp> <name> ([<Parameterliste>]) { Rumpf (Logik) }

    // Konstruktoren
    // <KlassenName> (<Parameterliste>) { Rumpf (Logik) }
    public Fahrzeug(int leistung, String hersteller, int preis) {
        this.hersteller = hersteller;
        setLeistung(leistung);
        setPreis(preis);
        erstellteFahrzeuge = erstellteFahrzeuge + 1;
        System.out.println("Es wurde soeben das " + erstellteFahrzeuge
                + ". Fahrzeug erstellt!");
    }

    public Fahrzeug(String hersteller) {
        this(100, hersteller, 0);
    }

    public static void printInfos(Fahrzeug f) {
        System.out.println("Die Leistung ist: " + f.leistung
                + ", der Hersteller ist: " + f.hersteller);
    }

    /**
     * Erh�ht die Leistung des Fahrzeugs um den angegebenen Wert (PS). Der Wert
     * muss eine nat�rliche Zahl sein.
     *
     * @param tuneWert Der Wert, um den das Fahrzeug getuned werden soll
     * @throws IllegalArgumentException Wenn der Wert keine nat�rliche Zahl ist.
     */
    public void tunen(int tuneWert) {
        if (tuneWert <= 0) {
            throw new IllegalArgumentException(
                    "Der tuneWert darf nicht negativ sein!");
        }
        leistung += tuneWert;
    }

    public void tunen() {

        tunen(DEFAULT_TUNEWERT);

    }

    // Getter:
    public int getLeistung() {
        return leistung;
    }

    // Setter:
    private void setLeistung(int leistung) {
        boolean positiv = leistung > 0;
        if (positiv) {
            this.leistung = leistung;
        } else {
            System.out
                    .println("Ung�ltiger Wert f�r die Leistung - Programm wird beendet!");
            System.exit(-1);
        }
    }

    public String getHersteller() {
        return hersteller;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Die Leistung ist: " + leistung + ", der Hersteller ist: "
                + hersteller;
    }


    public abstract void crashTest();

    @Override
    public Fahrzeug clone() {
        Fahrzeug f = null;
        try {
            f = (Fahrzeug) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return f;
    }
}