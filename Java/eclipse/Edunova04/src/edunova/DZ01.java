package edunova;

public class DZ01 {
	public static void main(String[] args) {

		System.out.println("------------------------------");
System.out.println(": : :  TABLICA MNOZENJA  : : :");
System.out.println("------------------------------");

for (int i=1;i<=9;i++) {
	System.out.print(i==1 ? "* |  1" : "  "+i);
}

System.out.println();
System.out.println("-------------------------------");

int st=0;
       
for (int i=1;i<=9;i++) {
	st=3;
	for (int j=1; j<=9;j++) {
		
		if (j==1) {
			System.out.print(i+" |");
			
		}
		System.out.print(i*j<=9 ? "  "+i*j : " "+i*j);
		st+=3;
		
	}
	System.out.println();
}



System.out.println("------------------------------");
System.out.print(": : : : : : : : : : : By IvanM");

System.out.println();
System.out.println("------------------------------");

}


}

