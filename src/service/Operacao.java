package service;

public class Operacao {
	
	public static int conversorDecimal(String s) {
		int decimal = Integer.parseInt(s, 16 );
		return decimal;
	}

	public static String conversorHexadecimal(int i){
		return Integer.toHexString(i);
	}
}
