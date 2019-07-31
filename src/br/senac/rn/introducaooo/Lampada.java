package br.senac.rn.introducaooo;

//========================================== Criação do objeto ============================================

public class Lampada {

    //========================================== Constantes ============================================

    public final Integer FREQUENCIA = 60;

    //========================================== Atributos ============================================

    public String cor;
    public Integer potencia;
    public Integer tensao;
    public Float comprimento;
    private Boolean estado = false;

    //========================================== Construtor ============================================

    public Lampada() {
    }

    public Lampada(String cor) {
        this.cor = cor;
    }

    public Lampada(String cor, Integer potencia) {
        this.cor = cor;
        this.potencia = potencia;
    }

    //========================================== Métodos ============================================

    public void acende() {
        estado = true;
    }

    public void apaga() {
        estado = false;
    }

    public String statusLampada() {
        if (estado == true) {
            return "LIGADO";
        }

        return "DESLIGADO";

    }

    @Override
    public String toString() {
        return "Lampada{" +
                "cor='" + cor + '\'' +
                ", estado=" + statusLampada() +
                '}';
    }
}
//========================================== Fim do objeto ============================================
