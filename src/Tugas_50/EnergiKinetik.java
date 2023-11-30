package Tugas_50;

import java.lang.Math;

public class EnergiKinetik {
	private int massa;
	private int kecepatan;
	
	public int getMassa() {
		return massa;
	}
	public void setMassa(int massa) {
		this.massa = massa;
	}
	public int getKecepatan() {
		return kecepatan;
	}
	public void setKecepatan(int kecepatan) {
		this.kecepatan = kecepatan;
	}
	public int squareNumber(int num1, int num2) {
		return num1 * num2;
	}
	public double energiKinetik(int massa, int kecepatan) {
		this.massa = massa;
		this.kecepatan = kecepatan;
		return 0.5 * massa * squareNumber(kecepatan, kecepatan);
	}
	public double usaha(int massa, int kecepatanAkhir) {
		double energiKinetikAwal = 0.5 * massa * squareNumber(0, 0);
		double energiKinetikAkhir = 0.5 * massa * squareNumber(kecepatanAkhir, kecepatanAkhir);
		return energiKinetikAkhir - energiKinetikAwal; 
	}
	
	public static void main(String[] args) {
		EnergiKinetik kinetik = new EnergiKinetik();
		kinetik.setMassa(145);
		kinetik.setKecepatan(25);
		
		System.out.println("Energi kinetiknya : "+kinetik.energiKinetik(kinetik.getMassa(), kinetik.getKecepatan())+ " Joule");
		System.out.println("Usahanya : "+kinetik.usaha(kinetik.getMassa(), kinetik.getKecepatan())+ " Joule");
	}
	
}