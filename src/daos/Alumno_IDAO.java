package daos;

import java.util.ArrayList;
import org.hibernate.Session;
import pojos.Alumnos;

public interface Alumno_IDAO {
    
    public Session getSession();
    
    public void closeSession();
    
    public void nuevoAlumno(String dni, String apellidos, String nombre, String domicilio, String telefono, String acceso);
    
    public Alumnos getAlumnoByDni(String dni);
    
    public ArrayList<Alumnos> getAlumnos();
}