/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import modelo.Personas;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import controlador.ConexionBDD;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Personas;

/**
 *
 * @author 59397
 */
public class PersonaControlador {

    //ATRIBUTOS
    //MODELO
    private Personas Personas;
    //CONECCION
    ConexionBDD conexion = new ConexionBDD();
    Connection connection = (Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    //INSERTAR FILAS EN UNA TABLA
    public void crearPersona(Personas p) {
        try {
            String consultaSQL = "INSERT INTO persona"
                    + "(nombres,apellidos,cedula,usuario,clave,direccion,correoElectronico,sexo,fechaNacimiento,telefono)"
                    + "VALUES "
                    + "('" + p.getNombre() + "','" + p.getApellido() + "',"
                    + "'" + p.getCedula() + "','" + p.getUsuario() + "',"
                    + "'" + p.getClave() + "','" + p.getDireccion() + "',"
                    + "'" + p.getCorreoElectronico() + "','" + p.getSexo() + "',"
                    + "'" + p.getFechaNacimiento() + "'," + p.getTelefono() + ");";
            ejecutar = (PreparedStatement) connection.prepareCall(consultaSQL);
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                System.out.println("LA PERSONA HA SIDO CREADA CON ÉXITO");
                ejecutar.close();
            } else {
                System.out.println("FAVOR INGRESE CORRECTAMENTE LOS DATOS SOLICITADOS");
                ejecutar.close();
            }

        } catch (Exception e) {
            System.out.println("ERROR" + e);
        }
    }

    public int buscarIdPersona(String cedula) {
        try {
            String consultaSQL = "select idpersona from persona where cedula='" + cedula + "';";
            ejecutar = (PreparedStatement) connection.prepareCall(consultaSQL);
            resultado = ejecutar.executeQuery();
            if (resultado.next()) {
                int idPersonas = resultado.getInt("idPersona");
                return idPersonas;
            } else {
                System.out.println("ingrese una cedula valida ");
            }

        } catch (Exception e) {
            System.out.println("COMUNIQUESE CON EL ALMINISTRADOR DEL SISTEMA PARA EL SISTEMA" + e);
        }
        return 0;

    }
 public Personas buscarDatosPersona(String cedula){
        Personas p=new Personas();   
        try {
            String consultaSQL="SELECT nombres,apellidos,cedula,usuario FROM persona WHERE cedula='"+cedula+"';";
            ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            resultado=ejecutar.executeQuery();
            if(resultado.next()){
                             
                p.setNombre(resultado.getString("nombres"));
                p.setApellido(resultado.getString("apellidos"));
                p.setCedula(resultado.getString("cedula"));
                p.setUsuario(resultado.getString("usuario"));
                p.imprimir();
                resultado.close();
                return p;
            }else{
                System.out.println("Ingrese una cédula válida");
                resultado.close();
            }
        } catch (Exception e) {
            System.out.println("Comuníquese con el administrador"+e);
        }
        return p;
    
    }

    public ArrayList<Personas> listaPersona() {
        ArrayList<Personas> listaPersona = new ArrayList<>();

        try {
            String consultaSQL = "select persona.cedula,\n"
                    + "persona.nombres,\n"
                    + "persona.apellidos,\n"
                    + "cliente.carnetPromocion\n"
                    + "FROM cliente\n"
                    + "JOIN persona ON cliente.idpersona=persona.idpersona;";
            ejecutar = (PreparedStatement) connection.prepareCall(consultaSQL);
            resultado = ejecutar.executeQuery();
            while (resultado.next()) {
                Personas p = new Personas();
                p.setCedula(resultado.getString("cedula"));
                p.setNombre(resultado.getString("nombres"));
                p.setApellido(resultado.getString("apellidos"));
                p.setUsuario(resultado.getString("carnetPromocion"));
                listaPersona.add(p);

            }
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de clientes: " + e);

        }

        return listaPersona;
    }
    
   public void actualizarPersonas(Personas p,String cedula){
        try {
            String consultaSQL=" update persona set cedula='?',nombres='?' where cedula='?';";
            ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            ejecutar.setString(1, p.getCedula());
            ejecutar.setString(2, p.getNombre());
            ejecutar.setString(3, cedula);
            int res=ejecutar.executeUpdate();
            if(res>0){
                System.out.println("Actualización exitosa");
                resultado.close();
                    
            }else{
                System.out.println("Revise los datos a actualizar");
                resultado.close();
            }       
        } catch (Exception e) {
            System.out.println(""+e);
        }
    
    
    }
     public void eliminarPersona(String cedula) {
        try {
            String consultaSQL = "DELETE FROM persona WHERE cedula='" + cedula + "'";
            ejecutar = (PreparedStatement) connection.prepareCall(consultaSQL);
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                System.out.println("LA PERSONA HA SIDO ELIMINADA");
                ejecutar.close();
            } else {
                System.out.println("ERROR AL ELIMINAR PERSONA");
                resultado.close();
            }
        } catch (Exception e) {
            System.out.println("CORRA EL FIN DEL MUNDO ESTA CERCA");
        }

    }

}
