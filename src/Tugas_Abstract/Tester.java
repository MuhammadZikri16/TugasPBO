package Tugas_Abstract;

abstract class Tester {
	abstract void deskripsi();
	
	void pemanasan() {
		System.out.println("Manfaat Olahraga");
	}
	public static void main(String[] args) {
		Football football = new Football();
		Renang renang = new Renang();
		
		football.pemanasan();
		football.deskripsi();
		
		renang.pemanasan();
		renang.deskripsi();
	}
}
