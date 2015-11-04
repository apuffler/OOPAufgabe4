
public class Rundholz implements Etikett{

    private int laenge;
    private String datum;
    private Etikett alt;
    private double staerke;

    /**
     * Konstruktor der Rundholz Klasse
     *
     * @param (laenge) int Wert welcher die Länge des Holzstückst angibt (in cm)
     * @param (datum) String der das Datum der letzten etikettierung angibt
     * @param (alt) Etikett des vorherigen Holzes aus welchem dieses entstanden ist, wenn dieses nicht existiert null
     * @param (staerke) double Wert welcher den Durchmesser des Holzes angibt (in cm)
     **/
    public Rundholz(int laenge, String datum, Etikett alt, double staerke){
        this.laenge = laenge;
        this.datum = datum;
        this.alt = alt;
        this.staerke = staerke;
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

    }

}
