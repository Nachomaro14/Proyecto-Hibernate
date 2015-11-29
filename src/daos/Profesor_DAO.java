package daos;

import factory.MyFactory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernate.NewHibernateUtil;
import hibernate.Profesores;

public class Profesor_DAO implements Profesor_IDAO{
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

    public void nuevoProfesor(Profesores p) {
        getSession().save(p);
        tx.commit();
        closeSession();
    }

    public void modificarProfesor(Profesores p) {
        getSession().saveOrUpdate(p);
        tx.commit();
        closeSession();
    }

    public void eliminarProfesor(Profesores p) {
        getSession().delete(p);
        tx.commit();
        closeSession();
    }

    public Profesores getProfesor(String dni) {
        Profesores profesor = new Profesores();
        ArrayList<Profesores> profesores = new ArrayList<>();
        String q = "FROM Profesores WHERE dni = '"+ dni +"'";
        try {
            Query query = getSession().createQuery(q);
            profesores = (ArrayList<Profesores>) query.list();
            profesor = profesores.get(0);
            return profesor;
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
    
    public String getNombreProfesor(String dni) {
        String nombre = "";
        ArrayList<String> profesores = new ArrayList<>();
        String q = "SELECT nombre FROM Profesores WHERE dni = '"+ dni +"'";
        try {
            Query query = getSession().createQuery(q);
            profesores = (ArrayList<String>) query.list();
            nombre = profesores.get(0);
            return nombre;
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
    
    public String getApellidosProfesor(String dni) {
        String apellidos = "";
        ArrayList<String> profesores = new ArrayList<>();
        String q = "SELECT apellidos FROM Profesores WHERE dni = '"+ dni +"'";
        try {
            Query query = getSession().createQuery(q);
            profesores = (ArrayList<String>) query.list();
            apellidos = profesores.get(0);
            return apellidos;
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

    public ArrayList<Profesores> getProfesores() {
        ArrayList<Profesores> profesores = new ArrayList<>();
        String q = "FROM Profesores";
        try {
            Query query = getSession().createQuery(q);
            profesores = (ArrayList<Profesores>) query.list();
            return profesores;
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
    
    public ArrayList<String> nombresProfesores() {
        ArrayList<String> profesores = new ArrayList<>();
        String q = "SELECT dni FROM Profesores";
        try {
            Query query = getSession().createQuery(q);
            profesores = (ArrayList<String>) query.list();
            return profesores;
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

    public TableModel tablaProfesores(ArrayList<Profesores> profesores) {
        DefaultTableModel tablemodel = new DefaultTableModel();
        String[] columNames = {"DNI","Apellidos","Nombre","Domicilio","Teléfono","Supervisor"};
        Object[][] data = new String[profesores.size()][6];
        for(int i = 0; i < profesores.size(); i++){
            data[i][0] = profesores.get(i).getDni();
            data[i][1] = profesores.get(i).getApellidos();
            data[i][2] = profesores.get(i).getNombre();
            data[i][3] = profesores.get(i).getDomicilio();
            data[i][4] = profesores.get(i).getTelefono();
            data[i][5] = profesores.get(i).getSupervisor();
        }
        tablemodel.setDataVector(data, columNames);
        return tablemodel;
    }
}