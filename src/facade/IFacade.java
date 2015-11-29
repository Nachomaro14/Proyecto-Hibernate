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
    
    public void nuevoAlumno(Alumnos a);
    
    public void eliminarAlumno(Alumnos a);
            
    public Alumnos getAlumnoByDni(String dni);
    
    public ArrayList<Alumnos> getAlumnos();
    
    public TableModel tablaAlumnos(ArrayList<Alumnos> alumnos);
    
    public void nuevaAsignaturaMatriculada(AsigMat am);
    
    public void modificarAsignaturaMatriculada(AsigMat am);
    
    public AsigMat getAsignaturaByDni(String dni);
    
    public AsigMat getAsignaturaMatriculada(String dni, int codigo);
    
    public ArrayList<AsigMat> getAsignaturasMatriculadas(String dni);
    
    public TableModel tablaAsigMat(ArrayList<AsigMat> asignaturas);
    
    public void nuevaAsignatura(Asignaturas a);
    
    public void modificarAsignatura(Asignaturas a);
            
    public void eliminarAsignatura(Asignaturas a);
    
    public Asignaturas getAsignatura(int codigo, String dni);
    
    public ArrayList<Asignaturas> getAsignaturas();
    
    public TableModel tablaAsignaturas(ArrayList<Asignaturas> asignaturas);
    
    public void nuevoAula(Aulas a);
    
    public void modificarAula(Aulas a);
    
    public void eliminarAula(Aulas a);
    
    public Aulas getAula(String edificio, int numero);
    
    public ArrayList<Aulas> getAulas();
    
    public TableModel tablaAulas(ArrayList<Aulas> aulas);
    
    public void nuevaMatricula(Matriculas m);
    
    public void eliminarMatricula(Matriculas m);
    
    public ArrayList<Matriculas> getMatriculas();
    
    public TableModel tablaMatriculas(ArrayList<Matriculas> matriculas);
    
    public void nuevoPAA(Paa p);
    
    public void eliminarPAA(Paa p);
    
    public ArrayList<Paa> getPAA();
    
    public TableModel tablaPaa(ArrayList<Paa> paa);
    
    public void nuevoProfesor(Profesores p);
    
    public void modificarProfesor(Profesores p);
    
    public void eliminarProfesor(Profesores p);
    
    public Profesores getProfesor(String dni);
    
    public ArrayList<Profesores> getProfesores();
    
    public TableModel tablaProfesores(ArrayList<Profesores> profesores);
}