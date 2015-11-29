package daos;

import factory.MyFactory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernate.Alumnos;
import hibernate.NewHibernateUtil;

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

    public void nuevoAlumno(Alumnos a) {
        getSession().save(a);
        tx.commit();
        closeSession();
    }
    
    public void eliminarAlumno(Alumnos a){
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
    
    public TableModel tablaAlumnos(ArrayList<Alumnos> alumnos){
        DefaultTableModel tablemodel = new DefaultTableModel();
        String[] columNames = {"DNI","Apellidos","Nombre","Domicilio","Teléfono","Acceso"};
        Object[][] data = new String[alumnos.size()][6];
        for(int i = 0; i < alumnos.size(); i++){
            data[i][0] = alumnos.get(i).getDni();
            data[i][1] = alumnos.get(i).getApellidos();
            data[i][2] = alumnos.get(i).getNombre();
            data[i][3] = alumnos.get(i).getDomicilio();
            data[i][4] = alumnos.get(i).getTelefono();
            data[i][5] = alumnos.get(i).getAcceso();
        }
        tablemodel.setDataVector(data, columNames);
        return tablemodel;
    }
}