public class Kantholz extends VollkantSchnittholz implements Bauholz{
	
	/**
	 *@param (dicke) Für den Parameter dicke muss dicke >= 4 gelten
	 *@param (breite) Für den Parameter breite muss breite < 3 * dicke gelten
	 */
	public Kantholz(int laenge, String datum, Etikett alt, double breite, double dicke){
		super(laenge, datum, alt, breite, dicke);

	}
}