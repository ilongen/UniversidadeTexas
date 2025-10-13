package models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class procCadastrarNota {

    public procCadastrarNota(int matricula,String curso,String materia,int perletivo,double nota,int falta,int bimestre) throws SQLException {
        try{
        Connection conn = connectionDB.getConnection();
        CallableStatement stmt = conn.prepareCall("{call procCadastrarNota(?,?,?,?,?,?,?)}");
        stmt.setInt(1, matricula);
        stmt.setString(2, curso);
        stmt.setString(3, materia);
        stmt.setInt(4, perletivo);
        stmt.setDouble(5, nota);
        stmt.setInt(6, falta);
        stmt.setInt(7, bimestre);
        stmt.executeUpdate();
        stmt.close();
        conn.close();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
