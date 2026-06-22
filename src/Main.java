import java.util.Scanner;

// 1. Classe Financiamento
class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    public double calcularTotalPagamento() {
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }
}

// 2. Classe InterfaceUsuario
class InterfaceUsuario {
    private Scanner scanner;

    public InterfaceUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public double pedirValorImovel() {
        System.out.print("Digite o valor do imóvel (R$): ");
        return scanner.nextDouble();
    }

    public int pedirPrazoFinanciamento() {
        System.out.print("Digite o prazo do financiamento (em anos): ");
        return scanner.nextInt();
    }

    public double pedirTaxaJuros() {
        System.out.print("Digite a taxa de juros anual (ex: 0.10 para 10%): ");
        return scanner.nextDouble();
    }
}

// 3. Classe Main
public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        System.out.println("--- Bem-vindo ao Simulador de Financiamento ---");

        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJurosAnual = interfaceUsuario.pedirTaxaJuros();

        Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);

        System.out.println("\n--- Resumo do Financiamento ---");
        System.out.printf("Valor do Imóvel: R$ %.2f\n", financiamento.getValorImovel());
        System.out.printf("Prazo: %d anos\n", financiamento.getPrazoFinanciamento());
        System.out.printf("Pagamento Mensal: R$ %.2f\n", financiamento.calcularPagamentoMensal());
        System.out.printf("Total do Pagamento: R$ %.2f\n", financiamento.calcularTotalPagamento());
    }
}