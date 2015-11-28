package daos;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import org.hibernate.Session;
import pojos.Aulas;

public interface Aula_IDAO {
    
    public Session getSession();
    
    public void closeSession();
    
    public void nuevoAula(Aulas a);
    
    public void modificarAula(Aulas a);
    
    public void eliminarAula(Aulas a);
    
    public Aulas getAula(String edificio, int numero);
    
    public ArrayList<Aulas> getAulas();
    
    public TableModel tablaAulas(ArrayList<Aulas> aulas);
}