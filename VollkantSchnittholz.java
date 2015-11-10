public class VollkantSchnittholz extends Schnittholz
{

/**
	 * Vollkantschnittholz is a variant of Schnittholz, which is clean and flat on every sides.
 	 * GOOD: Weak coupling
 	 * @param (laenge): int laenge must be >= 0
 	 * @param (datum):  String datum must be valid
 	 * @param (alt): Etikett alt must be NULL if there is no previous Etikett
 	 * @param (breite): breite must be >= 0
 	 * @param (dicke): dicke must be >= 0
 	 */
	public VollkantSchnittholz(int laenge, String datum, Etikett alt, double breite, double dicke){
		super(laenge, datum, alt, breite, dicke);
	}


}