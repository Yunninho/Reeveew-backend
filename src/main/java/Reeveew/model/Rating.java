package Reeveew.model;

public enum Rating {
    PESSIMO(1), RUIM(2), OK(3), BOM(4), EXCELENTE(5);

    private final int valor;

    Rating(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}