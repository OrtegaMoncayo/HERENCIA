/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class Administrativo extends Personas{

    private int idAdministrativo;
    private String cargo;
    private String area;
    private int idPersonas;

    public Administrativo() {
    }

    public Administrativo(int idAdministrativo, String cargo, String area,int idPersonas) {
        this.idAdministrativo = idAdministrativo;
        this.cargo = cargo;
        this.area = area;
        this.idPersonas=idPersonas;
    }

    public Administrativo(int idAdministrativo, String cargo, String area, int idPersonas, String nombre, String apellido, String cedula, String direccion, String correoElectronico, String sexo, String fechaNacimiento, int telefono, String usuario, String clave) {
        super(idPersonas, nombre, apellido, cedula, direccion, correoElectronico, sexo, fechaNacimiento, telefono, usuario, clave);
        this.idAdministrativo = idAdministrativo;
        this.cargo = cargo;
        this.area = area;
        this.idPersonas=idPersonas;
    }

  

    public int getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(int idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getIdPersonas() {
        return idPersonas;
    }

    public void setIdPersonas(int idPersonas) {
        this.idPersonas = idPersonas;
    }
    

    public String imprimir() {
        return "--------DATOS DE PERSONA----------\n"
                + "NOMBRE:" + getNombre() + "\n"
                + "APELLIDO:" + getApellido() + "\n"
                + "CEDULA:" + getCedula() + "\n"
                + "TELEFONO:" + getTelefono() + "\n"
                + "DIRECCION:" + getDireccion() + "\n"
                + "CORREO ELECTRONICO" + getCorreoElectronico() + "\n"
                + "SEXO:" + getSexo() + "\n"
                + "FECHA DE NACIMIENTO:" + getFechaNacimiento() + "\n"
                + "--------DATOS DE Administrativo----------\n"
                + "NOMBRE:" + getCargo() + "\n"
                + "APELLIDO:" + getArea() + "\n";
    }

}
