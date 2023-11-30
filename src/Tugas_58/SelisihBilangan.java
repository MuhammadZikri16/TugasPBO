package Tugas_58;

public class SelisihBilangan extends Bilangan {
	public void tampilSelisih() {
		int selisih = getX() - getY();
		System.out.print("Hasil Selisih : "+getX()+" - "+getY()+" = "+selisih);
	}
}
