package util;
import java.util.Scanner;

public class InterfaceUsuario {
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