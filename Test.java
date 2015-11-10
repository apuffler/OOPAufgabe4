/*
Erste Überlegungen zur Herangehensweise sowie Diskussion über das Verständnis der Angabe erfolgten als Teamarbeit, sowie das Klassendiagramm.

Armin Puffler (1225268): Weitere Planung, Sägerundholz, Industrieholz, Vollkantschnittholz, Hackschnitzel
Jovan Zivanovic (1426514):
Stefan Buttenhauser (0926720): 

*/

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

		//Nun erstellen wir ein Energieholz und versuchen es zu einem Brett zu machen, was nicht gehen sollte
		Energieholz eHolz2 = new Energieholz(200, "20-01-2013", null, 20);
		System.out.println("Energieholz -> Brett: ");
		try{
			Brett brett2 = (Brett)eHolz2.neu(new Brett(200, "21-01-2013", eHolz2, 20, 2));
		}catch(IllegalArgumentException ie){
			System.out.println("Energieholz kann nicht zu einem Brett werden!");
		}

		//Es wird ein Schnittholz erzeugt und die Daten danach ausgegeben
		Schnittholz schnitt1 = new Schnittholz(10, "11-09-2001", null, 10, 20);
		System.out.println("Schnittholz: ");
		System.out.println("\tDatum: " + schnitt1.datum());
		System.out.println("\tLänge: " + schnitt1.laenge());
		System.out.println("\tBreite: " + schnitt1.breite());
		System.out.println("\tDicke: " + schnitt1.dicke());

		//Wir sägen nun das Schnittholz in 10 Bretter
		Brett schnittBretter[] = new Brett[10];
		for(int i = 0; i < 10; ++i){
			schnittBretter[i] = new Brett(1, "12-09-2001", null, 10, 20);
		}
		schnitt1.saegen(schnittBretter);

		//Wenn die Methode saegen funktioniert, sollte die Membervariable alt von den Brettern auf schnitt1 gesetzt sein	
		boolean falschesSaegen = true;
		System.out.println("Sind diese Bretter aus dem Schnittholz hergestellt?");
		for(int i = 0; i < 10; ++i){
			if(schnittBretter[i].alt() != schnitt1)
				falschesSaegen = false;
		}

		if(falschesSaegen){
			System.out.println("Dieses Brett ist vom Schnittholz entstanden");
		}else{
			System.out.println("Dieses Brett ist nicht aus dem Schnittholz entstanden");
		}
		
		//Ein Industrieholz wird angeleg und gemahlen, dannach werden seine Daten ausgegeben
		Hackschnitzel haecksel = new Hackschnitzel();
		Industrieholz indh2 = new Industrieholz(10, "01-01-2001", null, 34);
		indh2.mahlen(haecksel);

		System.out.println("Industrieholz nach dem Mahlen: ");
		System.out.println("Länge: " + indh2.laenge());
		System.out.println("Staerke: " + indh2.staerke());
		System.out.println("Das mahlen von einem Industrieholz erzeugt " + haecksel.volumen() + " cm² Holzschnitzel");	

		//Anlegen von einem Rundholz und umwandeln in ein BauRundholz
		Rundholz rund1 = new Rundholz(10, "09-10-2002", null, 34.3);
		BauRundholz bau1 = new BauRundholz(10, "10-10-2002", null, 34.3);
		try{
			bau1 = (BauRundholz)rund1.neu(bau1);
			System.out.println("Rundholz erfolgreich in BauRundholz umgewandelt");
		}catch(IllegalArgumentException ie){
			System.out.printl("Rundholz konnte nicht in BauRundholz umgewandelt werden");
		}
		



	}
}