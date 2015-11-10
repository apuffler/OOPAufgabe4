public class Industrieholz extends Rundholz
{

	

	/**
	 * Industrieholz describes a type of Rundholz with low quality and strength.
 	 * GOOD: Weak coupling
 	 * @param (laenge): int laenge must be >= 0
 	 * @param (datum):  String datum must be valid
 	 * @param (alt): Etikett alt must be NULL if there is no previous Etikett
 	 * @param (staerke): double staerke must be >= 30 and <= 35.
 	 */

	public Industrieholz(int laenge, String datum, Etikett alt, double staerke)
	{
		super(laenge, datum, alt, staerke);
	}


}