package zavrsni;

import java.util.ArrayList;
import java.util.List;

import zavrsni.model.Instruktor;
import zavrsni.model.Plesac;
import zavrsni.model.Tecaj;
import zavrsni.model.Stil;
public class ObradaTecaj {

	private List<Tecaj>tecajevi;
	public List<Tecaj>gettecajevi(){
		return tecajevi;
	}
	public ObradaTecaj(Izbornik izbornik){
		this();
		this.izbornik=izbornik;
	}
	private Izbornik izbornik;
public ObradaTecaj() {
	super();
	tecajevi = new ArrayList<>();{
	
	}
}

public void prikaziIzbornik() {
	System.out.println("\t-- Izbornik Tecaj--");
	System.out.println("1. Pregled postojećih Tecaja");
	System.out.println("2. Unos novog Tecaja");
	System.out.println("3. Promjena postojećeg Tecaja");
	System.out.println("4. Brisanje postojećeg Tecaja");
	System.out.println("5. Povratak na prethodni izbornik");
	ucitajStavkuIzbornika();	
	
}
private void ucitajStavkuIzbornika() {
	switch(Pomocno.unosRasponBroja("Odaberi stavku Instruktor Izbornika", "Odabir mora biti 1-5", 1, 5)) {
	case 1:
		pregledTecaja();
		prikaziIzbornik();
		break;
	case 2:
		dodavanjeTecaja();
		prikaziIzbornik();
		break;
	case 3:
		promjenapostojecegTecaja();
		prikaziIzbornik();
		break;
	case 4:
		brisanjeTecaja();
		prikaziIzbornik();
		break;
	case 5:
		break;
	}
	}

private void pregledTecaja() {
	System.out.println("------------------");
	System.out.println("---- Tecajevi ----");
	System.out.println("------------------");
	int b=1;
	for(Tecaj t : tecajevi) {
		System.out.println(b++ + ". " + t.getNaziv()+" | "+t.getStil()+" | "+t.getInstruktor()+" | "+t.getPlesac());
	}
	System.out.println("------------------");
	
	
}
private void dodavanjeTecaja() {
	Tecaj t =new Tecaj();
	t.setNaziv(Pomocno.unosString("Unesi naziv Tecaja", "Naziv obavezan"));
	t.setStil(postaviStil());
	t.setInstruktor(postaviInstruktora());
	t.setPlesac(postaviPlesace());
	
	tecajevi.add(t);
	
}

private Stil postaviStil() {
	izbornik.getObradaStil().pregledStilova();
	int broj=Pomocno.unosRasponBroja("Odaberi broj stila", "Nije dobar odabir", 1,izbornik.getObradaStil().getstilovi().size());
	return izbornik.getObradaStil().getstilovi().get(broj-1);
}
private List<Plesac> postaviPlesace() {
		List<Plesac>plesaci=new ArrayList<>();
		while(Pomocno.unosBoolean("Zelite li dodati plesaca? da ili bilo sto za ne")) {
			plesaci.add(postaviPlesac());
		}
	return plesaci;
	}

private Plesac postaviPlesac() {
	izbornik.getobradaPlesac().pregledPlesac();
	int index=Pomocno.unosRasponBroja("Odaberi redni broj plesaca", "Nije dobar odabir",1 ,izbornik.getobradaPlesac().getPlesaci().size());
	
	return izbornik.getobradaPlesac().getPlesaci().get(index-1);
	
}



	


private Instruktor postaviInstruktora() {
	izbornik.getobradaInstruktori().pregledInstruktora();
	int broj=Pomocno.unosRasponBroja("Odaberi redni broj instruktora", "Odabir nije dobar", 1, izbornik.getobradaInstruktori().getInstruktori().size());
	return izbornik.getobradaInstruktori().getInstruktori().get(broj-1);
	
}


private void promjenapostojecegTecaja() {
	pregledTecaja();
	int index =Pomocno.unosRasponBroja("Unesi redni broj tecaja", "Nije dobar odabir", 1, tecajevi.size());
	Tecaj t= tecajevi.get(index-1);
	t.setsifra(Pomocno.unosRasponBroja("Unesi sifru grupe("+t.getsifra()+")", "Pozitivan broj", 1, Integer.MAX_VALUE));
	t.setNaziv(Pomocno.unosString("Unesi naziv tecaja("+t.getNaziv()+"):", "Naziv obavezan"));
	System.out.println("Trenutni tecaj"+t.getStil().getNaziv());
	
	System.out.println("Trenutni instruktor"+t.getInstruktor());
	t.setInstruktor(postaviInstruktora());
	System.out.println("----------------------------");
	System.out.println("---- Trenutni polaznici ----");
	System.out.println("----------------------------");
	int b=1;
	for(Plesac p:t.getPlesac()) {
		System.out.println(b++ + ". "+p);
	}
	System.out.println("----------------------");
	t.setPlesac(postaviPlesace());

}
private void brisanjeTecaja() {
	pregledTecaja();
	int index=Pomocno.unosRasponBroja("Odaberi redni broj tecaja", "Nije dobar odabir", 1, tecajevi.size());
	tecajevi.remove(index-1);
}



}
