package Tugas_48;
import java.util.Scanner;

public class Kalkulator {
	private double value1;
	private double value2;
	
	public double getValue1() {
		return value1;
	}
	public void setValue1(double value1) {
		this.value1 = value1;
	}
	public double getValue2() {
		return value2;
	}
	public void setValue2(double value2) {
		this.value2 = value2;
	}
	public void setNameProject() {
		System.out.print("Kalkulator");
	}
	public void setNoteProject(String note) {
		System.out.print("Project Untuk Menghitung");
	}
	public double add(double val1, double val2) {
		this.value1 = value1;
		this.value2 = value2;
		return val1 + val2;
	}
	public double minus(double val1, double val2) {
		this.value1 = value1;
		this.value2 = value2;
		return val1 - val2;
	}
	public double multiplication(double val1, double val2) {
		this.value1 = value1;
		this.value2 = value2;
		return val1 * val2;
	}
	public double division(double val1, double val2) {
		this.value1 = value1;
		this.value2 = value2;
		return val1 / val2;
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Kalkulator perhitungan = new Kalkulator();
		
		System.out.print("Value1 = ");
		perhitungan.setValue1(input.nextInt());
		System.out.print("Value2 = ");
		perhitungan.setValue2(input.nextInt());
		
		double val1 = perhitungan.getValue1();
		double val2 = perhitungan.getValue2();
		
		System.out.println("\n"+
		"Project Perhitungan");
		
		System.out.println("This Project shown you how to manage method in java");
		
		System.out.println("Add is "+ perhitungan.add(val1,val2));
		System.out.println("Minus is "+ perhitungan.minus(val1,val2));
		System.out.println("Multiple is "+ perhitungan.multiplication(val1,val2));
		System.out.println("Division is "+ perhitungan.division(val1,val2));
	}

}
