public class Hackschnitzel
{
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