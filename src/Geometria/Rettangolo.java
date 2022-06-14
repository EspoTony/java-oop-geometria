package Geometria;

public class Rettangolo {
	
	// attributi
	int base;
	int altezza;
	
	//metodi
	Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
		
	}

	int calcoloArea() {
		return base * altezza;
	}
	
	int calcoloPerimetro( ) {
		return (base + altezza) * 2;
	}
}
