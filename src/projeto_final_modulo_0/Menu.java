package projeto_final_modulo_0;

import java.util.Scanner;

import static projeto_final_modulo_0.mensagens.mensagens.entradaMenu;
import static projeto_final_modulo_0.mensagens.mensagens.sobre;

public class Menu{

    public static void main (String[] args) {

        Scanner leia = new Scanner(System.in);
        int opcao;

        while (true) {
          entradaMenu();
            opcao = leia.nextInt();
            if (opcao == 8) {
                System.out.println("/Parfum Store - Controle e praticidade em um só lugar! ");
                sobre();
                leia.close();
                System.exit(0);
            }
            switch (opcao) {

                case 1:
                    System.out.println("=== CADASTRE O PERFUME ===");

                    break;
                case 2:
                    System.out.println("=== PERFUMES CADASTRADOS ===");

                    break;
                case 3:
                    System.out.println("=== ITEM A SER ATUALIZADO ===");

                    break;
                case 4:
                    System.out.println("=== ITEM A SER EXCLUÍDO ===");

                    break;
                case 5:
                    System.out.println("=== SAIR DO SITE ===");

                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;

            }

            }
        }
}

