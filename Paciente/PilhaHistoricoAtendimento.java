import java.util.Stack;

public class PilhaHistoricoAtendimento {

    private Stack<Paciente> historico = new Stack<>();


    public void adicionarAoHistorico(Paciente paciente) {
        historico.push(paciente);
        System.out.println("Paciente adicionado ao histórico: " + paciente.getNome());
    }

    public void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("O histórico está vazio.");
        } else {
            System.out.println("Histórico de atendimentos (mais recente → mais antigo):");
            for (int i = historico.size() - 1; i >= 0; i--) {
                Paciente paciente = historico.get(i);
                System.out.println(paciente.exibirInfo());
            }
        }
    }

    public Boolean historicoVazio(){
        return historico.isEmpty();
    }

    public Paciente verUltimo() {
        if (historico.isEmpty()) {
            System.out.println("Nenhum paciente no histórico.");
            return null;
        }
        return historico.peek();
    }

    public static void main(String[] args) {
        PilhaHistoricoAtendimento historico = new PilhaHistoricoAtendimento();
    }
}
