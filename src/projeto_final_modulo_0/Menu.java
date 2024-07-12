package projeto_final_modulo_0;

import projeto_final_modulo_0.controller.ParfumStoreController;
import projeto_final_modulo_0.model.Perfumes;

import java.util.Scanner;

import static projeto_final_modulo_0.mensagens.mensagens.entradaMenu;
import static projeto_final_modulo_0.mensagens.mensagens.sobre;

public class Menu {

    public static void main(String[] args) {

        String nomePerfume, marca;
        float preco;

        ParfumStoreController controller = new ParfumStoreController();

        controller.cadastrarPerfume("Hypnotic Poison", "Dior", 899.00f);
        Scanner leia = new Scanner(System.in);
        int opcao;

        while (true) {
            entradaMenu();
            opcao = leia.nextInt();
            if (opcao == 5) {
                System.out.println("/Parfum Store - Controle e praticidade em um só lugar! ");
                sobre();
                leia.close();
                System.exit(0);
            }
            switch (opcao) {

                case 1:
                    System.out.println("=== CADASTRE O PERFUME ===");
                    System.out.print("Digite o nome do perfume: ");
                    nomePerfume = leia.next();
                    System.out.print("\nDigite a marca do perfume: ");
                    marca = leia.next();
                    System.out.print("\nDigite o preço do perfume: ");
                    preco = leia.nextFloat();
                    controller.cadastrarPerfume(nomePerfume, marca, preco);
                    System.out.println("\nPerfume cadastrado com sucessso!");
                    break;
                case 2:
                    System.out.println("=== PERFUMES CADASTRADOS ===");
                    controller.listarPerfumes();
                    break;
                case 3:
                    System.out.println("=== ITEM A SER ATUALIZADO ===");
                    System.out.print("Digite o nome do perfume a ser atualizado: ");
                    leia.nextLine();
                    nomePerfume = leia.nextLine();

                    if (nomePerfume != null) {
                        System.out.print("Digite a marca do perfume: ");
                        String novaMarca = leia.nextLine();
                        System.out.print("Digite o novo preço do perfume: ");
                        float novoPreco = leia.nextFloat();
                        leia.nextLine(); // Limpar o buffer do scanner
                        controller.atualizarItem(nomePerfume, novaMarca, novoPreco);
                        System.out.println("\nPerfume atualizado com sucesso!");
                    } else {
                        System.out.println("Perfume não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("=== ITEM A SER EXCLUÍDO ===");
                    System.out.print("Digite o nome do perfume a ser excluido: ");
                    nomePerfume = leia.next();
                    controller.excluirItem(nomePerfume);
                    System.out.println("Produto excluído com sucesso! :) ");
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }
}
