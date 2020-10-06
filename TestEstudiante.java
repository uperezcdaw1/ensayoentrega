
/**
 *  Para probar Git Github desde BlueJ
 *  
 */
public class TestEstudiante
{

    /**
     *  
     */
    public static void main(String[] args){
        System.out.println("Probando la clase Estudiante");
        System.out.println("Creamos varios objetos Estudiante");
        Estudiante e1 = new Estudiante("Alberto", 6);
        e1.printEstudiante();
        Estudiante e2 = new Estudiante("Ana", 8);
        e2.printEstudiante();
        Estudiante e3 = new Estudiante("Anita", 80);
        e3.printEstudiante();
        Estudiante e4 = new Estudiante("Roberto", 21);
        e4.printEstudiante();

    }
}
