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
	tecajevi = new ArrayList<>();
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
		//pregledTecaja();
		prikaziIzbornik();
		break;
	case 2:
		dodavanjeTecaja();
		prikaziIzbornik();
		break;
	case 3:
		//promjenapostojecegTecaja();
		prikaziIzbornik();
		break;
	case 4:
		//brisanjeTecaja();
		prikaziIzbornik();
		break;
	case 5:
		break;
	}
	}

private void dodavanjeTecaja() {
	Tecaj t =new Tecaj();
	t.setsifra(Pomocno.unosRasponBroja("Unesi sifru stila:", "Pozitivan broj", 1, Integer.MAX_VALUE));
	t.setNaziv(Pomocno.unosString("Unesi naziv stila", "Naziv obavezan"));
	t.setInstruktor(ucitajInstruktor());
	t.setPlesac(plesaci());
	t.setStil(stilovi());
	tecajevi.add(t);
	
}


private Stil stilovi() {
	izbornik.getObradaStil().pregledStilova();
	int index=Pomocno.unosRasponBroja("Odaberi redni broj Stila", "Nije dobar odabir", 1, izbornik.getObradaStil().getStilovi().size());
	return izbornik.getObradaStil().getStilovi().get(index-1);
}
private List<Plesac> plesaci() {
	List<Plesac>plesaci=new ArrayList<>();
	while(Pomocno.unosBoolean("Zelite li dodati plesaca(da ili bilo sto za ne"));
		plesaci.add(postaviPlesac());
	return plesaci();
}
private Plesac postaviPlesac() {
	izbornik.getObradaPlesac().pregledPlesac();
	int index=Pomocno.unosRasponBroja("Odaberi redni broj plesaca", "Odabir nije dobar", 1,izbornik.getObradaPlesac().getPlesaci().size());
	return izbornik.getObradaPlesac().getPlesaci().get(index-1);
}
private Instruktor ucitajInstruktor() {
	izbornik.getObradaInstruktor().pregledInstruktora();
	int broj=Pomocno.unosRasponBroja("Odaberi instruktora za tecaj", "Greksa", 1, izbornik.getObradaInstruktor().getInstruktori().size());
	
	return izbornik.getObradaInstruktor().getInstruktori().get(broj-1);
}




}
