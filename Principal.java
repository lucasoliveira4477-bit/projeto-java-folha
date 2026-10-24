import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Colaborador> listaColaboradores = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n--- SISTEMA DE FOLHA DE PAGAMENTO ---");
            System.out.println("1. Cadastrar Colaborador Padrão");
            System.out.println("2. Cadastrar Colaborador Comissionado");
            System.out.println("3. Cadastrar Colaborador de Produção");
            System.out.println("4. Listar Todos os Colaboradores");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor, digite um número válido!");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite a matrícula: ");
                    String mat1 = scanner.nextLine();
                    System.out.print("Digite o nome completo: ");
                    String nome1 = scanner.nextLine();
                    listaColaboradores.add(new ColaboradorPadrao(mat1, nome1));
                    System.out.println("Colaborador Padrão cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite a matrícula: ");
                    String mat2 = scanner.nextLine();
                    System.out.print("Digite o nome completo: ");
                    String nome2 = scanner.nextLine();
                    System.out.print("Digite o valor total das vendas (R$): ");
                    double vendas = scanner.nextDouble();
                    System.out.print("Digite o percentual de comissão (%): ");
                    double comissao = scanner.nextDouble();
                    scanner.nextLine();
                    listaColaboradores.add(new ColaboradorComissionado(mat2, nome2, vendas, comissao));
                    System.out.println("Colaborador Comissionado cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.print("Digite a matrícula: ");
                    String mat3 = scanner.nextLine();
                    System.out.print("Digite o nome completo: ");
                    String nome3 = scanner.nextLine();
                    System.out.print("Digite a quantidade de peças produzidas: ");
                    int pecas = scanner.nextInt();
                    System.out.print("Digite o valor pago por peça (R$): ");
                    double valorPeca = scanner.nextDouble();
                    scanner.nextLine();
                    listaColaboradores.add(new ColaboradorProducao(mat3, nome3, pecas, valorPeca));
                    System.out.println("Colaborador de Produção cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("\n=== LISTA DE COLABORADORES E SALÁRIOS ===");
                    if (listaColaboradores.isEmpty()) {
                        System.out.println("Nenhum colaborador cadastrado.");
                    } else {
                        for (Colaborador c : listaColaboradores) {
                            System.out.println("----------------------------------------");
                            c.exibirDados();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
