package facade;

import java.util.ArrayList;
import javax.swing.table.TableModel;
import pojos.Alumnos;
import pojos.AsigMat;
import pojos.Asignaturas;
import pojos.Aulas;
import pojos.Matriculas;
import pojos.Paa;
import pojos.Profesores;

public interface IFacade {
    
    public Alumnos getAlumnoByDni(String dni);
    
    public ArrayList<Alumnos> getAlumnos();
    
    public TableModel tablaAlumnos(ArrayList<Alumnos> alumnos);
    
    public AsigMat getAsignaturaByDni(String dni);
    
    public AsigMat getAsignaturaMatriculada(String dni, int codigo);
    
    public ArrayList<AsigMat> getAsignaturasMatriculadas(String dni);
    
    public TableModel tablaAsigMat(ArrayList<AsigMat> asignaturas);
    
    public Asignaturas getAsignatura(int codigo, String dni);
    
    public ArrayList<Asignaturas> getAsignaturas();
    
    public TableModel tablaAsignaturas(ArrayList<Asignaturas> asignaturas);
    
    public Aulas getAula(String edificio, int numero);
    
    public ArrayList<Aulas> getAulas();
    
    public TableModel tablaAulas(ArrayList<Aulas> aulas);
    
    public ArrayList<Matriculas> getMatriculas();
    
    public TableModel tablaMatriculas(ArrayList<Matriculas> matriculas);
    
    public ArrayList<Paa> getPAA();
    
    public TableModel tablaPaa(ArrayList<Paa> paa);
    
    public Profesores getProfesor(String dni);
    
    public ArrayList<Profesores> getProfesores();
    
    public TableModel tablaProfesores(ArrayList<Profesores> profesores);
}