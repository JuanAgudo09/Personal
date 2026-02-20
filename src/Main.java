import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //clase - objeto - instancia
        Scanner teclado = new Scanner(System.in);
        Vehiculo v1 = new Vehiculo();
        v1.setModelo("Mazda");
        v1.setNumotor("abc123");
        v1.setSerial("abc123456789");

        System.out.println(v1.toString());

        Vehiculo v2 = new Vehiculo("ford","abc123", "abc123456789");

        System.out.println(v2.toString());


        //CREAR OBJETO POR DATOS INGRESADOS POR EL USUARIO

        Vehiculo v3 = new Vehiculo();
        System.out.println("INGRESE EL MODELO DEL VEHICULO");
        v3.setModelo(teclado.next());
        System.out.println("INGRESE EL NUMERO DE MOTOR DEL VEHICULO");
        v3.setNumotor(teclado.next());
        System.out.println("INGRESE EL NUMERO DE SERIE DEL VEHICULO");
        v3.setSerial(teclado.next());


        System.out.println(v3.toString());
    }
}