package Tugas_Abstract;

public class Renang extends Football {
void deskripsi() {
	System.out.println("Olahraga renang bermanfaat untuk menjaga daya tahan tulang dan mempercepat pertumbuhan badan ");
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
