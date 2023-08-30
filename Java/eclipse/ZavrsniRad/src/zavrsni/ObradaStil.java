package zavrsni;

import java.util.ArrayList;
import java.util.List;

import zavrsni.model.Stil;

public class ObradaStil {

	private List<Stil>stilovi;
	
	
	
	
public List<Stil> getStilovi() {
		return stilovi;
	}
public ObradaStil() {
	stilovi=new ArrayList<>();
	if(Pomocno.dev) {
		testniPodaci();
	}
		
	}
	private void testniPodaci() {
		stilovi.add(new Stil(1,"Salsa","Salsa je dinamičan i ritmičan ples koji potječe iz Latinske Amerike, posebno iz Kube. Uključuje brze korake, okrete i partnera koji se vode kroz različite figure. Salsa se izvodi uz živahnu glazbu pop"));
		stilovi.add(new Stil(2,"Bachata","Bachata je senzualni ples porijeklom iz Dominikanske Republike. To je romantičan ples s naglaskom na intimnost i bliskost između partnera. Karakterizira ga koraci u paru, koraci u krugu i provokativne"));
		stilovi.add(new Stil(3,"Kizomba","Kizomba je afrički ples koji se razvio u Angoli. To je sporiji i senzualniji ples koji naglašava fluidne pokrete i blisku interakciju između partnera. Glazba koja prati kizombu često je romantična i m"));
		
	}
public void prikaziIzbornik() {
	System.out.println("\t-- Izbornik stilova--");
	System.out.println("1. Pregled postojećih stilova");
	System.out.println("2. Unos novog stila");
	System.out.println("3. Promjena postojećeg stila");
	System.out.println("4. Brisanje postojećeg stila");
	System.out.println("5. Povratak na prethodni izbornik");
	ucitajStavkuIzbornika();
}
private void ucitajStavkuIzbornika() {
	switch(Pomocno.unosRasponBroja("Odaberi stavku stil izbornika", "Odabir mora biti 1-5", 1, 5)) {
	case 1:
		pregledStilova();
		prikaziIzbornik();
		break;
	case 2:
		dodavanjeStila();
		prikaziIzbornik();
	case 3:
		promjenastila();
		prikaziIzbornik();
	
	case 4:
		brisanjestila();
		prikaziIzbornik();
	case 5:
		break;
	}
}

	public void pregledStilova() {
	System.out.println("| ----------------|");
	System.out.println("|---- Stilovi ----|");
	System.out.println("| --------------- |");	
	int b=1;
	for(Stil s : stilovi) {
		System.out.println(b++ + ". " + s.getNaziv());
	}
	System.out.println("------------------");

}
private void dodavanjeStila() {
		Stil s=new Stil();
		s.setsifra(Pomocno.unosRasponBroja("Unesi sifru stila:", "Pozitivan broj", 1, Integer.MAX_VALUE));
		s.setNaziv(Pomocno.unosString("Unesi naziv stila", "Naziv obavezan"));
		s.setOpis(Pomocno.unosString("Unesi opis stila", "Unos Obavezan"));
		stilovi.add(s);	
}

private void promjenastila() {
	pregledStilova();
	int index=Pomocno.unosRasponBroja("Odaberi redni broj stila", "Odabir nije dobar", 1, stilovi.size());
	Stil s=stilovi.get(index-1);
	s.setsifra(Pomocno.unosRasponBroja("Unesi sifru stila("+s.getsifra()+"):", "Pozitivan broj", 1, Integer.MAX_VALUE));
	s.setNaziv(Pomocno.unosString("Unesi naziv stila("+s.getNaziv()+"):", "Naziv obavezan"));
	s.setOpis(Pomocno.unosString("Unesi opis stila("+s.getOpis()+"):", "Opis obavezan"));
	
}

private void brisanjestila() {
	pregledStilova();
	int index=Pomocno.unosRasponBroja("Odaberi redni broj stila:","Nije odabran stil", 1, stilovi.size());
	stilovi.remove(index-1);
	
}

}

