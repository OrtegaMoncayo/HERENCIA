/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class Docente extends Persona {

    private int idDocente;
    private String especilizacion;
    private String titulo;
    private String registroSenescyt;
    private String escalaSalarial;

    public Docente() {
    }

    public Docente(int idDocente, String especilizacion, String titulo, String registroSenescyt, String escalaSalarial) {
        this.idDocente = idDocente;
        this.especilizacion = especilizacion;
        this.titulo = titulo;
        this.registroSenescyt = registroSenescyt;
        this.escalaSalarial = escalaSalarial;
    }

    public Docente(int idDocente, String especilizacion, String titulo, String registroSenescyt, String escalaSalarial, int idPersona, String nombre, String apellido, String cedula, int telefono, String direccion, String correoElectrinico, String sexo, String fechaNacimiento) {
        super(idPersona, nombre, apellido, cedula, telefono, direccion, correoElectrinico, sexo, fechaNacimiento);
        this.idDocente = idDocente;
        this.especilizacion = especilizacion;
        this.titulo = titulo;
        this.registroSenescyt = registroSenescyt;
        this.escalaSalarial = escalaSalarial;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getEspecilizacion() {
        return especilizacion;
    }

    public void setEspecilizacion(String especilizacion) {
        this.especilizacion = especilizacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRegistroSenescyt() {
        return registroSenescyt;
    }

    public void setRegistroSenescyt(String registroSenescyt) {
        this.registroSenescyt = registroSenescyt;
    }

    public String getEscalaSalarial() {
        return escalaSalarial;
    }

    public void setEscalaSalarial(String escalaSalarial) {
        this.escalaSalarial = escalaSalarial;
    }

    public String imprimir() {
        return "--------DATOS DE DOCENTES----------\n"
                + "Id:" + getIdPersona() + "\n"
                + "NOMBRE:" + getNombre() + "\n"
                + "APELLIDO:" + getApellido() + "\n"
                + "CEDULA:" + getCedula() + "\n"
                + "TELEFONO:" + getTelefono() + "\n"
                + "DIRECCION:" + getDireccion() + "\n"
                + "CORREO ELECTRONICO" + getCorreoElectrinico() + "\n"
                + "SEXO:" + getSexo() + "\n"
                + "FECHA DE NACIMIENTO:" + getFechaNacimiento() + "\n"
                +"--------DATOS DE DOCENTES----------\n"
                + "Id DOCENTE:" + getIdDocente() + "\n"
                + "ESPECIALIZACION:" + getEspecilizacion() + "\n"
                + "TITULO:" + getTitulo() + "\n"
                + "REGISTRO DE SENESCYT:" + getRegistroSenescyt() + "\n"
                + "ESCALA SALARIAL:" + getEscalaSalarial() + "\n";
    }
}
