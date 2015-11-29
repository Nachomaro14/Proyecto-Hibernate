package facade;

import daos.Alumno_DAO;
import daos.AsignaturaMatricula_DAO;
import daos.Asignatura_DAO;
import daos.Aula_DAO;
import daos.Matricula_DAO;
import daos.PAA_DAO;
import daos.Profesor_DAO;
import factory.MyFactory;
import java.util.ArrayList;
import javax.swing.table.TableModel;
import pojos.Alumnos;
import pojos.AsigMat;
import pojos.Asignaturas;
import pojos.Aulas;
import pojos.Matriculas;
import pojos.Paa;
import pojos.Profesores;

public class Facade implements IFacade{
    MyFactory factory = new MyFactory();

    public Alumnos getAlumnoByDni(String dni) {
        Alumno_DAO alumno = (Alumno_DAO) factory.getObject("ALUMNO");
        return alumno.getAlumnoByDni(dni);
    }

    public ArrayList<Alumnos> getAlumnos() {
        Alumno_DAO alumno = (Alumno_DAO) factory.getObject("ALUMNO");
        return alumno.getAlumnos();
    }

    public TableModel tablaAlumnos(ArrayList<Alumnos> alumnos) {
        Alumno_DAO alumno = (Alumno_DAO) factory.getObject("ALUMNO");
        return alumno.tablaAlumnos(alumnos);
    }

    public AsigMat getAsignaturaByDni(String dni) {
        AsignaturaMatricula_DAO asignatura = (AsignaturaMatricula_DAO) factory.getObject("ASIGNATURAMATRICULA");
        return asignatura.getAsignaturaByDni(dni);
    }

    public AsigMat getAsignaturaMatriculada(String dni, int codigo) {
        AsignaturaMatricula_DAO asignatura = (AsignaturaMatricula_DAO) factory.getObject("ASIGNATURAMATRICULA");
        return asignatura.getAsignaturaMatriculada(dni, codigo);
    }

    public ArrayList<AsigMat> getAsignaturasMatriculadas(String dni) {
        AsignaturaMatricula_DAO asignatura = (AsignaturaMatricula_DAO) factory.getObject("ASIGNATURAMATRICULA");
        return asignatura.getAsignaturasMatriculadas(dni);
    }

    public TableModel tablaAsigMat(ArrayList<AsigMat> asignaturas) {
        AsignaturaMatricula_DAO asignatura = (AsignaturaMatricula_DAO) factory.getObject("ASIGNATURAMATRICULA");
        return asignatura.tablaAsigMat(asignaturas);
    }

    public Asignaturas getAsignatura(int codigo, String dni) {
        Asignatura_DAO asignatura = (Asignatura_DAO) factory.getObject("ASIGNATURA");
        return asignatura.getAsignatura(codigo, dni);
    }
    
    public Asignaturas getAsignaturaByTitulo(String titulo) {
        Asignatura_DAO asignatura = (Asignatura_DAO) factory.getObject("ASIGNATURA");
        return asignatura.getAsignaturaByTitulo(titulo);
    }

    public ArrayList<Asignaturas> getAsignaturas() {
        Asignatura_DAO asignatura = (Asignatura_DAO) factory.getObject("ASIGNATURA");
        return asignatura.getAsignaturas();
    }
    
    public ArrayList<String> nombresAsignaturas() {
        Asignatura_DAO asignatura = (Asignatura_DAO) factory.getObject("ASIGNATURA");
        return asignatura.nombresAsignaturas();
    }

    public TableModel tablaAsignaturas(ArrayList<Asignaturas> asignaturas) {
        Asignatura_DAO asignatura = (Asignatura_DAO) factory.getObject("ASIGNATURA");
        return asignatura.tablaAsignaturas(asignaturas);
    }

    public Aulas getAula(String edificio, int numero) {
        Aula_DAO aula = (Aula_DAO) factory.getObject("AULA");
        return aula.getAula(edificio, numero);
    }

    public ArrayList<Aulas> getAulas() {
        Aula_DAO aula = (Aula_DAO) factory.getObject("AULA");
        return aula.getAulas();
    }

    public TableModel tablaAulas(ArrayList<Aulas> aulas) {
        Aula_DAO aula = (Aula_DAO) factory.getObject("AULA");
        return aula.tablaAulas(aulas);
    }

    public ArrayList<Matriculas> getMatriculas() {
        Matricula_DAO matricula = (Matricula_DAO) factory.getObject("MATRICULA");
        return matricula.getMatriculas();
    }
    
    public Matriculas getMatriculaByDni(String dni) {
        Matricula_DAO matricula = (Matricula_DAO) factory.getObject("MATRICULA");
        return matricula.getMatriculaByDni(dni);
    }

