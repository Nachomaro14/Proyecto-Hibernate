package daos;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import org.hibernate.Session;
import pojos.Profesores;

public interface Profesor_IDAO {
    
    public Session getSession();
    
    public void closeSession();
    
    public void nuevoProfesor(Profesores p);
    
    public void modificarProfesor(Profesores p);
    
    public void eliminarProfesor(Profesores p);
    
    public Profesores getProfesor(String dni);
    
    public ArrayList<Profesores> getProfesores();
    
    public TableModel tablaProfesores(ArrayList<Profesores> profesores);
}