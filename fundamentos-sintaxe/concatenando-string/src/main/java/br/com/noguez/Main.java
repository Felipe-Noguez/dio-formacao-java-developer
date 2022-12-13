package br.com.noguez;

public class Main {
    public static void main(String[] args) {
        String primeiroNome = "Felipe";
        String segundoNome = "Noguez";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String pNome, String sNome) {
        return pNome.concat(" ").concat(sNome);
    }
}
