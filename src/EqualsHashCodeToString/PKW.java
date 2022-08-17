package EqualsHashCodeToString;

public class PKW extends Fahrzeug {


    private int anzahlTueren;

    public PKW(int leistung, String hersteller, int preis, int anzahlTueren) {

        super(leistung, hersteller, preis);
        setAnzahlTueren(anzahlTueren);

    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }

    public void setAnzahlTueren(int anzahlTueren) {
        this.anzahlTueren = anzahlTueren;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PKW)) {
            return false;
        }
        PKW o = (PKW) obj;
        if (this.getLeistung() != o.getLeistung()) {
            return false;
        }
        if (this.anzahlTueren != o.anzahlTueren) {
            return false;
        }
        if (!this.getHersteller().equalsIgnoreCase(o.getHersteller())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return getLeistung() + 11 * anzahlTueren + getHersteller().hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + ", Anzahl T�ren: " + anzahlTueren;
    }


    @Override
    public void crashTest() {
        // TODO ...
    }


}
