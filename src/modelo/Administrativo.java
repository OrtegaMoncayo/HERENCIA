/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class Administrativo extends Persona {

    private int idAdministrativo;
    private String cargo;
    private String area;

    public Administrativo() {
    }

    public Administrativo(int idAdministrativo, String cargo, String area) {
        this.idAdministrativo = idAdministrativo;
        this.cargo = cargo;
        this.area = area;
    }

    public Administrativo(int idAdministrativo, String cargo, String area, int idPersona, String nombre, String apellido, String cedula, int telefono, String direccion, String correoElectrinico, String sexo, String fechaNacimiento) {
        super(idPersona, nombre, apellido, cedula, telefono, direccion, correoElectrinico, sexo, fechaNacimiento);
        this.idAdministrativo = idAdministrativo;
        this.cargo = cargo;
        this.area = area;
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

    public String imprimir() {
        return "--------DATOS DE PERSONA----------\n"
                + "Id:" + getIdPersona() + "\n"
                + "NOMBRE:" + getNombre() + "\n"
                + "APELLIDO:" + getApellido() + "\n"
                + "CEDULA:" + getCedula() + "\n"
                + "TELEFONO:" + getTelefono() + "\n"
                + "DIRECCION:" + getDireccion() + "\n"
                + "CORREO ELECTRONICO" + getCorreoElectrinico() + "\n"
                + "SEXO:" + getSexo() + "\n"
                + "FECHA DE NACIMIENTO:" + getFechaNacimiento() + "\n"
                + "--------DATOS DE Administrativo----------\n"
                + "Id Administrativo:" + getIdAdministrativo() + "\n"
                + "NOMBRE:" + getCargo() + "\n"
                + "APELLIDO:" + getArea() + "\n";
    }

}
