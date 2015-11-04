public class Brett extends Schnittholz{
	/**
	 *@param (breite) Bezeichnet die Breite des Brettes. Es wird erwartet, dass breite > 8 gilt
	 *@param (dicke)  Bezeichnet die Dicke des Brettes. Es wird erwartet, dass dicke > 0 und dicke < 4 gilt
	 */
	public Brett(int laenge, String datum, Etikett alt, double breite, double dicke){
		super(laenge, datum, alt, breite, dicke);
	}
}