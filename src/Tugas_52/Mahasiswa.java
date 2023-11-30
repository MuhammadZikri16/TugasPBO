package Tugas_52;

public class Mahasiswa extends Manusia {
	String nim;
	String kelas;
	
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getKelas() {
		return kelas;
	}
	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
	public void kelasApa() {
		System.out.print("Saya Zikri umur 18 tahun sedang belajar di kelas PBO2 ");
	}
	public void siapaKamu() {
		System.out.println("Saya Mahasiswa ");
	}
	
	
}
