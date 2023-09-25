package zavrsnirad.controller;

import java.util.ArrayList;
import java.util.List;
import zavrsnirad.model.Stil;

public class ObradaStil{
	
private List<Stil>stilovi;
public List<Stil>getstilovi(){
	return stilovi;
}
	
public ObradaStil() {
	stilovi = new ArrayList<>();
	if (Pomocno.dev) {
		testniPodaci();
		printTestniPodaci();
	}
}



private void printTestniPodaci() {
	for (Stil stil : stilovi) {
		System.out.println(stil.toString());
	}
}

private void testniPodaci() {
    stilovi.add(new Stil(1, "Salsa", "Lorem ipsum"));
    stilovi.add(new Stil(2, "Bachata", "Lorem ispum"));
}

public void prikaziIzbornik() {
	System.out.println("\t-- Izbornik Stilova--");
	System.out.println("1. Pregled postojećih Stilova");
	System.out.println("2. Unos novog Stila");
	System.out.println("3. Promjena postojećeg Stila");
	System.out.println("4. Brisanje postojećeg Stila");
	System.out.println("5. Povratak na prethodni izbornik");
	ucitajStavkuIzbornika();
}

private void ucitajStavkuIzbornika() {
	switch(Pomocno.unosRasponBroja("Odaberi stavku Stil Izbornika", "Odabir mora biti 1-5", 1, 5)) {
	case 1:
		pregledStilova();
		prikaziIzbornik();
		break;
	case 2: 
		dodavanjeStilova();
		prikaziIzbornik();
		break;
	case 3:
		promjenapostojecegStila();
		prikaziIzbornik();
		break;
	case 4:
		brisanjeStila();
		prikaziIzbornik();
		break;
	case 5:
		break;
	}
	
}




public void pregledStilova() {
	System.out.println("| ----------------|");
	System.out.println("|--  Stilovi --|");
	System.out.println("| --------------- |");	
	int b=1;
	for(Stil s:stilovi) {
		System.out.println(b++ + ". " +s.getNaziv()+"  "+s.getOpis() );
	}
	System.out.println("------------------");
	
}


public void dodavanjeStilova() {
	Stil s=new Stil();
s.setsifra(Pomocno.unosRasponBroja("Unesi sifru stila", "Pozitivan broj", 1, Integer.MAX_VALUE));
s.setNaziv(Pomocno.unosString("Unesi naziv stila", "Unos obavezan"));
s.setOpis(Pomocno.unosString("Unesi kratki opis stila", "Unos obavezan"));
stilovi.add(s);

}
private void promjenapostojecegStila() {
	pregledStilova();
	int index=Pomocno.unosRasponBroja("Odaberi broj stila ","Nije dobar odabir", 1, stilovi.size());
	Stil s=stilovi.get(index-1);
	s.setsifra(Pomocno.unosRasponBroja("Unesi sifru stila("+s.getsifra()+"):","Pozitivan broj" ,1,Integer.MAX_VALUE));
	s.setNaziv(Pomocno.unosString("Unesi naziv stila("+s.getNaziv()+")","Naziv obavezan"));
	s.setOpis(Pomocno.unosString("Unesi kratki opis("+s.getOpis()+")", "Opis obavezan"));
	}	

private void brisanjeStila() {	
	pregledStilova();
	int index=Pomocno.unosRasponBroja("Odaberi redni broj stila", "Nije dobar odabir", 1, stilovi.size());
	stilovi.remove(index-1);

}








}
