package org.generation.italy.geometria;

public class Rettangolo {
	//attributi
	int base;
	int altezza;
	int perimetro;
	int area;
	
	//costruttore
	Rettangolo(){
		this.base = 0;
		this.altezza = 0;
	}	
//	Rettangolo(int base, int altezza){
//		this.base = base;
//		this.altezza = altezza;
//	}
	
	//metodi
	int calcolaPerimetro() {
		perimetro = (base + altezza) * 2;
		return perimetro;
	}
	
	int calcolaArea() {
		area = base * altezza;
		return area;
	}
	
	
	
	
	
	
	
}
