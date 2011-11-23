package main;

import service.CalculatorService;
import service.impl.CalculatorServiceImpl;

public class MainClass {
	public static void main(String[] args) {
			CalculatorService service = new
			CalculatorServiceImpl ();
			
			Integer a = service.tambah(", ");
			Integer b = serivce.kurang(", ");
			Integer c = service.kali(", ");
			Integer d = service.bagi(", ");
			
			System.out.println("Masukan Bilangan 1 : ");
			System.out.println("Masukan Bilangan 2 : ");
			System.out.println("Masukan operator (+,-,*,/): ");
			System.out.println("Hasil perhitungan dari a : " + a);
			
	}
}
			
			
			