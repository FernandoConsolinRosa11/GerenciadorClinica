

import java.util.LinkedList;

public class Paciente  {
    private static int contador = 0;
    private Integer id;
    private String nome;
    private int idade;
    private String sintoma;

    public Paciente(String nome, int idade, String sintoma) {
        this.nome = nome;
        this.idade = idade;
        this.sintoma = sintoma;
        this.id = ++contador;
    }

    // Get
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSintoma() {
        return sintoma;
    }

    // Set

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String exibirInfo() {
        return String.format(
                "===========================\n" +
                        "ID: %d\n" +
                        "Nome: %s\n" +
                        "Idade: %d\n" +
                        "Sintoma: %s\n" +
                        "===========================",
                id, nome, idade, sintoma
        );
    }
    public static void main(String[] args) {


    }

}
