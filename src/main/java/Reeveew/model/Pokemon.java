package Reeveew.model;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String nome;
    private int id;
    private List<String> fotos;
    private String descricao;
    private String tamanho;
    private String peso;
    private List<Type> tipagem;
    private List<Review> reviews;

    public Pokemon(String nome, int id, String descricao, String tamanho, String peso, List<Type> tipagem) {
        this.nome = nome;
        this.id = id;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.peso = peso;
        this.tipagem = new ArrayList<>(tipagem);
        this.fotos = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public void adicionarReview(Review review) {
        reviews.add(review);
    }

    public void removerReview(Review review) {
        reviews.remove(review);
    }

    public double calcularMediaNotas() {
        // a nota de cada review entra quando a classe Review for implementada
        return 0.0;
    }

    public int getTotalReviews() {
        return reviews.size();
    }

    public boolean possuiTipo(Type tipo) {
        return tipagem.contains(tipo);
    }

    public void adicionarFoto(String url) {
        fotos.add(url);
    }

    public String getNome() { return nome; }
    public int getId() { return id; }
    public List<String> getFotos() { return fotos; }
    public String getDescricao() { return descricao; }
    public String getTamanho() { return tamanho; }
    public String getPeso() { return peso; }
    public List<Type> getTipagem() { return tipagem; }
    public List<Review> getReviews() { return reviews; }
}