package daos;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import org.hibernate.Session;
import hibernate.AsigMat;

public interface AsignaturaMatricula_IDAO {
    
    public Session getSession();
    
    public void closeSession();
    
    public void nuevaAsignaturaMatriculada(AsigMat am);
    
    public void modificarAsignaturaMatriculada(AsigMat am);
    
    public void eliminarAsignaturaMatriculada(AsigMat am);
    
    public AsigMat getAsignaturaByDni(String dni);
    
    public AsigMat getAsignaturaMatriculada(String dni, int codigo);
    
    public ArrayList<AsigMat> getAsignaturasMatriculadas(String dni);
    
    public ArrayList<AsigMat> getAsignaturasMatriculadas();
    
    public TableModel tablaAsigMat(ArrayList<AsigMat> asignaturas);
}