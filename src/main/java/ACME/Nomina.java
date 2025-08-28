/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACME;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author arrublas
 */
public class Nomina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su numero de cedula: ");
        String cedula = sc.next();  
        
        System.out.println("Ingrese su Nombre: ");
        String nombre = sc.next();
        
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        System.out.println("Ingrese las horas trabajadas en el mes (ej: 160): ");
        double horasMensuales = sc.nextDouble();
        
        System.out.println("Seleccione el numero de tipo de empleado es usted \n 1. Auxiliar \n 2. Profesional \n 3. Subgerente \n 4. Gerente");
        int tipEmpleado = sc.nextInt();  
        
        NumberFormat formatoPesos = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

        Empleados miEmpleado = new Empleados(cedula, nombre, edad, tipEmpleado, horasMensuales);
        
        double valorHora = Empleados.SalarioBase(tipEmpleado) / 160;
        double salarioBruto = valorHora * horasMensuales;
        double auxTransporte = (salarioBruto < 2_600_000) ? 300_000 : 0;
        double bonificacionEdad = (edad > 50) ? 100_000 : 0;
        
        double descuentoSalud = salarioBruto * 0.04;
        double descuentoPension = salarioBruto * 0.04;
        
        double salarioNeto = salarioBruto + auxTransporte + bonificacionEdad - descuentoSalud - descuentoPension;
        
        System.out.println("--------------Nomina-------------");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Tipo De empleado: " + Empleados.tipEmpleado(tipEmpleado));
        System.out.println("Valor por hora: " + formatoPesos.format(valorHora));
        System.out.println("Salario Bruto: " + formatoPesos.format(salarioBruto));
        System.out.println("Auxilio de transporte: " + formatoPesos.format(auxTransporte));
        System.out.println("Bonificación por edad: " + formatoPesos.format(bonificacionEdad));
        System.out.println("Descuento Salud (4%): " + formatoPesos.format(descuentoSalud));
        System.out.println("Descuento Pensión (4%): " + formatoPesos.format(descuentoPension));
        System.out.println("Salario Neto: " + formatoPesos.format(salarioNeto));
    }
}
