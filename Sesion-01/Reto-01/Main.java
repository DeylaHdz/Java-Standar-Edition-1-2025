import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Paciente paciente = new Paciente();
        System.out.println("Ingresa el nombre del paciente:");
        paciente.nombre = myObj.nextLine();
        System.out.println("Ingresa la edad del paciente:");
        paciente.edad = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Ingresa el Número de expediente del paciente:");
        paciente.expediente = myObj.nextLine();

        paciente.mostrarInformacion();
    }
}
