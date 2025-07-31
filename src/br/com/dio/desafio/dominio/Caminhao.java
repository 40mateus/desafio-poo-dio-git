package br.com.dio.desafio.dominio;

public class Caminhao extends Veiculo {
    private double cargaMaxima;
    private double valorMercado;

    public Caminhao(String modelo, String marca, int ano, double cargaMaxima, double valorMercado) {
        super(modelo, marca, ano);
        this.cargaMaxima = cargaMaxima;
        this.valorMercado = valorMercado;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Caminhão: %s %s (%d), carga máxima: %.0f kg, valor: R$ %.2f%n",
                getMarca(), getModelo(), getAno(), cargaMaxima, valorMercado);
    }

    @Override
    public double calcularIPVA() {
        return valorMercado * 0.05;
    }
}