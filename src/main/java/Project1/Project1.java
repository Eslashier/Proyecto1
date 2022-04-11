package Project1;

import javax.swing.*;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

        Scanner captura = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        String nombre = captura.nextLine();
        System.out.println("Por favor ingrese su número de celular");
        long celular = captura.nextLong();
        System.out.println("Por favor ingrese su edad");
        int edad = captura.nextInt();
        System.out.println("Bienvenido señor "+nombre+", es un placer para nosotros contar con una persona de "+edad+" años");
        System.out.println("Próximamente nos comunicaremos con usted al numero "+celular+".\nFeliz día");

    }
}
