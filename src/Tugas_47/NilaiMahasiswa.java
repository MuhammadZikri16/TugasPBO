package Tugas_47;
import java.util.Scanner;

public class NilaiMahasiswa {
	
	public static void main (String[] args){

        final double n_uts , n_kuis , n_uas , n_akhir;
        char index;
        Scanner input = new Scanner (System.in);

  System.out.println("===== Menghitung Nilai Mahasiswa=====\n");

        System.out.print("Nilai kuis : ");

        n_kuis = input.nextInt();

        System.out.print("Nilai uts : ");

        n_uts = input.nextInt();

        System.out.print("Nilai uas : ");

        n_uas = input.nextInt();

        n_akhir = (0.20 * n_kuis + 0.30 * n_uts + 0.50 * n_uas);

        if(n_akhir>80) {
        	index = 'A';
        }
        else if(n_akhir>68) {
        	index = 'B';
        }
        else if(n_akhir>56) {
        	index = 'C';
        }
        else if(n_akhir>45){
        	index = 'D';
        }
        else {
        	index = 'E';
        }
        if(index=='A') {
        	System.out.print("\n"+"Nilai Akhir :"+ n_akhir+"\n"+ "\nIndex :" +index+ "\n"+ "Keterangan : Sangat Baik");

        }
        else if ( index == 'B') {
			System.out.print("\n" + "Nilai Akhir :"+ n_akhir+"\n"+ "\nIndex :" +index+ "\n"+  "Keterangan :  Baik");
		}
		else if ( index == 'C') {
			System.out.print("\n" + "Nilai Akhir :"+ n_akhir+"\n"+ "\nIndex :" + index + "\n"+ "Keterangan : Cukup");
		}
		else if ( index == 'D') {
			System.out.print("\n" + "Nilai Akhir :"+ n_akhir+"\n"+ "\nIndex :" + index + "\n"+ "Keterangan : Kurang");
		}
		else  {
			System.out.print("\n" + "Nilai Akhir :"+ n_akhir+"\n"+ "\nIndex :" + index + "\n"+ "Keterangan : Sangat Kurang");
		}

    }
}
