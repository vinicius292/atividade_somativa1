package Main;

// Importando as classes dos outros pacotes para poder usar aqui
import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        System.out.println("--- Bem-vindo ao Simulador de Financiamento (Semana 2) ---");

        // Capturando os dados já validados
        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJurosAnual = interfaceUsuario.pedirTaxaJuros();

        // Criando o objeto de financiamento
        Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);

        // Chamando o novo método para exibir tudo na tela
        financiamento.mostrarDadosFinanciamento();
    }
}