package Tugas_52;

public class Dosen extends Manusia {
	private String nip;
	private String mataKuliah;
	
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getMataKuliah() {
		return mataKuliah;
	}
	public void setMataKuliah(String mataKuliah) {
		this.mataKuliah = mataKuliah;
	}
	public void mengajarApa() {
		System.out.println("Saya Rizki Adam Kurniawan Umur 27 Tahun Sedang Mengajar Mata Kuliah PBO");
	}
	public void siapaKamu() {
		System.out.println("Saya Dosen");
		
	}
}
