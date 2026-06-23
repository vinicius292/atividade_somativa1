package Util;
import java.util.Scanner;
import java.util.Locale;

public class InterfaceUsuario {
    private Scanner scanner;

    public InterfaceUsuario() {
        // O useLocale garante que o Java aceite pontos em vez de vírgulas em decimais se necessário
        this.scanner = new Scanner(System.in).useLocale(Locale.US);
    }

    public double pedirValorImovel() {
        System.out.print("Digite o valor do imóvel (R$): ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpa o "Enter" do buffer
        return valor;
    }

    public int pedirPrazoFinanciamento() {
        System.out.print("Digite o prazo do financiamento (em anos): ");
        int prazo = scanner.nextInt();
        scanner.nextLine(); // Limpa o "Enter" do buffer
        return prazo;
    }

    public double pedirTaxaJuros() {
        System.out.print("Digite a taxa de juros anual (ex: 0.10 para 10%): ");
        double taxa = scanner.nextDouble();
        scanner.nextLine(); // Limpa o "Enter" do buffer
        return taxa;
    }
}