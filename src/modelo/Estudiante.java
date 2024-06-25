/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class Estudiante extends Persona {

    private int idEStudiante;
    private int numeroMatriculo;
    private String horario;
    private String jornada;

    public Estudiante() {
    }

    public Estudiante(int idEStudiante, int numeroMatriculo, String horario, String jornada) {
        this.idEStudiante = idEStudiante;
        this.numeroMatriculo = numeroMatriculo;
        this.horario = horario;
        this.jornada = jornada;
    }

    public Estudiante(int idEStudiante, int numeroMatriculo, String horario, String jornada, int idPersona, String nombre, String apellido, String cedula, int telefono, String direccion, String correoElectrinico, String sexo, String fechaNacimiento) {
        super(idPersona, nombre, apellido, cedula, telefono, direccion, correoElectrinico, sexo, fechaNacimiento);
        this.idEStudiante = idEStudiante;
        this.numeroMatriculo = numeroMatriculo;
        this.horario = horario;
        this.jornada = jornada;
    }

    public int getIdEStudiante() {
        return idEStudiante;
    }

    public void setIdEStudiante(int idEStudiante) {
        this.idEStudiante = idEStudiante;
    }

    public int getNumeroMatriculo() {
        return numeroMatriculo;
    }

    public void setNumeroMatriculo(int numeroMatriculo) {
        this.numeroMatriculo = numeroMatriculo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
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
                + "--------DATOS DE ESTUDIANTE----------\n"
                + "Id ESTUDIANTE:" + getIdEStudiante() + "\n"
                + "NUMERO DE MATRICULA:" + getNumeroMatriculo()+ "\n"
                + "HORARIO DE CLASES:" + getHorario() + "\n"
                + "JORNADA:" + getJornada() + "\n";
    }

}
