package daos;

import factory.MyFactory;
import java.util.ArrayList;
import javax.swing.table.TableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Alumnos;
import pojos.NewHibernateUtil;

public class Alumno_DAO implements Alumno_IDAO{
    Session s;
    Transaction tx;
    MyFactory factory = new MyFactory();

    public Session getSession() {
        this.s = NewHibernateUtil.getSessionFactory().openSession();
        tx = this.s.beginTransaction();
        return s;
    }
    
    public void closeSession(){
        s.close();
    }

    public void nuevoAlumno(String dni, String apellidos, String nombre, String domicilio, String telefono, String acceso) {
        Alumnos a = new Alumnos(dni, apellidos, nombre, domicilio, telefono, acceso);
        getSession().save(a);
        tx.commit();
        closeSession();
    }
    
    public void eliminarAlumno(String dni){
        Alumnos a = new Alumnos(dni);
        getSession().delete(a);
        tx.commit();
        closeSession();
    }
    
    public Alumnos getAlumnoByDni(String dni) {
        Alumnos alumno = new Alumnos();
        ArrayList<Alumnos> alumnos = new ArrayList<>();
        String q = "FROM Alumnos WHERE dni = '"+ dni +"'";
        try {
            Query query = getSession().createQuery(q);
            alumnos = (ArrayList<Alumnos>) query.list();
            alumno = alumnos.get(0);
            return alumno;
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
    
    public ArrayList<Alumnos> getAlumnos(){
        ArrayList<Alumnos> alumnos = new ArrayList<>();
        String q = "FROM Alumnos";
        try {
            Query query = getSession().createQuery(q);
            alumnos = (ArrayList<Alumnos>) query.list();
            return alumnos;
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