package daos;

import factory.MyFactory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernate.Matriculas;
import hibernate.NewHibernateUtil;

public class Matricula_DAO implements Matricula_IDAO{
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

    public void nuevaMatricula(Matriculas m) {
        getSession().save(m);
        tx.commit();
        closeSession();
    }

    public void eliminarMatricula(Matriculas m) {
        getSession().delete(m);
        tx.commit();
        closeSession();
    }
    
    public Matriculas getMatriculaByDni(String dni){
        Matriculas matricula = new Matriculas();
        ArrayList<Matriculas> matriculas = new ArrayList<>();
        String q = "FROM Matriculas WHERE dni = '"+ dni +"'";
        try {
            Query query = getSession().createQuery(q);
            matriculas = (ArrayList<Matriculas>) query.list();
            matricula = matriculas.get(0);
            return matricula;
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

    public ArrayList<Matriculas> getMatriculas() {
        ArrayList<Matriculas> matriculas = new ArrayList<>();
        String q = "FROM Matriculas";
        try {
            Query query = getSession().createQuery(q);
            matriculas = (ArrayList<Matriculas>) query.list();
            return matriculas;
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

    public TableModel tablaMatriculas(ArrayList<Matriculas> matriculas) {
        DefaultTableModel tablemodel = new DefaultTableModel();
        String[] columNames = {"Código","DNI","Apellidos","Nombre","Domicilio","Teléfono","Acceso"};
        Object[][] data = new Object[matriculas.size()][7];
        for(int i = 0; i < matriculas.size(); i++){
            data[i][0] = matriculas.get(i).getCodMat();
            data[i][1] = matriculas.get(i).getDni();
            data[i][2] = matriculas.get(i).getApellidos();
            data[i][3] = matriculas.get(i).getNombre();
            data[i][4] = matriculas.get(i).getDomicilio();
            data[i][5] = matriculas.get(i).getTelefono();
            data[i][6] = matriculas.get(i).getAcceso();
        }
        tablemodel.setDataVector(data, columNames);
        return tablemodel;
    }
    
}