package models;

import java.sql.CallableStatement;
import java.sql.Connection;

public class procRotinaAluno {
    private String nome;
    private String siglaCurso;
    private int perletivo;

    public procRotinaAluno(String nome, String siglaCurso, int perletivo) {
        setNome(nome);
        setSiglaCurso(siglaCurso);
        setPerletivo(perletivo);
        nome = getNome();
        siglaCurso = getSiglaCurso();
        perletivo = getPerletivo();
        sqlProcedure(nome,siglaCurso,perletivo);
    }

    public void sqlProcedure(String nome, String siglaCurso, int Perletivo){
        try{
            Connection conn = connectionDB.getConnection();
            CallableStatement stmt = conn.prepareCall("{call RotinaAluno (?,?,?)}");
            stmt.setString(1, nome);
            stmt.setString(2, siglaCurso);
            stmt.setInt(3, Perletivo);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

   //GETTERS,SETTERS
    public String getSiglaCurso() {
        return this.siglaCurso;
    }
    public void setSiglaCurso(String siglaCurso) {
        this.siglaCurso = siglaCurso;
    }
    public String getNome() {return this.nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getPerletivo() {return this.perletivo;}
    public void setPerletivo(int perletivo) {this.perletivo = perletivo;}
}
