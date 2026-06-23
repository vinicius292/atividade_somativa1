package Modelo;

public class Financiamento {
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

    public double getValorImovel() { return valorImovel; }
    public int getPrazoFinanciamento() { return prazoFinanciamento; }

    // Método novo solicitado na Semana 2
    public void mostrarDadosFinanciamento() {
        System.out.println("\n--- Resumo do Financiamento ---");
        System.out.printf("Valor do Imóvel: R$ %.2f\n", this.getValorImovel());
        System.out.printf("Prazo: %d anos\n", this.getPrazoFinanciamento());
        System.out.printf("Pagamento Mensal: R$ %.2f\n", this.calcularPagamentoMensal());
        System.out.printf("Total do Pagamento: R$ %.2f\n", this.calcularTotalPagamento());
    }
}