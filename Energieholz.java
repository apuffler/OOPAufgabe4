
public class Energieholz implements Etikett{

    protected int laenge;
    protected String datum;
    protected Etikett alt;
    protected int volumen;

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

    public int volumen(){
        return this.volumen;
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

    /**
     * Das Objekt wird in Hackschnitzel zerlegt welche nicht weiter etikettiert werden
     * -> Werte werden auf 0 gesetzt
     **/
    public void hacken(){
        this.laenge = 0;
        this.volumen = 0;
    }
}
