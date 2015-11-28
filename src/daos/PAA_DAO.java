package daos;

import factory.MyFactory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.NewHibernateUtil;
import pojos.Paa;

public class PAA_DAO implements PAA_IDAO{
    Session s;
    Transaction tx;
    MyFactory factory = new MyFactory();

    public Session getSession() {
        this.s = NewHibernateUtil.getSessionFactory().openSession();
        tx = this.s.beginTransaction();
        return s;
    }

    public void closeSession() {
        s.close();
    }

    public void nuevoPAA(Paa p) {
        getSession().save(p);
        tx.commit();
        closeSession();
    }

    public void eliminarPAA(Paa p) {
        getSession().delete(p);
        tx.commit();
        closeSession();
    }

    public ArrayList<Paa> getPAA() {
        ArrayList<Paa> paa = new ArrayList<>();
        String q = "FROM Paa";
        try {
            Query query = getSession().createQuery(q);
            paa = (ArrayList<Paa>) query.list();
            return paa;
        } catch (Exception e) {
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
            return null;
        } finally {
            closeSession();
        }
    }

    public TableModel tablaAulas(ArrayList<Paa> paa) {
        DefaultTableModel tablemodel = new DefaultTableModel();
        String[] columNames = {"DNI","Apellidos","Nombre","Título","Edificio","Aula"};
        Object[][] data = new Object[paa.size()][6];
        for(int i = 0; i < paa.size(); i++){
            data[i][0] = paa.get(i).getDni();
            data[i][1] = paa.get(i).getApellidos();
            data[i][2] = paa.get(i).getNombre();
            data[i][3] = paa.get(i).getTitulo();
            data[i][4] = paa.get(i).getNombreEdificio();
            data[i][5] = paa.get(i).getNumAula();
        }
        tablemodel.setDataVector(data, columNames);
        return tablemodel;
    }
    
}