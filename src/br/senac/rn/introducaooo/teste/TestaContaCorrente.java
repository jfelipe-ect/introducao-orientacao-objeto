package br.senac.rn.introducaooo.teste;

import br.senac.rn.introducaooo.Conta;
import br.senac.rn.introducaooo.ContaCorrente;

public class TestaContaCorrente {

    public static void main(String[] args) {

        ContaCorrente contaFlavio = new ContaCorrente();

        contaFlavio.setTitular("Flavio Araújo");
        contaFlavio.setAgencia("1234-8");
        contaFlavio.setNumero("4564-4");

        contaFlavio.deposita(800.0);

        System.out.println(contaFlavio);

        ContaCorrente contaCaio = new ContaCorrente();

        contaCaio.setTitular("Caio");
        contaCaio.setAgencia("4568-7");
        contaCaio.setNumero("1478-3");
        contaCaio.setLimite();


        System.out.println(contaCaio);


    }

}
