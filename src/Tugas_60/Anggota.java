package Tugas_60;

public class Anggota extends Akatsuki {
	private String nama;
	private String asalDesa;
	private String senjata;
	private String tipeKarakter;
	private String jurusAndalan;
	private String tewas;
	private String cincin;
	private boolean havePartner;
	
	public Anggota(String nama, String asalDesa, String senjata, String tipeKarakter, String jurusAndalan, String tewas, String cincin, boolean havePartner, String pakaian, String tujuan) {
		super(pakaian, tujuan);
		this.nama = nama;
		this.asalDesa = asalDesa;
		this.senjata = senjata;
		this.tipeKarakter = tipeKarakter;
		this.jurusAndalan = jurusAndalan;
		this.tewas = tewas;
		this.cincin = cincin;
		this.havePartner = havePartner;
	}
	public String getNama() {
		return nama;
	}
	public String getAsalDesa() {
		return asalDesa;
	}
	public String getSenjata() {
		return senjata;
	}
	public String getTipeKarakter() {
		return tipeKarakter;
	}
	public String getJurusAndalan() {
		return jurusAndalan;
	}
	public String getTewas() {
		return tewas;
	}
	public String getCincin() {
		return cincin;
	}
	public boolean isHavePartner() {
		return havePartner;
	}
	public void displayAnggota() {
		System.out.println("======================");
		System.out.println("Nama : "+nama);
		System.out.println("======================");
		System.out.println("Asal Desa : " +asalDesa);
		System.out.println("Senjata : " +senjata);
		System.out.println("Tipe Karakter : " +tipeKarakter);
		System.out.println("Jurus Andalan : " +jurusAndalan);
		System.out.println("Cincin Yang Digunakan : " +cincin);
		System.out.println("Kematian : " +tewas);
		if(isHavePartner()) {
			System.out.println("Mission Type : Team");
		}else {
			System.out.println("Mission Type : Solo");
		}
		System.out.println();
	}
	
}
