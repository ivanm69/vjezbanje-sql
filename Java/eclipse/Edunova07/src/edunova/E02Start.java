package edunova;

import java.util.Date;

import javax.swing.JButton;

public class E02Start {

	private Osoba osoba;
	
	public static void main(String[] args) {
		
		
	//Ovo znati u svako doba dana i noci:
	//Objekt je instanca/pojavnost klase
	//1.Naziv klase-tip objekta
	//2.Naziv instance/objkekta/varijable(malim slovima kao i ime klase)
	//3.nakon jednako poziv posebne metode(konstruktor)
		
		Osoba osoba =new Osoba();
		/*Ovo nije Po OOP
		osoba.ime="Pero";
		osoba.prezime="Preić";
		osoba.godine=24;
		*/
		
		osoba.setIme("Pero");
		osoba.setPrezime("Perić");
		osoba.setGodine(24);
		
		Osoba[]osobe=new Osoba[5];
		osobe[0]=osoba;
		
		osoba = new Osoba();
		
		osoba.setIme("Marija");
		osoba.setPrezime("Zimska");
		osoba.setGodine(21);
		
		osobe[1]=osoba;
		
		osobe[2] =new Osoba("Karlo","Kat",41);
		System.out.println(osobe[0].getPrezime() + " " +osoba.getPrezime());
	
		
		Mjesto mjesto=new Mjesto();
		mjesto.setZupanija(new Zupanija("OBZ",20000));
	//jedna od najcescih iznimki (da ne kazemo gresaka ) je NullPointerException
		System.out.println(mjesto.getZupanija().getNaziv());
		
		Grupa[]grupe=new Grupa[2];
		Smjer smjer = new Smjer(1,"Java programiranje", 1000.99f, true);
		
		grupe[0]=new Grupa(1, "JP27", smjer,new Date(), 25);
		grupe[1]=new Grupa(2, "JP28", smjer, new Date(), 25);
		
		for(Grupa g:grupe) {
			System.out.println(g.getNaziv()+ "-" + g.getSmjer().getNaziv());
		}
		
				
	}
  
}