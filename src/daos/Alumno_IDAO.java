package daos;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import org.hibernate.Session;
import hibernate.Alumnos;

public interface Alumno_IDAO {
    
    public Session getSession();
    
    public void closeSession();
    
    public void nuevoAlumno(Alumnos a);
    
    public Alumnos getAlumnoByDni(String dni);
    
    public ArrayList<Alumnos> getAlumnos();
    
    public TableModel tablaAlumnos(ArrayList<Alumnos> alumnos);
}