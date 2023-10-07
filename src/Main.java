import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");


        System.out.println("\nBienvenido a MAKAI.");

        List<Velero> vel = new ArrayList<>();
        List<Yate> yat = new ArrayList<>();
        Capitan capitan = new Capitan("Pepito", "Pérez", "123456");

        System.out.println("El capitán de la embarcación será: \n");
        System.out.println(capitan.muestraDatos());






        int opcion = 0;
        // variables donde se leen los numeros de mastiles y camarotes
        int nm = 0;
        int nc = 0;

        // contadores para dar orden
        int nv =0;
        int ny=0;

        // variables donde se leen los años
        int afabv = 0;
        int afaby = 0;

        do {
            System.out.println("\nPor favor, seleccione la acción que desea realizar");
            System.out.println("1. Alquilar Velero");
            System.out.println("2. Alquilar Yate");
            System.out.println("3. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    nv=nv+1;
                    System.out.println("Ingrese el año de fabricación");
                    afabv = leer.nextInt();
                    System.out.println("Ingrese el numero de mastiles");
                    nm = leer.nextInt();

                    Velero velero = new Velero(capitan, 100000.0, 20000.0, afabv, 10.0, nm);
                    vel.add(velero);
                    System.out.println("\nAlquiler velero "+nv+" : $" + velero.calcularAlquiler());
                    if (velero.validar()) {
                        System.out.println("El velero es grande");
                    } else {
                        System.out.println("El velero es pequeño");
                    }

                    break;
                case 2:
                    ny=ny+1;
                    System.out.println("Ingrese el año de fabricación");
                    afaby = leer.nextInt();
                    System.out.println("Ingrese el numero de camarotes");
                    nc = leer.nextInt();

                    Yate yate = new Yate(capitan, 200000.0, 20000.0, afaby, 12.0, nc);
                    yat.add(yate);
                    System.out.println("Alquiler yate "+ny+" : $"  + yate.calcularAlquiler());
                    if (yate.validar()) {
                        System.out.println("El yate es de lujo");
                    } else {
                        System.out.println("El yate es estandar");
                    }

                    break;
                case 3:
                    System.out.println("Salió correctamente");
                    break;

            }
        } while (opcion != 3);  // 3 salir





    }
}