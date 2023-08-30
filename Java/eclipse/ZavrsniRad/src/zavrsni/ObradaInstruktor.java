package zavrsni;

import java.util.ArrayList;
import java.util.List;

import zavrsni.model.Instruktor;


public class ObradaInstruktor {

private List<Instruktor>instruktori;
public List<Instruktor>getInstruktori(){
	return instruktori;
}

public ObradaInstruktor() {
	instruktori=new ArrayList<>();
	if(Pomocno.dev) {
		testniPodaci();
	}
}

private void testniPodaci() {
	instruktori.add(new Instruktor(1,"Ivan","Marosevic","12.04.1999.", "Latino", "Ubrzani tecaj napredne salse"));
	instruktori.add(new Instruktor(2,"Iva","Huiber","23.04.1996.", "Latino", "Ubrzani tecaj napredne bachate"));

}
public void prikaziIzbornik() {
	System.out.println("\t-- Izbornik Instruktor--");
	System.out.println("1. Pregled postojećih Instruktora");
	System.out.println("2. Unos novog Instruktora");
	System.out.println("3. Promjena postojećeg Instruktora");
	System.out.println("4. Brisanje postojećeg Instruktora");
	System.out.println("5. Povratak na prethodni izbornik");
	ucitajStavkuIzbornika();

}

private void ucitajStavkuIzbornika() {
	switch(Pomocno.unosRasponBroja("Odaberi stavku Instruktor Izbornika", "Odabir mora biti 1-5", 1, 5)) {
	case 1:
		pregledInstruktora();
		prikaziIzbornik();
		break;
	case 2:
		dodavanjeInstruktora();
		prikaziIzbornik();
		break;
	case 3:
		promjenapostojecegInstruktora();
		prikaziIzbornik();
		break;
	case 4:
		brisanjeInstruktora();
		prikaziIzbornik();
		break;
	case 5:
		break;
	}
	}



public void pregledInstruktora() {
	System.out.println("| ----------------|");
	System.out.println("|--  Instruktor --|");
	System.out.println("| --------------- |");	
	int b=1;
	for(Instruktor i : instruktori) {
		System.out.println(b++ + ". " + i.getIme());
	}
	System.out.println("------------------");
	
}
private void dodavanjeInstruktora() {
	Instruktor i=new Instruktor(0, null, null, null, null, null);
	i.setsifra(Pomocno.unosRasponBroja("Unesi sifru instruktora:","Pozitivan broj", 1,Integer.MAX_VALUE));
	i.setIme(Pomocno.unosString("Unesi ime", "Ime obavezno"));
	i.setPrezime(Pomocno.unosString("Unesi Prezime", "Prezime Obavezno"));
	i.setDatumrodenja(Pomocno.unosString("Unesi datum rodenja", "unos obavezan"));
	i.setStil(Pomocno.unosString("Unesi stil instruktora", "Stil obavezan"));
	i.setTecaj(Pomocno.unosString("Unesi tecaj", "Tecaj Obavezan"));
	instruktori.add(i);
}

private void promjenapostojecegInstruktora() {
	pregledInstruktora();
	int index=Pomocno.unosRasponBroja("Odaberi broj Instruktora", "Nije dobar odabir", 1,instruktori.size());
	Instruktor i=instruktori.get(index-1);
	i.setsifra(Pomocno.unosRasponBroja("Unesi sifru Instruktora("+i.getsifra()+"):", "Pozitivan broj",1 , Integer.MAX_VALUE));
	i.setIme(Pomocno.unosString("Unesi ime Instruktora("+i.getIme()+"):","Ime obavezno"));
	i.setPrezime(Pomocno.unosString("Unesi Prezime Instruktora("+i.getPrezime()+"):","Prezime obavezno"));
	i.setDatumrodenja(Pomocno.unosString("Unesi datum rodenja("+i.getDatumrodenja()+")","Datum obavezan"));
	i.setStil(Pomocno.unosString("Unesi Stil instruktora("+i.getStil()+"):", "Stil obavezan"));
	i.setTecaj(Pomocno.unosString("Unesi tecaj instruktora("+i.getTecaj()+"):", "Tecaj Obavezan"));
}

private void brisanjeInstruktora() {
	pregledInstruktora();
	int index=Pomocno.unosRasponBroja("Odaberi redni broj instruktora:", "Nije dobar odabir", 1, instruktori.size());
	instruktori.remove(index-1);

	
}



}

