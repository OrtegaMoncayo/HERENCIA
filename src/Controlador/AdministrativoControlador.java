/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import controlador.ConexionBDD;
import java.sql.ResultSet;
import modelo.Administrativo;
import modelo.Estudiante;

/**
 *
 * @author 59397
 */
public class AdministrativoControlador {

    private Administrativo administrativo;

    ConexionBDD conexion = new ConexionBDD();
    Connection connection = (Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet rultado;

    public void crearAdministrativo(Administrativo a) {
        try {
            String consultaSQL = "INSERT INTO administrativos (idadministrativo,cargo,area,idpersona) "
                    + "VALUES "
                    + "('"+a.getCargo()+"','"+a.getArea()+"',"
                    + ""+a.getIdPersonas()+");";
            ejecutar = (PreparedStatement) connection.prepareCall(consultaSQL);
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                System.out.println("EL ADMINISTRADOR FUE CREADA CON ÉXITO");
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
