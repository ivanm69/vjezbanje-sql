package zavrsni;

import java.util.ArrayList;
import java.util.List;

import zavrsni.model.Plesac;
import zavrsni.model.Stil;

public class ObradaPlesac {

private List<Plesac>plesaci;

public List<Plesac> getPlesaci() {
	return plesaci;
}

public ObradaPlesac() {
	plesaci=new ArrayList<>();
	if(Pomocno.dev){
		testniPodaci();
	}
}

private void testniPodaci() {
	plesaci.add(new Plesac(1,"Marko","Kraljevic","12.04.1999."));
	plesaci.add(new Plesac(2,"Marija","Peric","10.10.1999."));
	
}

public void prikaziIzbornik() {
	System.out.println("\t-- Izbornik Plesac--");
	System.out.println("1. Pregled postojećih Plesaca");
	System.out.println("2. Unos novog Plesaca");
	System.out.println("3. Promjena postojećeg Plesaca");
	System.out.println("4. Brisanje postojećeg Plesaca");
	System.out.println("5. Povratak na prethodni izbornik");
	ucitajStavkuIzbornika();
}
private void ucitajStavkuIzbornika() {
	switch(Pomocno.unosRasponBroja("Odaberi stavku plesac izbornika", "Odabir mora biti 1-5", 1, 5)) {
	
	case 1:
		pregledPlesac();
		prikaziIzbornik();
		break;
	case 2:
		dodavanjePlesac();
		prikaziIzbornik();
		break;
	case 3:
		promjenaPlesac();
		prikaziIzbornik();
		break;
	case 4:
		brisanjePlesaca();
		prikaziIzbornik();
		break;
	case 5:
		break;
	}
	}


	
	public void pregledPlesac() {
	System.out.println("| ----------------|");
	System.out.println("|---- Plesaci ----|");
	System.out.println("| --------------- |");	
	int b=1;
	for(Plesac p : plesaci) {
		System.out.println(b++ + ". " +p);
	}
	System.out.println("------------------");
	
}

	private void dodavanjePlesac() {
	Plesac p = new Plesac(0, null, null, null);
	p.setsifra(Pomocno.unosRasponBroja("Unesi sifru Plesaca", "Pozitivan broj", 1, Integer.MAX_VALUE));
	p.setIme(Pomocno.unosString("Unesi ime plesaca:","Ime obavezno"));
	p.setPrezime(Pomocno.unosString("Unesite prezime plesaca", "Prezime Obavezno"));
	p.setDatumrodenja(Pomocno.unosString("Unesi datum u formatu dd. MM. yyyy.", "Datum obavezan" ));
	p.setRazinaZnanja(Pomocno.unosString("Unesi razinu znanja ", "Unos Obavezan"));
	plesaci.add(p);
}

	private void promjenaPlesac() {
	pregledPlesac();
	int index=Pomocno.unosRasponBroja("Odaberi redni broj plesaca:", "Nije dobar odabir", 1, plesaci.size());
	Plesac p=plesaci.get(index-1);
	p.setsifra(Pomocno.unosRasponBroja("Unesi sifru plesaca("+p.getsifra()+")", "Pozitivan broj", 1, Integer.MAX_VALUE));
	p.setIme(Pomocno.unosString("Unesi ime plesaca("+p.getIme()+"):","Ime obavezno"));
	p.setPrezime(Pomocno.unosString("Unesi prezime plesaca("+p.getPrezime()+"):", "Prezime obavezno"));
	p.setDatumrodenja(Pomocno.unosString("Unesi datum rodenja("+p.getDatumOd()+")", "Datum obavezan"));
	p.setRazinaZnanja(Pomocno.unosString("Unesi razinu znanja("+p.getRazinaZnanja()+")", "Razina znanja obavezna"));
	}

	private void brisanjePlesaca() {
	pregledPlesac();
	int index=Pomocno.unosRasponBroja("Odaberi redni broj plesaca", "Nije dobar odabir", 1, plesaci.size());
	plesaci.remove(index-1);
	}




}
