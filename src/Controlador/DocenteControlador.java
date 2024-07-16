/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import controlador.ConexionBDD;
import java.sql.ResultSet;
import modelo.Docente;

/**
 *
 * @author 59397
 */
public class DocenteControlador {

    private Docente docente;

    ConexionBDD conexion = new ConexionBDD();
    Connection connection = (Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet rultado;

    public void crearDocente(Docente d) {
        try {
            String consultaSQL = "INSERT INTO docente (especilizacion, titulo, registroSenescyt, escalaSalarial)"
                    + "VALUES"
                    + "('"+d.getEspecilizacion()+"','"+d.getTitulo()+"',"
                    + "'" + d.getRegistroSenescyt() + "'," + d.getEscalaSalarial() + ");";
            ejecutar = (PreparedStatement) connection.prepareCall(consultaSQL);
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                System.out.println("EL ESTUDIANTE FUE CREADA CON ÉXITO");
                ejecutar.close();
            } else {
                System.out.println("FAVOR INGRESE CORRECTAMENTE LOS DATOS");
                ejecutar.close();
            }
        } catch (Exception e) {
            System.out.println("COMUNIQUESE CON EL ALMINISTRADOR DEL SISTEMA PARA EL SISTEMA" + e);
        }
    }

}
