package models;

// TODO
// CRIAR A EXECUÇÃO DA PROCEDURE AQUI DENTRO DO JAVA,
// CRIAR VARIAVEIS QUE RECEBE DADOS E ENCAMINHE PARA O BANCO DE DADOS DIRETO.

public class rotinaAluno {
    private String nome;
    private String matricula;

    public rotinaAluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        connectionDB conn = new connectionDB();
    }

    public String sqlProcedure(connectionDB conn) {
        String sql = "EXEC RotinaAluno";
        return null;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
