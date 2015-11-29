package hibernate;
// Generated 27-nov-2015 21:33:44 by Hibernate Tools 4.3.1



/**
 * Matriculas generated by hbm2java
 */
public class Matriculas  implements java.io.Serializable {


     private Integer codMat;
     private String dni;
     private String apellidos;
     private String nombre;
     private String domicilio;
     private String telefono;
     private String acceso;

    public Matriculas() {
    }

    public Matriculas(String dni, String apellidos, String nombre, String domicilio, String telefono, String acceso) {
       this.dni = dni;
       this.apellidos = apellidos;
       this.nombre = nombre;
       this.domicilio = domicilio;
       this.telefono = telefono;
       this.acceso = acceso;
    }
   
    public Integer getCodMat() {
        return this.codMat;
    }
    
    public void setCodMat(Integer codMat) {
        this.codMat = codMat;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getAcceso() {
        return this.acceso;
    }
    
    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }




}

