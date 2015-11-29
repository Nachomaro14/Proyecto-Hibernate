package daos;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import org.hibernate.Session;
import hibernate.Asignaturas;

public interface Asignatura_IDAO {
    
    public Session getSession();
    
    public void closeSession();
    
    public void nuevaAsignatura(Asignaturas a);
    
    public void modificarAsignatura(Asignaturas a);
    
    public void eliminarAsignatura(Asignaturas a);
    
    public Asignaturas getAsignatura(int codigo, String titulo);
    
    public Asignaturas getAsignaturaByTitulo(String titulo);
    
    public ArrayList<Asignaturas> getAsignaturas();
    
    public ArrayList<String> nombresAsignaturas();
    
    public TableModel tablaAsignaturas(ArrayList<Asignaturas> asignaturas);
}