/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class Persona {

    //1.-atributos 
    private int idPersona;
    private String nombre;
    private String apellido;
    private String cedula;
    private int telefono;
    private String direccion;
    private String correoElectrinico;
    private String sexo;
    private String fechaNacimiento;

    //2.- contructores
    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellido, String cedula, int telefono, String direccion, String correoElectrinico, String sexo, String fechaNacimiento) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoElectrinico = correoElectrinico;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {  
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectrinico() {
        return correoElectrinico;
    }

    public void setCorreoElectrinico(String correoElectrinico) {
        this.correoElectrinico = correoElectrinico;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    //3.-encapsulamiento
    public void setFechaNacimiento(String fechaNacimiento) {   
        this.fechaNacimiento = fechaNacimiento;
    }

    //4.- metodo de reglas de negocio
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
                + "FECHA DE NACIMIENTO:" + getFechaNacimiento() + "\n";
    }

    //METODO DE NEGOSIO VALIDACION CEDULA EXISTENTE
    public void validarCedula() {
        int[] listaDigitos = new int[9];
        String cedula = this.getCedula();
        if (cedula.length() > 10) {
            System.out.println("INGRESE UNA CEDULA VALIDA");
        } else if (cedula.length() == 10) {
            for (int i = 0; i < cedula.length()-1; i++) {
                listaDigitos[i] = cedula.charAt(i)-'0';
                

            }
            for(int c:listaDigitos){
                System.out.println(c);
            }
        } else {
            System.out.println("REVISE EL NUMERO DE DIGITOS DE SU CEDULA");
        }
    }

}
