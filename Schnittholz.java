
public class Schnittholz implements Etikett{

    private int laenge;
    private String datum;
    private Etikett alt;
    private double dicke;
    private double breite;

    /**
     * Konstruktor der Rundholz Klasse
     *
     * @param (laenge) int Wert welcher die Länge des Holzstückst angibt (in cm)
     * @param (datum) String der das Datum der letzten etikettierung angibt
     * @param (alt) Etikett des vorherigen Holzes aus welchem dieses entstanden ist, wenn dieses nicht existiert null
     * @param (breite) double Wert welcher die Breite des Holzstücks angibt (in cm)
     * @param (dicke) double Wert welcher die Dicke des Holzstücks angibt (in cm)
     **/
    public Schnittholz(int laenge, String datum, Etikett alt, double breite, double dicke){
        this.laenge = laenge;
        this.datum = datum;
        this.alt = alt;
        this.breite = breite;
        this.dicke = dicke;
    }

    @Override
    public int laenge() {
        return this.laenge;
    }

    @Override
    public String datum(){
        return this.datum;
    }

    @Override
    public Etikett alt() {
        return this.alt;
    }

    neu(){
        // Schnittholz, Bauholz, Energieholz
    }

    saegen(){   // bekommt array
        // Schnittholz, Energieholz
    }
}
