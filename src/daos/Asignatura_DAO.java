package daos;

import factory.MyFactory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.AsigMat;
import pojos.Asignaturas;
import pojos.AsignaturasId;
import pojos.NewHibernateUtil;

public class Asignatura_DAO implements Asignatura_IDAO{
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

    public void nuevaAsignatura(Asignaturas a) {
        getSession().save(a);
        tx.commit();
        closeSession();
    }

    public void modificarAsignatura(Asignaturas a) {
        getSession().saveOrUpdate(a);
        tx.commit();
        closeSession();
    }

    public void eliminarAsignatura(Asignaturas a) {
        getSession().delete(a);
        tx.commit();
        closeSession();
    }

    public ArrayList<Asignaturas> getAsignaturas() {
        ArrayList<Asignaturas> asignaturas = new ArrayList<>();
        String q = "FROM Asignaturas";
        try {
            Query query = getSession().createQuery(q);
            asignaturas = (ArrayList<Asignaturas>) query.list();
            return asignaturas;
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

    public TableModel tablaAsignaturas(ArrayList<Asignaturas> asignaturas) {
        DefaultTableModel tablemodel = new DefaultTableModel();
        String[] columNames = {"Código","Título","Créditos"};
        Object[][] data = new String[asignaturas.size()][3];
        for(int i = 0; i < asignaturas.size(); i++){
            data[i][0] = asignaturas.get(i).getId().getCodigo();
            data[i][1] = asignaturas.get(i).getId().getTitulo();
            data[i][2] = asignaturas.get(i).getNumCreditos();
        }
        tablemodel.setDataVector(data, columNames);
        return tablemodel;
    }
}