package Geometria;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserire base: ");
		int base = in.nextInt();
		System.out.print("Inserire altezza: ");
		int altezza = in.nextInt();
		
		Rettangolo rettangolo = new Rettangolo(base, altezza);
		System.out.println("Perimetro: " +rettangolo.calcoloPerimetro());
		System.out.println("Area " +rettangolo.calcoloArea());
		in.close();
	}
}
