package PRACTICA_DOMICILIARIA_02.EJERCICIO_4;

import java.util.Scanner;
public class RACIONAL {
    // ATRIBUTOS
    private int numerador; 
    private int denominador;
    private Scanner scanner;
    
    // CONSTRUCTOR
    public RACIONAL(int numerador, int denominador){
        // VERIFICANDO SI EL DENOMINADOR ES CERO O NO
        for(int i=1;i<2;i++){
            if(denominador<0 || denominador>0){
                this.numerador = numerador;
                this.denominador = denominador;
                simplificar();
            }
            else{
                scanner = new Scanner(System.in);
                System.out.println("El denominador no puede ser 0");
                System.out.print("Ingrese otro denominador: ");
                denominador = scanner.nextInt();
                i--;
            }
        }
    }

    // METODO PARA SIMPLIFICAR EL NUMERO RACIONAL
    private void simplificar() {
        int mcd = mcd(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    // METODO PARA OBTENER EL MCD
    private int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    // METODO PARA OBTENER LA SUMA DE DOS RACIONALES
    public RACIONAL suma(RACIONAL r){
        int n = this.numerador * r.denominador + r.numerador * this.denominador;
        int d = this.denominador * r.denominador;
        return new RACIONAL(n, d);
    }

    // METODO PARA OBTENER LA RESTA DE DOS RACIONALES
    public RACIONAL resta(RACIONAL r){
        int n = this.numerador * r.denominador - r.numerador * this.denominador;
        int d = this.denominador * r.denominador;
        return new RACIONAL(n, d);
    }

    // METODO PARA OBTENER EL OPUESTO DE UN RACIONAL
    public RACIONAL opuesto(){
        return new RACIONAL(-numerador, denominador);
    }

    // METODO PARA OBTENER EL INVERSO DE UN RACIONAL
    public RACIONAL inverso(){
        if(numerador == 0){
            return null;
        }
        return new RACIONAL(denominador,numerador);
    }

    // METODO PARA DAR FORMATO DE SALIDA
    public String toString() {
        return numerador + "/" + denominador;
    }
}