package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDespesas gerenciador = new GerenciadorDespesas();

        while (true) {
            System.out.println("1. Adicionar Despesa");
            System.out.println("2. Adicionar Receita");
            System.out.println("3. Remover Transacao");
            System.out.println("4. Listar Transacoes");
            System.out.println("5. Calcular Total de Despesas");
            System.out.println("6. Calcular Total de Receitas");
            System.out.println("7. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Nome da Despesa:");
                    String descricaoDespesa = scanner.nextLine();
                    System.out.println("Valor da Despesa:");
                    double valorDespesa = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Data da Despesa:");
                    String dataDespesa = scanner.nextLine();
                    gerenciador.adicionarTransacao(new Despesa(descricaoDespesa, valorDespesa, dataDespesa));
                    break;
                case 2:
                    System.out.println("Nome da Receita:");
                    String descricaoReceita = scanner.nextLine();
                    System.out.println("Valor da Receita:");
                    double valorReceita = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.println("Data da Receita:");
                    String dataReceita = scanner.nextLine();
                    gerenciador.adicionarTransacao(new Receita(descricaoReceita, valorReceita, dataReceita));
                    break;
                case 3:
                    System.out.println("Digite o nome da transação a ser removida:");
                    String descRemover = scanner.nextLine();
                    Transacao transacaoRemover = null;
                    for (Transacao transacao : gerenciador.listarTransacoes()) {
                        if (transacao.getDescricao().equals(descRemover)) {
                            transacaoRemover = transacao;
                            break;
                        }
                    }
                    if (transacaoRemover != null) {
                        gerenciador.removerTransacao(transacaoRemover);
                        System.out.println("Transação removida.");
                    } else {
                        System.out.println("Transação não encontrada.");
                    }
                    break;
                case 4:
                    for (Transacao transacao : gerenciador.listarTransacoes()) {
                        System.out.println(transacao);
                    }
                    break;
                case 5:
                    System.out.println("Total de Despesas: " + gerenciador.calcularTotalDespesas());
                    break;
                case 6:
                    System.out.println("Total de Receitas: " + gerenciador.calcularTotalReceitas());
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
