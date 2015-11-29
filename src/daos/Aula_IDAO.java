package daos;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import org.hibernate.Session;
import hibernate.Aulas;

public interface Aula_IDAO {
    
    public Session getSession();
    
    public void closeSession();
    
    public void nuevoAula(Aulas a);
    
    public void modificarAula(Aulas a);
    
    public void eliminarAula(Aulas a);
    
    public Aulas getAula(String edificio, int numero);
    
    public ArrayList<Aulas> getAulas();
    
    public ArrayList<String> nombresEdificios();
    
    public ArrayList<Integer> numerosAulas(String edificio);
    
    public TableModel tablaAulas(ArrayList<Aulas> aulas);
}