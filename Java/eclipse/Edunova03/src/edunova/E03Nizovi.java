package edunova;

import java.util.Arrays;

public class E03Nizovi {

	public static void main(String[] args) {
		
		//treba unijeti temperature za 12 mjeseci
		
		int t1=2;
		int t2=3;
		//...
		int t12=7;
		
		//Ako zelimo pohraniti u memoriji vise vrijednosti istog tipa podatka 
		//koristimo nizove/polja/arrays
		
		
		//deklariranje
		int[]niz;
		String drugiNiz[];
		
		//konstruiranje niza
		
		niz = new int[4];
		//koristenje nizova
		//na 1.mjesto u nizu
		niz[0]=2;
		niz[1]=4;
		niz[2]=7;
		//na zadnje mjesto
		niz[niz.length-1]=8;
		
		System.out.println(niz[2]);
		
		System.out.println(Arrays.toString(niz));
		
		//skracena sintaksa
		int brojevi[]= {2,3,34,45,3,23,3};
		
		//ispisi broj 45
		System.out.println(brojevi[3]);
		//dvodimenzionalni niz
		//matrica=tablica
		int matrica[][]=new int [10][10];//mogu pohraniti 100 vrijednosti
		
		int tablica [][]= {
				{0,1,3},
				{1,8,6},
				{1,2,9}
		};//tablica 3x3
		
		//ispisi broj 8
		System.out.println(tablica [1][1]);
		
		//trodimenzionalni niz
		
		int kocka [][][]=new int [10][10][10];//pohraniti 1000 vrijednosti
		
		
		//32 dimenzije

	
	
	}
	

}
