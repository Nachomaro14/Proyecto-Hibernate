package daos;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import org.hibernate.Session;
import pojos.AsigMat;

public interface AsignaturaMatricula_IDAO {
    
    public Session getSession();
    
    public void closeSession();
    
    public void nuevaAsignaturaMatriculada(String dni, String titulo, Integer numCreditos, Integer nota);
    
    public void modificarNota(int codigo, String dni, int nota);
    
    public AsigMat getAsignaturaByDni(String dni);
    
    public ArrayList<AsigMat> getAsignaturasMatriculadas(String dni);
    
    public TableModel tablaAsigMat(ArrayList<AsigMat> asignaturas);
}