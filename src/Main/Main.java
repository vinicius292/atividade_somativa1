package Main;

import Modelo.Financiamento;
import Util.InterfaceUsuario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<>();

        System.out.println("--- Simulador de Financiamento (Semana 3) ---");
        System.out.println("Por favor, insira os dados dos 4 financiamentos.\n");

        // 1. Laço para pedir os dados dos 4 financiamentos pelo teclado
        for (int i = 1; i <= 4; i++) {
            System.out.println(">>> Cadastro do Financiamento " + i + ":");

            double valorImovel = interfaceUsuario.pedirValorImovel();
            int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
            double taxaJurosAnual = interfaceUsuario.pedirTaxaJuros();

            // Instancia o objeto com os dados digitados e adiciona na lista
            Financiamento f = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
            listaFinanciamentos.add(f);
            System.out.println(); // Apenas uma linha em branco para separar os cadastros
        }

        // Variáveis para acumular os totais
        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        System.out.println("--- Lista de Financiamentos Cadastrados ---");

        // 2. Percorrendo o ArrayList para mostrar os dados e calcular as somas reais
        for (int i = 0; i < listaFinanciamentos.size(); i++) {
            Financiamento f = listaFinanciamentos.get(i);
            System.out.print("Financiamento " + (i + 1) + " – ");
            f.mostrarDadosFinanciamento();

            // Somando os valores reais que foram digitados
            totalImoveis += f.getValorImovel();
            totalFinanciamentos += f.calcularTotalPagamento();
        }

        // 3. Exibindo o grande total formatado
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.printf("Total de todos os imóveis: R$ %.2f, total de todos os financiamentos: R$ %.2f.\n",
                totalImoveis, totalFinanciamentos);
        System.out.println("--------------------------------------------------------------------------------");
    }
}