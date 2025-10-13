package models;

import java.sql.CallableStatement;
import java.sql.Connection;

public class procRotinaAluno {

    public procRotinaAluno(String nome, String siglaCurso, int perletivo) {
        try{
            Connection conn = connectionDB.getConnection();
            CallableStatement stmt = conn.prepareCall("{call RotinaAluno (?,?,?)}");
            stmt.setString(1, nome);
            stmt.setString(2, siglaCurso);
            stmt.setInt(3, perletivo);
            stmt.executeUpdate();
            stmt.close();
            conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
