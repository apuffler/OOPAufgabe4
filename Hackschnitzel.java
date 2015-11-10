public class Hackschnitzel
{


	/**
	 * Hackschnitzel describes the amount of Wood which can not be used anymore (and is basically garbage).
 	 * GOOD: Singleton.
 	 */

	public double volumen;
	public Hackschnitzel()
	{
		this.volumen = 0;
	}

	public Hackschnitzel(double volumen)
	{
		this.volumen = volumen;
	}

	public void hinzufuegen(double volumen)
	{
		this.volumen = this.volumen + volumen;
	} 

}