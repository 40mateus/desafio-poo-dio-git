package br.com.dio.desafio.dominio;

public class Moto extends Veiculo {
    private boolean temPartidaEletrica;
    private double valorMercado;

    public Moto(String modelo, String marca, int ano, boolean temPartidaEletrica, double valorMercado) {
        super(modelo, marca, ano);
        this.temPartidaEletrica = temPartidaEletrica;
        this.valorMercado = valorMercado;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Moto: %s %s (%d), partida elétrica: %s, valor: R$ %.2f%n",
                getMarca(), getModelo(), getAno(),
                temPartidaEletrica ? "Sim" : "Não", valorMercado);
    }

    @Override
    public double calcularIPVA() {
        return valorMercado * 0.03;
    }
}