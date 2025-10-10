package models;

// TODO
// AINDA FAZENDO, NÃO CONSEGUI FINALIZAR PORQUE NÃO ESTOU SABENDO LIDAR COM STMT
// PRECISO LIDAR COM DUAS CLASSES ONDE UMA CLASSE SÓ FAZ CONEXÃO DO BANCO
// ESSA CLASSE EU QUERO QUE FICA RESPONSÁVEL POR TUDO DA PROCEDURE/DADOS QUE ELA IRÁ RECEBER




public class rotinaAluno {
    private String nome;
    connectionDB conn = new connectionDB();

    public rotinaAluno(String nome){
        setNome(nome);
        nome = getNome();
        sqlProcedure(nome);
    }

    public void sqlProcedure(String nome){
        try{
            String sql = "EXEC rotinaAluno @NOME = ?";
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getNome() {return this.nome;}
    public void setNome(String nome) {this.nome = nome;}
}
