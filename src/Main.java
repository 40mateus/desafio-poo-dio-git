// Definição da classe base Veiculo e subclasses para evitar erros de compilação
abstract class Veiculo {
    String modelo, marca;
    int ano;
    double valor;

    Veiculo(String modelo, String marca, int ano, double valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }

    abstract void exibirInfo();
    abstract double calcularIPVA();
}

class Carro extends Veiculo {
    int portas;

    Carro(String modelo, String marca, int ano, int portas, double valor) {
        super(modelo, marca, ano, valor);
        this.portas = portas;
    }

    @Override
    void exibirInfo() {
        System.out.printf("Carro: %s %s, Ano: %d, Portas: %d, Valor: R$ %.2f%n", modelo, marca, ano, portas, valor);
    }

    @Override
    double calcularIPVA() {
        return valor * 0.04;
    }
}

class Moto extends Veiculo {
    boolean partidaEletrica;

    Moto(String modelo, String marca, int ano, boolean partidaEletrica, double valor) {
        super(modelo, marca, ano, valor);
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    void exibirInfo() {
        System.out.printf("Moto: %s %s, Ano: %d, Partida Elétrica: %s, Valor: R$ %.2f%n", modelo, marca, ano, partidaEletrica ? "Sim" : "Não", valor);
    }

    @Override
    double calcularIPVA() {
        return valor * 0.02;
    }
}

class Caminhao extends Veiculo {
    double cargaMaxima;

    Caminhao(String modelo, String marca, int ano, double cargaMaxima, double valor) {
        super(modelo, marca, ano, valor);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    void exibirInfo() {
        System.out.printf("Caminhão: %s %s, Ano: %d, Carga Máxima: %.0f kg, Valor: R$ %.2f%n", modelo, marca, ano, cargaMaxima, valor);
    }

    @Override
    double calcularIPVA() {
        return valor * 0.015;
    }
}

public class Main {
    public static void main(String[] args) {
        Veiculo[] frota = new Veiculo[] {
            new Carro("Civic", "Honda", 2020, 4, 80000),
            new Moto("Fazer", "Yamaha", 2019, true, 25000),
            new Caminhao("FH 540", "Volvo", 2021, 20000, 300000)
        };

        for (Veiculo veic : frota) {
            veic.exibirInfo();
            System.out.printf("IPVA estimado: R$ %.2f%n", veic.calcularIPVA());
            System.out.println();
        }
    }
}