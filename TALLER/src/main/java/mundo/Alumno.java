/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author Asus
 */
public class Alumno {
    private String cedula;
    private String nombre;
    private String apellido;
    private String semestre;
    private String correo;
    private String celular;
	

    public Alumno() {
    }

    public Alumno(String Cedula, String Nombre, String Apellido, String Semestre, String Correo, String Celular) {
        this.cedula = Cedula;
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.semestre = Semestre;
        this.correo = Correo;
        this.celular = Celular;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCedula(String Cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String Apellido) {
        this.apellido = apellido;
    }

    public void setSemestre(String Semestre) {
        this.semestre = semestre;
    }

    public void setCorreo(String Correo) {
        this.correo = correo;
    }

    public void setCelular(String Celular) {
        this.celular = celular;
    }
    
}
