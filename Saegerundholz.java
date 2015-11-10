
//GOOD: Using inheritance to simplify
import java.lang.Math;
public class Saegerundholz extends Rundholz
{


	

	/**
	 * Saegerundholz describes a type of Rundholz with high quality and strength.
 	 * GOOD: Weak coupling
 	 * @param (laenge): int laenge must be >= 0
 	 * @param (datum):  String datum must be valid
 	 * @param (alt): Etikett alt must be NULL if there is no previous Etikett
 	 * @param (staerke): double staerke must be >= 30 and <= 35.
 	 */

	public Saegerundholz(int laenge, String datum, Etikett alt, double staerke )
	{
		super(laenge, datum, alt, staerke);
	}


	/**
	 *@param (datum) Das datum des Etiketts
	 *@param (schnittholz) Die zu fertigenden schnitthölzer. This must NOT be NULL.
	 *@param (energieholz) Die zu fertigenden energiehölzer. This must NOT be NULL.
	 */
	public void saegen(  String datum, Schnittholz[] schnittholz, Energieholz[] energieholz)

	{
		

		//Calculating Area of all schnitthoelzer, trusting that they can be made of this Saegerundholz


		double schnittholzArea = 0;
		for (Schnittholz s : schnittholz)
		{
			schnittholzArea += s.breite * s.dicke;
		}
		double schnittholzVolume = schnittholzArea * laenge;


		//Calculate Volumen of Saegerundholz
		double rundholzVolume = Math.PI * Math.pow((this.staerke/2),2) * laenge;
		double rundholzArea = Math.PI * Math.pow((this.staerke/2),2);

		if (schnittholzArea > rundholzArea)
		{
			throw new IllegalArgumentException("Too many/big Schnitthoelzer for this Saegerundholz!");
		}

		for (Schnittholz s : schnittholz)
		{
			s.laenge = this.laenge;

		}

		for (Energieholz e : energieholz)
		{
			e.laenge = this.laenge;
			e.volumen = (int)(Math.round((rundholzVolume - schnittholzVolume) / this.laenge));

		}

		
	}

	
	public BauRundholz schaelen()
	{
		return new BauRundholz(this.laenge, this.datum, this.alt, this.staerke);
	}
	


}