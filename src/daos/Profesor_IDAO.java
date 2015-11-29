package daos;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import org.hibernate.Session;
import hibernate.Profesores;

public interface Profesor_IDAO {
    
    public Session getSession();
    
    public void closeSession();
    
    public void nuevoProfesor(Profesores p);
    
    public void modificarProfesor(Profesores p);
    
    public void eliminarProfesor(Profesores p);
    
    public Profesores getProfesor(String dni);
    
    public String getNombreProfesor(String dni);
    
    public String getApellidosProfesor(String dni);
    
    public ArrayList<Profesores> getProfesores();
    
    public ArrayList<String> nombresProfesores();
    
    public TableModel tablaProfesores(ArrayList<Profesores> profesores);
}