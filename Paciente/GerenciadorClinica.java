import java.util.Scanner;


public class GerenciadorClinica {

    public static Integer Menu(Scanner sc){
        System.out.println("========================================");
        System.out.println("1 - Adicionar Paciente à Fila ");
        System.out.println("2 - Atender Próximo Paciente ");
        System.out.println("3 - Exibir Fila De Atendimento ");
        System.out.println("4 - Exibir Histórico De Atendimentos ");
        System.out.println("0 - Sair");
        System.out.println("========================================");
        System.out.println("Selecione Uma Opção: ");
        Integer seletor = sc.nextInt();
        return seletor;
    }

    public static void main(String[] args) {
        FilaDeAtendimento fila = new FilaDeAtendimento();
        PilhaHistoricoAtendimento historico = new PilhaHistoricoAtendimento();
        Scanner sc = new Scanner(System.in);
        Integer seletor;

        do{
            seletor = Menu(sc);

            if (seletor == 1){
                System.out.print("Digite O Nome Do Paciente: ");
                String nome = sc.next();

                System.out.print("Digite A Idade Do Paciente: ");
                Integer idade = sc.nextInt();

                System.out.print("Digite O Sintoma Do Paciente: ");
                String sintoma = sc.next();

                System.out.println("\n");
                Paciente p = new Paciente(nome,idade,sintoma);
                fila.adicionarPaciente(p);

            } else if (seletor == 2){
                if (fila.estaVazia()){
                    System.out.println("Não Há Pacientes A Serem Atendidos!");
                } else {
                    Paciente proximo = fila.atenderPaciente();
                    System.out.println(proximo.exibirInfo());
                    historico.adicionarAoHistorico(proximo);
                }

            } else if (seletor == 3){
                if(fila.estaVazia()){
                    System.out.println("Não Há Pacientes Na Fila!");
                } else {
                    fila.mostrarFila();
                }

            } else if (seletor == 4){
                if (historico.historicoVazio()){
                    System.out.println("Nenhum Paciente Foi Atendido Ainda !");
                } else {
                    historico.mostrarHistorico();
                }
            }else if (seletor == 0){
                System.out.println("Finalizando Programa...");
            } else {
                System.out.println("Opção Inválida!");
            }
        } while(seletor != 0);

    }
}
