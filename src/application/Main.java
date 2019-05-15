package application;
import service.DataCheck;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String arquivo = sc.nextLine().toUpperCase();

		if(DataCheck.value(arquivo) == true) {
			if(DataCheck.check(arquivo) == true) System.out.println("Sim");
			else System.out.println("Não");
		}
		else System.out.println("Não");

		sc.close();

	}
}
