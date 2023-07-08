package edunova;

public class E05TryCatch {

	public static void main(String[] args) {
		
	
		int[]niz= {1,2};
		
	
	
		//iznimke se obraduju s try catch finally blokom
		
		try {
			//ovdje se uvijek dolazi
			System.out.println(niz[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			//ovdje se dolazi ako je iznimka bacena ArrayIndexOutOfBoundsException
			System.out.println("Ides na index koji ne postoji");
		}catch (NumberFormatException | StackOverflowError  e) {
			//ovdje se dolazi ako je iznimka bacena NumberFormatException | StackOverflowError
		}catch(Exception e) {
			//Ovaj ce uhvatit sve sto nije prethodno navedeno
		}finally {
			//ovdje se uvijek dolazi
		}
	
		//u nastavku cu koristiti 
		try {
			System.out.println(niz[2]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}
}