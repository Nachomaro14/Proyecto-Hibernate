package daos;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import org.hibernate.Session;
import pojos.Matriculas;

public interface Matricula_IDAO {
    
    public Session getSession();
    
    public void closeSession();
    
    public void nuevaMatricula(Matriculas m);
    
    public void eliminarMatricula(Matriculas m);
    
    public ArrayList<Matriculas> getMatriculas();
    
    public TableModel tablaMatriculas(ArrayList<Matriculas> matriculas);
}