import java.util.LinkedList;
import java.util.Queue;

public class FilaDeAtendimento {
    private Queue<Paciente> fila = new LinkedList<>();

    public void adicionarPaciente(Paciente paciente) {
        fila.add(paciente);
        System.out.println("Paciente adicionado: " + paciente.getNome());
    }

    public Paciente atenderPaciente() {
       return fila.poll();
    }

    public boolean estaVazia() {
        boolean vazia = fila.isEmpty();
        if (vazia) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Ainda há pacientes na fila.");
        }
        return vazia;
    }

    public void mostrarFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Pacientes na fila:");
            for (Paciente p : fila) {
                System.out.println(p.exibirInfo());
            }
        }
    }

    public static void main(String[] args) {
        FilaDeAtendimento fila = new FilaDeAtendimento();
    }
}
