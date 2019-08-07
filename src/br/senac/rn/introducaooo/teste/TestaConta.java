package br.senac.rn.introducaooo.teste;

import br.senac.rn.introducaooo.Conta;
import br.senac.rn.introducaooo.ContaCorrente;

public class TestaConta {
    public static void main(String[] args) {



        Conta contaFilipe = new ContaCorrente();
        contaFilipe.setAgencia("0010-5");

       // contaFilipe.setTitular("Filipe Vasco");
        contaFilipe.deposita(80.0);

        Conta contaJota = new ContaCorrente();
        contaJota.setAgencia("0003-2");

       // contaJota.setTitular("Jota Lopes");
        contaJota.deposita(200.0);



        System.out.println(contaJota);

        contaJota.transfere(contaFilipe, 50.0);

        System.out.println(contaFilipe);

        System.out.println(contaJota);

    }
}
