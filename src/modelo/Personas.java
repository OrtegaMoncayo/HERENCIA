/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class Personas {

    private int idPersonas;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String correoElectronico;
    private String sexo;
    private String fechaNacimiento;
    private int telefono;
    private String usuario;
    private String clave;

    public Personas() {
    }

    public Personas(int idPersonas, String nombre, String apellido, String cedula, String direccion, String correoElectronico, String sexo, String fechaNacimiento, int telefono, String usuario, String clave) {
        this.idPersonas = idPersonas;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getIdPersonas() {
        return idPersonas;
    }

    public void setIdPersonas(int idPersonas) {
        this.idPersonas = idPersonas;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String imprimir() {
        return "DATOS PERSONALES\n"
                + "ID:" + getIdPersonas() + "\n"
                + "NOMBRE;" + getNombre() + "\n"
                + "APELLIDO:" + getApellido() + "\n"
                + "CEDULA;" + getCedula() + "\n"
                + "DIRECCION:" + getDireccion() + "\n"
                + "CORREO ELECTRONICO:" + getCorreoElectronico() + "\n"
                + "SEXO:" + getSexo() + "\n"
                + "FECHA DE NACIMIENTO;" + getFechaNacimiento() + "\n"
                + "TELEFONO:" + getTelefono() + "\n"
                + "CLAVE:" + getClave() + "\n"
                + "USUARIO:" + getUsuario() + "\n";
    }

}
//
//    //METODO DE NEGOSIO VALIDACION CEDULA EXISTENTE
//    public void validarCedula() {
//        int[] listaDigitos = new int[9];
//        String cedula = this.getCedula();
//        if (cedula.length() > 10) {
//            System.out.println("INGRESE UNA CEDULA VALIDA");
//        } else if (cedula.length() == 10) {
//            for (int i = 0; i < cedula.length()-1; i++) {
//                listaDigitos[i] = cedula.charAt(i)-'0';
//                
//
//            }
//            for(int c:listaDigitos){
//                System.out.println(c);
//            }
//        } else {
//            System.out.println("REVISE EL NUMERO DE DIGITOS DE SU CEDULA");
//        }
//    }


