package daos;

import factory.MyFactory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Aulas;
import pojos.NewHibernateUtil;

public class Aula_DAO implements Aula_IDAO{
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

    public void nuevoAula(Aulas a) {
        getSession().save(a);
        tx.commit();
        closeSession();
    }

    public void modificarAula(Aulas a) {
        getSession().saveOrUpdate(a);
        tx.commit();
        closeSession();
    }

    public void eliminarAula(Aulas a) {
        getSession().delete(a);
        tx.commit();
        closeSession();
    }

    public Aulas getAula(String edificio, int numero) {
        Aulas aula = new Aulas();
        ArrayList<Aulas> aulas = new ArrayList<>();
        String q = "FROM Aulas WHERE id.getNombreEdificio() = '"+ edificio +"' AND id.getNumAula() = "+ numero;
        try {
            Query query = getSession().createQuery(q);
            aulas = (ArrayList<Aulas>) query.list();
            aula = aulas.get(0);
            return aula;
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

    public ArrayList<Aulas> getAulas() {
        ArrayList<Aulas> aulas = new ArrayList<>();
        String q = "FROM Aulas";
        try {
            Query query = getSession().createQuery(q);
            aulas = (ArrayList<Aulas>) query.list();
            return aulas;
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

    public TableModel tablaAulas(ArrayList<Aulas> aulas) {
        DefaultTableModel tablemodel = new DefaultTableModel();
        String[] columNames = {"Edificio","Aula"};
        Object[][] data = new Object[aulas.size()][2];
        for(int i = 0; i < aulas.size(); i++){
            data[i][0] = aulas.get(i).getId().getNombreEdificio();
            data[i][1] = aulas.get(i).getId().getNumAula();
        }
        tablemodel.setDataVector(data, columNames);
        return tablemodel;
    }
}