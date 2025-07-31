package br.com.dio.desafio.dominio;

public abstract class Veiculo implements IPagavel {
    private String modelo;
    private String marca;
    private int ano;

    public Veiculo(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public abstract void exibirInfo();

    public String getModelo() { return modelo; }
    public String getMarca() { return marca; }
    public int getAno() { return ano; }
}