
public class Schnittholz implements Etikett{

    protected int laenge;
    protected String datum;
    protected Etikett alt;
    protected double dicke;
    protected double breite;

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

    public double breite(){
        return this.breite;
    }

    public double dicke(){
        return this.dicke;
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
        if(e instanceof Kantholz){
            ((Kantholz) e).alt = this;
            return e;
        }

        if(e instanceof Brett){
            ((Brett) e).alt = this;
            return e;
        }
        if(e instanceof VollkantSchnittholz){
            ((VollkantSchnittholz) e).alt = this;
            return e;
        }
        if(e instanceof Schnittholz){
            ((Schnittholz) e).alt = this;
            return e;
        }
        if(e instanceof Energieholz){
            ((Energieholz) e).alt = this;
            return e;
        }
        throw new IllegalArgumentException("Invalid Type");
        // Schnittholz, Bauholz, Energieholz
    }

    public void saegen(Etikett[] e){   // bekommt array
        for(Etikett i: e){
            if(i instanceof Schnittholz){
                ((Schnittholz) i).alt = this;
            }else if(i instanceof Energieholz){
                ((Energieholz) i).alt = this;
            }else{
                throw new IllegalArgumentException("Invalid Type");
            }

        }
    }
}
