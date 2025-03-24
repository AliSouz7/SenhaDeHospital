import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaDeAtendimento filaDeAtendimento = new FilaDeAtendimento();

        //O menu vai se repetir até que a opcão de sair seja selecionada

        while (true) {
            System.out.println("MENU - SISTEMA DE SENHAS DO HOSPITAL");
            System.out.println("1 - Nova senha");
            System.out.println("2 - Chamar proximo paciente");
            System.out.println("3 - Exibir historico");
            System.out.println("4 - Reiniciar a contagem e fila");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    filaDeAtendimento.adicionarPaciente();
                    break;
                case 2:
                    filaDeAtendimento.chamarProximoPaciente();
                    break;
                case 3:
                    filaDeAtendimento.mostrarHistorico();
                    break;
                case 4:
                    filaDeAtendimento.reiniciarFila();
                    break;
                case 5:
                    System.out.println("Sistema encerrado");
                    scanner.close();
                    return;
                //default usado caso o usuario selecionar alguma opcao fora do indicado.
                default:
                    System.out.println("Opção invalida, tente novamente: ");
            }
        }
    }
}