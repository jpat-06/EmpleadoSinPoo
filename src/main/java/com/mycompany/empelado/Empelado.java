/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empelado;

import java.util.Scanner;

/**
 *
 * @author bulldogsbarber
 */
public class Empelado {
//PUBLIC es un modificador de acseso 
    public static void main(String[] args) {
        /* crear un programa que solicite el nombre y las horas trabajadas del empleado y 
        calcule lo siguiente:
        1. Bono, que corresponte al 20% del sueldo base
        2. Bono escolar que corresponde al 80% del sueldo base 
        3. Descuento que corresponde al 10% del sueldo calculado
            Deberas ingresar el nombre y las horas trabajadas por cada empleado
        */
        
        String nombreEmpleado;
        double sueldoBase;
        double horasTrabajadas;
        double valorHora =15.00;
        double bono =0.20;
        double bonoEscolar =0.80;
        double descuento = 0.10;
        double sueldoFinal;
        
        Scanner entrada =new Scanner(System.in);//el metodo scanner me permite ingresar valores por teclado en este caso dandole un valor a scanner como 'entrada'
        System.out.println( "ingrese el nombre del empleado");
        nombreEmpleado = entrada.nextLine();//ponemos .nextLines cuando la entrada es String
        System.out.println( "ingrese las horas trabajadas");
        horasTrabajadas = entrada.nextDouble();// ponemos .nextDouble(); cuando el valor es decimal, pero cuando es entero(int) seria .nextInt();
        
        System.out.println("****CALCULO FINAL DEL SUELDO MENSUAL******");
        System.out.println("total horas trabajadas:" + horasTrabajadas);
            sueldoBase= (horasTrabajadas * valorHora);//aqui calculo el valor de las horas trabajadas segun el total de las horas trabajadas
        System.out.println("Sueldo sobre las horas trabajadas :" + sueldoBase+"$");
        System.out.println("Bono:" + (sueldoBase * bono)+"$");
        System.out.println("Bono escolar:" + (sueldoBase * bonoEscolar)+"$");
        System.out.println("Descuento:" + (sueldoBase * descuento)+"$");
        
        System.out.println("****SUELDO FINAL*******");
        
        
        sueldoFinal= (sueldoBase + (sueldoBase * bono)+(sueldoBase * bonoEscolar)-(sueldoBase * descuento));
        //aqui estoy calculando los bonos que tiene el empleado segun el total de las horas trabajadas
            
        System.out.println("nombre del empleado: "+ nombreEmpleado);
            
            System.out.println("Sueldo final mas bonificacion: "+ sueldoFinal+"$");
        
    }
}
