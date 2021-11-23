package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Base: ");
		int base = scan.nextInt();

		System.out.print("\nAltezza: ");
		int altezza = scan.nextInt();

		Rettangolo rettangolo = new Rettangolo(base, altezza);

		System.out.println("\nPerimetro: " + rettangolo.calcolaPerimetro());

		System.out.println("\nArea: " + rettangolo.calcolaArea());

		scan.close();
	}
}
