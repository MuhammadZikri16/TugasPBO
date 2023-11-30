package Tugas_54;

public class Test {
	public static void main(String[] args) {
		int x = 10;
		int y = 4;
		String warna = "Jingga";
		
		WarnaKoordinat w = new WarnaKoordinat(x, y, warna);
		w.setNamaWarna(warna);
		w.setX(x);
		w.setY(y);
		
		System.out.println("Warna Koordinat : "+w.getNamaWarna());
		System.out.println("Koordinat Sumbu X : "+w.getX()+", Y "+w.getY());
	}
}
