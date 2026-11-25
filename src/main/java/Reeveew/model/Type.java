package Reeveew.model;

public enum Type {
    NORMAL(1), PLANTA(2), AGUA(3), FOGO(4), TERRESTRE(5), LUTADOR(6),
    VOADOR(7), ELETRICO(8), PSIQUICO(9), SOMBRIO(10), GELO(11), FANTASMA(12),
    PEDRA(13), INSETO(14), VENENO(15), METAL(16), DRAGAO(17), FADA(18);

    private final int valor;

    Type(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
