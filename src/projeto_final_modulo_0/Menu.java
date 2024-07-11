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
                System.out.println("/Parfum Store - Envolva-se com o luxo dos aromas! ");
                sobre();
                leia.close();
                System.exit(0);
            }
            switch (opcao) {
                case 1:
                    System.out.println("Criar login no site\n\n");

                    break;
                case 2:
                    System.out.println("Listar os perfumes do site\n\n");

                    break;
                case 3:
                    System.out.println("Buscar o perfume pelo nome\n\n");

                    break;
                case 4:
                    System.out.println("Ver produtos na sacola de compras\n\n");

                    break;
                case 5:
                    System.out.println("Pedidos feitos no site\n\n");

                    break;
                case 6:
                    System.out.println("Lista de perfumes desejados\n\n");

                    break;
                case 7:
                    System.out.println("Suporte do site\n\n");

                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;

            }

            }
        }
}

