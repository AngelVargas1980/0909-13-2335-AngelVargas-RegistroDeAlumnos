package Main;

import Clases.Registro;
import Clases.ScannerText;
import java.io.IOException;

public class Main {
    //Llamos a nuestro objeto Registro
    static Registro registro = new Registro();

    public static void main(String[] args) throws IOException {

        //Inicializamos nuestra opcion de nuestro MENU:
        int opcion = 0;

        //menu
        do {
            System.out.println("\n");
            System.out.println("******MENU******");
            System.out.println("");
            System.out.println("1). Ingresar Cantidad de alumnos a registrar");
            System.out.println("2). Ingresar Alumno");
            System.out.println("3). Editar Alumno");
            System.out.println("4). Mostrar Alumnos");
            System.out.println("5). Salir");
            System.out.println("Ingrese su Opción: ");
            opcion = ScannerText.datosInt();

            switch (opcion) {
                case 1:
                    registro.sizeAlumno();
                    break;
                case 2:
                    registro.ingresarAlumno();
                    break;
                case 3:
                    registro.editarAlumno();
                    break;
                case 4:
                    registro.MostrarAlumno();
                    break;
                case 5:
                    System.out.println("Pase un Feliz Día...");
                    break;
            }

        } while(opcion != 5);
        System.exit(0);
    }
}
