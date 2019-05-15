package service;

// Como FF = 255 em decimal;

public class DataCheck {
    public static boolean check(String arquivo){
        int soma = 0;
        String verificador, temp;
        int i=2;

        //Somando os Hex de aquivo em decimal
        while(i<(arquivo.length()-2)) {
            soma+= Operacao.conversorDecimal(arquivo.substring(i, i+2));
            i+=2;
        }
        //carregando o key de verificação
        verificador = arquivo.substring(arquivo.length()-2, arquivo.length());

        //Convertendo a variavel soma de Decimal para Hexadecimal, verificando Overflow e convertendo em decimal

        temp = Operacao.conversorHexadecimal(soma);
        if(temp.length()>2) temp = temp.substring(temp.length()-2);

        soma = Operacao.conversorDecimal(temp);

        //Saida da verificação
         if(255 - soma == Operacao.conversorDecimal(verificador)) return true;
         else return false;
    }

    public static boolean value(String arquivo){

        if(2*(Operacao.conversorDecimal(arquivo.substring(2,4))) == (arquivo.length()-4)) return true;
        else return false;
    }
}