    public TableModel tablaMatriculas(ArrayList<Matriculas> matriculas) {
        Matricula_DAO matricula = (Matricula_DAO) factory.getObject("MATRICULA");
        return matricula.tablaMatriculas(matriculas);
    }

    public ArrayList<Paa> getPAA() {
        PAA_DAO p = (PAA_DAO) factory.getObject("PAA");
        return p.getPAA();
    }

    public TableModel tablaPaa(ArrayList<Paa> paa) {
        PAA_DAO p = (PAA_DAO) factory.getObject("PAA");
        return p.tablaPaa(paa);
    }

    public Profesores getProfesor(String dni) {
        Profesor_DAO profesor = (Profesor_DAO) factory.getObject("PROFESOR");
        return profesor.getProfesor(dni);
    }

    public ArrayList<Profesores> getProfesores() {
        Profesor_DAO profesor = (Profesor_DAO) factory.getObject("PROFESOR");
        return profesor.getProfesores();
    }

    public TableModel tablaProfesores(ArrayList<Profesores> profesores) {
        Profesor_DAO profesor = (Profesor_DAO) factory.getObject("PROFESOR");
        return profesor.tablaProfesores(profesores);
    }

    public void nuevoAlumno(Alumnos a) {
        Alumno_DAO alumno = (Alumno_DAO) factory.getObject("ALUMNO");
        alumno.nuevoAlumno(a);
    }

    public void eliminarAlumno(Alumnos a) {
        Alumno_DAO alumno = (Alumno_DAO) factory.getObject("ALUMNO");
        alumno.eliminarAlumno(a);
    }

    public void nuevaAsignaturaMatriculada(AsigMat am) {
        AsignaturaMatricula_DAO asignatura = (AsignaturaMatricula_DAO) factory.getObject("ASIGNATURAMATRICULA");
        asignatura.nuevaAsignaturaMatriculada(am);
    }

    public void modificarAsignaturaMatriculada(AsigMat am) {
        AsignaturaMatricula_DAO asignatura = (AsignaturaMatricula_DAO) factory.getObject("ASIGNATURAMATRICULA");
        asignatura.modificarAsignaturaMatriculada(am);
    }
    
    public void eliminarAsignaturaMatriculada(AsigMat am) {
        AsignaturaMatricula_DAO asignatura = (AsignaturaMatricula_DAO) factory.getObject("ASIGNATURAMATRICULA");
        asignatura.eliminarAsignaturaMatriculada(am);
    }

    public void nuevaAsignatura(Asignaturas a) {
        Asignatura_DAO asignatura = (Asignatura_DAO) factory.getObject("ASIGNATURA");
        asignatura.nuevaAsignatura(a);
    }

    public void modificarAsignatura(Asignaturas a) {
        Asignatura_DAO asignatura = (Asignatura_DAO) factory.getObject("ASIGNATURA");
        asignatura.modificarAsignatura(a);
    }

    public void eliminarAsignatura(Asignaturas a) {
        Asignatura_DAO asignatura = (Asignatura_DAO) factory.getObject("ASIGNATURA");
        asignatura.eliminarAsignatura(a);
    }

    public void nuevoAula(Aulas a) {
        Aula_DAO aula = (Aula_DAO) factory.getObject("AULA");
        aula.nuevoAula(a);
    }

    public void modificarAula(Aulas a) {
        Aula_DAO aula = (Aula_DAO) factory.getObject("AULA");
        aula.modificarAula(a);
    }

    public void eliminarAula(Aulas a) {
        Aula_DAO aula = (Aula_DAO) factory.getObject("AULA");
        aula.eliminarAula(a);
    }

    public void nuevaMatricula(Matriculas m) {
        Matricula_DAO matricula = (Matricula_DAO) factory.getObject("MATRICULA");
        matricula.nuevaMatricula(m);
    }

    public void eliminarMatricula(Matriculas m) {
        Matricula_DAO matricula = (Matricula_DAO) factory.getObject("MATRICULA");
        matricula.eliminarMatricula(m);
    }

    public void nuevoPAA(Paa p) {
        PAA_DAO paa = (PAA_DAO) factory.getObject("PAA");
        paa.nuevoPAA(p);
    }

    public void eliminarPAA(Paa p) {
        PAA_DAO paa = (PAA_DAO) factory.getObject("PAA");
        paa.eliminarPAA(p);
    }

    public void nuevoProfesor(Profesores p) {
        Profesor_DAO profesor = (Profesor_DAO) factory.getObject("PROFESOR");
        profesor.nuevoProfesor(p);
    }

    public void modificarProfesor(Profesores p) {
        Profesor_DAO profesor = (Profesor_DAO) factory.getObject("PROFESOR");
        profesor.modificarProfesor(p);
    }

    public void eliminarProfesor(Profesores p) {
        Profesor_DAO profesor = (Profesor_DAO) factory.getObject("PROFESOR");
        profesor.eliminarProfesor(p);
    }
    
}