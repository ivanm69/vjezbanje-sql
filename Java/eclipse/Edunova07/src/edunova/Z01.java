package edunova;

public class Z01 {

	//Kreirati klasu Grad s minimalno 5 razlicitih svojstava(razlicitih tipoiva podataka)
	//Ovjde u main metodi napraviti instancu klase Grad,dodjeliti vrijednosti za sva svojstva 
	//te po zelji ispisati jedno svojstvo
	
	 public static void main(String[] args) {
		
		 
		 Grad grad=new Grad();
		 grad.setNaziv("Osijek");
		 grad.setSjedisteZupanije(true);
		 grad.setBrojStanovnika(0);
		 grad.setProsjecnaPlaca(0);
		 
		 System.out.println(grad.isSjedisteZupanije());
	 }	
}
