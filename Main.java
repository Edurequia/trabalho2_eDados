package Principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Atleta atleta = new Atleta();
        Scanner teclado = new Scanner(System.in);

        int opcao;

        do {
            System.out.println(" -------- MENU --------");
            System.out.println();
            System.out.println();
            System.out.println("1 - Listar atletas");
            System.out.println("2 - Cadastrar atleta");
            System.out.println("3 - Procurar atleta");
            System.out.println("4 - Remover atleta");
            System.out.println("5 - Sair");
            System.out.println();
            System.out.print("Digite um número: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    atleta.listarAtletas();
                    break;

                case 2:
                    atleta.cadastrarAtleta();
                    break;

                case 3:
                    System.out.println("Digite o nome do atleta a ser buscado: ");
                    String nome = teclado.next();
                    atleta.buscarAtleta(nome);
                    break;

                case 4:
                    System.out.println("Digite o nome do atleta a ser removido: ");
                    nome = teclado.next();
                    atleta.removerAtleta(nome);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }
}
