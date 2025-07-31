package br.com.dio.desafio.dominio;

public class Carro extends Veiculo {
    private int portas;
    private double valorMercado;

    public Carro(String modelo, String marca, int ano, int portas, double valorMercado) {
        super(modelo, marca, ano);
        this.portas = portas;
        this.valorMercado = valorMercado;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Carro: %s %s (%d), portas: %d, valor: R$ %.2f%n",
                getMarca(), getModelo(), getAno(), portas, valorMercado);
    }

    @Override
    public double calcularIPVA() {
        return valorMercado * 0.04;
    }
}
