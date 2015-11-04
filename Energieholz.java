
public class Energieholz implements Etikett{

    private int laenge;
    private String datum;
    private Etikett alt;
    private int volumen;

    /**
     * Konstruktor der Rundholz Klasse
     *
     * @param (laenge) int Wert welcher die Länge des Holzstückst angibt (in cm)
     * @param (datum) String der das Datum der letzten etikettierung angibt
     * @param (alt) Etikett des vorherigen Holzes aus welchem dieses entstanden ist, wenn dieses nicht existiert null
     * @param (volumen) int Wert welcher das Volumen des Holzes angibt (in cm^3)
     **/
    public Energieholz(int laenge, String datum, Etikett alt, int volumen){
        this.laenge = laenge;
        this.datum = datum;
        this.alt = alt;
        this.volumen = volumen;
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
        // Rundholz, Energieholz
    }

    hacken(){
        // ????????
    }
}
