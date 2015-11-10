
public class Rundholz implements Etikett{

    protected int laenge;
    protected String datum;
    protected Etikett alt;
    protected double staerke;

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

    public double staerke(){
        return this.staerke;
    }

    /**
     * neu Methode
     *
     * @param (e) Etikett welches dieses Element als Vorgänger zugewiesen bekommen soll
     *
     * @return liefert das neue Etikett mit dem gesetzten Wert für alt zurück
     **/
    public Etikett neu(Etikett e){
        if(e instanceof BauRundholz){
            ((BauRundholz) e).alt = this;
            return e;
        }
        if(e instanceof Energieholz){
            ((Energieholz) e).alt = this;
            return e;
        }
        if(e instanceof Saegerundholz){
            ((Saegerundholz) e).alt = this;
            return e;
        }
        if(e instanceof Industrieholz){
            ((Industrieholz) e).alt = this;
            return e;
        }
        if(e instanceof Rundholz){
            ((Rundholz) e).alt = this;
            return e;
        }
        throw new IllegalArgumentException("Invalid Type");
    }

}
