package mvc;

import mvc.Controlador;
import vista.Interfaz;

public class Main {
    
    public static void main(String[] args){
        new Controlador(new Interfaz()).iniciar();
    }
}