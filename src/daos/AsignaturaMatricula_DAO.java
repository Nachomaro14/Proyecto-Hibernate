package daos;

import factory.MyFactory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernate.AsigMat;
import hibernate.NewHibernateUtil;

public class AsignaturaMatricula_DAO implements AsignaturaMatricula_IDAO{
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

    public void nuevaAsignaturaMatriculada(AsigMat am) {
        getSession().save(am);
        tx.commit();
        closeSession();
    }

    public void modificarAsignaturaMatriculada(AsigMat am) {
        getSession().saveOrUpdate(am);
        tx.commit();
        closeSession();
    }

    public AsigMat getAsignaturaByDni(String dni) {
        AsigMat asigMat = new AsigMat();
        ArrayList<AsigMat> asignaturas = new ArrayList<>();
        String q = "FROM AsigMat WHERE dni = '"+ dni +"'";
        try {
            Query query = getSession().createQuery(q);
            asignaturas = (ArrayList<AsigMat>) query.list();
            asigMat = asignaturas.get(0);
            return asigMat;
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
    
    public AsigMat getAsignaturaMatriculada(String dni, int codigo) {
        AsigMat asigMat = new AsigMat();
        ArrayList<AsigMat> asignaturas = new ArrayList<>();
        String q = "FROM AsigMat WHERE dni = '"+ dni +"' AND codigo = "+ codigo;
        try {
            Query query = getSession().createQuery(q);
            asignaturas = (ArrayList<AsigMat>) query.list();
            asigMat = asignaturas.get(0);
            return asigMat;
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

    public ArrayList<AsigMat> getAsignaturasMatriculadas(String dni) {
        ArrayList<AsigMat> asignaturas = new ArrayList<>();
        String q = "FROM AsigMat WHERE dni = '"+ dni +"'";
        try {
            Query query = getSession().createQuery(q);
            asignaturas = (ArrayList<AsigMat>) query.list();
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

    public TableModel tablaAsigMat(ArrayList<AsigMat> asignaturas) {
        DefaultTableModel tablemodel = new DefaultTableModel();
        String[] columNames = {"Código","DNI","Título","Créditos","Nota"};
        Object[][] data = new Object[asignaturas.size()][5];
        for(int i = 0; i < asignaturas.size(); i++){
            data[i][0] = asignaturas.get(i).getCodigo();
            data[i][1] = asignaturas.get(i).getDni();
            data[i][2] = asignaturas.get(i).getTitulo();
            data[i][3] = asignaturas.get(i).getNumCreditos();
            data[i][4] = asignaturas.get(i).getNota();
        }
        tablemodel.setDataVector(data, columNames);
        return tablemodel;
    }

    public void eliminarAsignaturaMatriculada(AsigMat am) {
        getSession().delete(am);
        tx.commit();
        closeSession();
    }

    public ArrayList<AsigMat> getAsignaturasMatriculadas() {
        ArrayList<AsigMat> asignaturas = new ArrayList<>();
        String q = "FROM AsigMat";
        try {
            Query query = getSession().createQuery(q);
            asignaturas = (ArrayList<AsigMat>) query.list();
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
}