package Tugas_56;

public class Test {
	public static void main(String[] args) {
		Radio radio = new Radio(234);
		radio.setName("Radio AM");
		
		System.out.println("Nama Barang Antik : "+radio.getName());
		radio.tampilUmur();
		
	}
}
