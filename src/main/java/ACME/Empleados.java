/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACME;

/**
 *
 * @author arrublas
 */
public class Empleados {

    // ATRIBUTOS
    private String cedula;
    private String nombre;
    private int edad;
    private int tipoEmp;
    private double horasMensuales;

    // CONSTRUCTOR
    public Empleados(String cedula, String nombre, int edad, int tipoEmp, double horasMensuales) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoEmp = tipoEmp;
        this.horasMensuales = horasMensuales;
    }

    // MÉTODOS ESTÁTICOS
    public int getTipoEmp() {
        return this.tipoEmp;
    }

    public static String tipEmpleado(int tipEmpleado) {
        switch (tipEmpleado) {
            case 1:
                return "Auxiliar";
            case 2:
                return "Profesional";
            case 3:
                return "Subgerente";
            case 4:
                return "Gerente";
            default:
                return "Numero Invalido";
        }
    }

    public static double SalarioBase(int tipEmpleado) {
        switch (tipEmpleado) {
            case 1:
                return 1_950_000;
            case 2:
                return 4_255_319;
            case 3:
                return 9_283_867;
            case 4:
                return 15_000_000;
            default:
                return 0_00;
        }
    }
}
