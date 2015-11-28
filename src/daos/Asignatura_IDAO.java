package daos;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import org.hibernate.Session;
import pojos.Asignaturas;
import pojos.AsignaturasId;

public interface Asignatura_IDAO {
    
    public Session getSession();
    
    public void closeSession();
    
    public void nuevaAsignatura(Asignaturas a);
    
    public void modificarAsignatura(Asignaturas a);
    
    public void eliminarAsignatura(Asignaturas a);
    
    public Asignaturas getAsignaturas(int codigo, String dni);
    
    public ArrayList<Asignaturas> getAsignaturas();
    
    public TableModel tablaAsignaturas(ArrayList<Asignaturas> asignaturas);
}