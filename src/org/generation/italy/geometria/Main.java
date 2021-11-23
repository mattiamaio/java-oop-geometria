package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Rettangolo rettangolo = new Rettangolo();

		System.out.print("Base: ");
		rettangolo.base = scan.nextInt();
		System.out.print("\nAltezza: ");
		rettangolo.altezza = scan.nextInt();

		System.out.println("\nPerimetro: " + rettangolo.calcolaPerimetro());

		System.out.println("\nArea: " + rettangolo.calcolaArea());

		scan.close();
	}
}
