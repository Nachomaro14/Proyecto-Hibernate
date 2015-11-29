package daos;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import org.hibernate.Session;
import hibernate.Paa;

public interface PAA_IDAO {
    
    public Session getSession();
    
    public void closeSession();
    
    public void nuevoPAA(Paa p);
    
    public void eliminarPAA(Paa p);
    
    public Paa getPAAByCodigo(int codigo);
    
    public int getCodigoPAA(String dni, String titulo, String edificio, int aula);
    
    public ArrayList<Paa> getPAA();
    
    public TableModel tablaPaa(ArrayList<Paa> paa);
}