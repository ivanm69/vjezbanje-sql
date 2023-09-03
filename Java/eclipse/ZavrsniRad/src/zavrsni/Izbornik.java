package zavrsni;

import java.util.Scanner;

public class Izbornik {

	
	private ObradaStil obradaStil;
	private ObradaPlesac obradaPlesac;
	private ObradaInstruktor obradaInstruktor;
	private ObradaTecaj obradaTecaj;
	
	
	
public ObradaStil getObradaStil() {
	return obradaStil;
}
public ObradaPlesac getobradaPlesac() {
	return obradaPlesac;
}
public ObradaInstruktor getobradaInstruktori() {
	return obradaInstruktor;
}
public  ObradaTecaj getobradatecajevi() {
	return getobradatecajevi();
}
public Izbornik() {
	obradaStil=new ObradaStil();
	obradaPlesac=new ObradaPlesac();
	obradaInstruktor=new ObradaInstruktor();
	obradaTecaj=new ObradaTecaj(this);
	Pomocno.ulaz=new Scanner(System.in);
	pozdravnaPoruka();
	prikaziIzbornik();
	Pomocno.ulaz.close();
}

private void pozdravnaPoruka() {
	System.out.println("|--------------------------------------|");
	System.out.println("| -----------------------------------  |");
	System.out.println("|  ---------------------------------   |");
	System.out.println("| --Tecaj plesa Console OOP APP v1.0-- |");
	System.out.println("|   -------------------------------    |");
	System.out.println("|  ---------------------------------   |");
	System.out.println("| -----------------------------------  |");
   System.out.println("|--------------------------------------|");
}
private void prikaziIzbornik() {
	System.out.println("Glavni izbornik");
	System.out.println("1. Stilovi");
	System.out.println("2. Plesac");
	System.out.println("3. Instruktori");
	System.out.println("4. Tecajevi");
	System.out.println("5. Izlaz iz programa");
	ucitajStavkuIzbornika();	
	
}

private void ucitajStavkuIzbornika() {
	switch(Pomocno.unosRasponBroja("Odaberi stavku izbornika", "Obavezno 1-5", 1, 5)) {
	
	case 1: 
		obradaStil.prikaziIzbornik();
		prikaziIzbornik();
		break;
	case 2:
		obradaPlesac.prikaziIzbornik();
		prikaziIzbornik();
		break;
	case 3:
		obradaInstruktor.prikaziIzbornik();
		prikaziIzbornik();
		break;
	case 4:
		obradaTecaj.prikaziIzbornik();
		prikaziIzbornik();
		break;
	case 5:
		System.out.println("Doviđenja");
		break;
	}	

}
}
	