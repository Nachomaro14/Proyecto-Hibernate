package daos;

import factory.MyFactory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernate.Alumnos;
import hibernate.Asignaturas;
import hibernate.NewHibernateUtil;

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
    
    public Asignaturas getAsignatura(int codigo, String titulo) {
        Asignaturas asignatura = new Asignaturas();
        ArrayList<Asignaturas> asignaturas = new ArrayList<>();
        String q = "FROM Asignaturas WHERE id.getCodigo() = "+ codigo +" AND id.getTitulo() = '"+ titulo +"'";
        try {
            Query query = getSession().createQuery(q);
            asignaturas = (ArrayList<Asignaturas>) query.list();
            asignatura = asignaturas.get(0);
            return asignatura;
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
    
    public ArrayList<String> nombresAsignaturas() {
        ArrayList<String> asignaturas = new ArrayList<>();
        String q = "SELECT id.titulo FROM Asignaturas";
        try {
            Query query = getSession().createQuery(q);
            asignaturas = (ArrayList<String>) query.list();
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
        Object[][] data = new Object[asignaturas.size()][3];
        for(int i = 0; i < asignaturas.size(); i++){
            data[i][0] = asignaturas.get(i).getId().getCodigo();
            data[i][1] = asignaturas.get(i).getId().getTitulo();
            data[i][2] = asignaturas.get(i).getNumCreditos();
        }
        tablemodel.setDataVector(data, columNames);
        return tablemodel;
    }

    public Asignaturas getAsignaturaByTitulo(String titulo) {
        Asignaturas asignatura = new Asignaturas();
        ArrayList<Asignaturas> asignaturas = new ArrayList<>();
        String q = "FROM Asignaturas WHERE titulo = '"+ titulo +"'";
        try {
            Query query = getSession().createQuery(q);
            asignaturas = (ArrayList<Asignaturas>) query.list();
            asignatura = asignaturas.get(0);
            return asignatura;
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
}