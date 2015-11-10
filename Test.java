public class Test{
	public static void main(String[] args){
		//Test 1 Erzeuge einfaches EnergieholzEtikett
		Energieholz eHolz1 = new Energieholz(100, "10-11-2014", null, 1000);
		System.out.println("EnergierundHolz: ");
		System.out.println("\tDatum: " + eHolz1.datum());
		System.out.println("\tLänge: " + eHolz1.laenge());
		System.out.println("\tVolumen: " + eHolz1.volumen());
		//Funktioniert problemlos 

		//Das Energieholz wurde nun etwas verkürzt, daher muss es ein neues Etikett bekommen
		eHolz1 = (Energieholz)eHolz1.neu(new Energieholz(90, "11-11-2014", eHolz1, 900));
		//Dann wird das Holz gesägt und ist danach nicht mehr etikettierbar
		eHolz1.hacken();
		//Nun werden alle alten Etiketten des Holzes ausgegeben und die Länge des Holzes
		for(Etikett e = eHolz1; e != null; e = e.alt()){
			System.out.println("Datum: " + e.datum() + "  Länge: " + e.laenge());
		}

		//Nun wird das Energieholz in ein Industrieholz verarbeitet und anschließend werden Daten über das Holz ausgegeben
		System.out.println("Energieholz -> Industrieholz: ");		
		Industrieholz indh1 = (Industrieholz)eHolz1.neu(new Industrieholz(90, "13-11-2014", eHolz1, 32.4));

		System.out.println("\tDatum: " + indh1.datum());
		System.out.println("\tLänge: " + indh1.laenge());
		System.out.println("\tStärke: " + indh1.staerke());
	}
}