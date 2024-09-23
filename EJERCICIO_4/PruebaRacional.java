package PRACTICA_DOMICILIARIA_02.EJERCICIO_4;
import java.util.Scanner;
public class PruebaRacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // INSTANCIANDO EL PRIMER OBJETO RACIONAL R1
        System.out.print("Ingrese el numerador de R1: ");
        int numerador1 = scanner.nextInt();
        System.out.print("Ingrese el denominador de R1: ");
        int denominador1 = scanner.nextInt();
        RACIONAL r1 = new RACIONAL(numerador1, denominador1);
        
        // INSTANCIANDO EL SEGUNDO OBJETO RACIONAL R2
        System.out.print("Ingrese el numerador de R2: ");
        int numerador2 = scanner.nextInt();
        System.out.print("Ingrese el denominador de R2: ");
        int denominador2 = scanner.nextInt();
        RACIONAL r2 = new RACIONAL(numerador2, denominador2);
        
        // IMPRIMIENDO LOS DOS OBJETOS CREADOS
        System.out.println("R1: " + r1);
        System.out.println("R2: " + r2);

        // IMPRIMIENDO LA SUMA DE LOS DOS OBJETOS
        System.out.println("Suma: " + r1.suma(r2));

        // IMPRIMIENDO LA RESTA DE LOS DOS OBJETOS
        System.out.println("Resta: " + r1.resta(r2));

        // IMPRIMIENDO EL OPUESTO DEL PRIMER OBJETO
        System.out.println("Opuesto de R1: " + r1.opuesto());

        // IMPRIMIENDO EL INVERSO DEL PRIMER OBJETO
        if(r1.inverso() == null){
            System.out.println("El inverso de R1 no existe");
        }
        else{
            System.out.println("Inverso de R1: " + r1.inverso());
        }

        // IMPRIMIENDO EL OPUESTO DEL SEGUNDO OBJETO
        System.out.println("Opuesto de R2: " + r2.opuesto());

        // IMPRIMIENDO EL INVERSO DEL SEGUNDO OBJETO
        if(r2.inverso() == null){
            System.out.println("El inverso de R2 no existe");
        }
        else{
            System.out.println("Inverso de R1: " + r2.inverso());
        }
        
        scanner.close();
    }
}