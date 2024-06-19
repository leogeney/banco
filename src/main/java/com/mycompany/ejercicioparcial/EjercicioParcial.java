/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicioparcial;

import com.mycompany.ejercicioparcial.compesacion.compensacion;
import com.mycompany.ejercicioparcial.personas.Empleado;
import com.mycompany.ejercicioparcial.personas.Juveniles;
import com.mycompany.ejercicioparcial.personas.Usuarios;
import static com.mycompany.ejercicioparcial.personas.type.INDEPENDIENTE;

/**
 *
 * @author Usuario
 */
public class EjercicioParcial {

    public static void main(String[] args) {
        double beneficio;
        int accion;
        int edad;
        Empleado empleado1 = new Empleado("CAJERO", "EL TEMACH", 34);

        Usuarios usuario1 = new Usuarios(true, INDEPENDIENTE, "LEONARDO GENEY", 23);//CODEUDOR O ACUEDIENTE
        edad = empleado1.CrearCuenta();

        if (edad >= 18) {
            Usuarios usuario2 = new Usuarios(true, usuario1, INDEPENDIENTE, "JEFER GENEY", edad, 3400);
            accion = usuario2.hacerOpc();

            if (accion == 1) {
                usuario2.retirarDinero();
            } else if (accion == 2) {
                usuario2.abonarDinero();
            } else if (accion == 3) {
                usuario2.conocerInteres();

            } else if (accion == 4) {
                beneficio = usuario2.HacerCredito();

                compensacion compensacion1 = new compensacion(usuario2, beneficio);
            }
            empleado1.createFile();
            empleado1.registros(usuario2, accion);

        } else if (edad >= 14 && edad < 18) {
            Juveniles juvenil1 = new Juveniles(usuario1, 2000, "leonrdo", edad);

            accion = juvenil1.hacerOpc();
            if (accion == 1) {
                juvenil1.retirarDinero();
            } else if (accion == 2) {
                juvenil1.abonarDinero();
            } else if (accion == 3) {
                juvenil1.conocerInteres();
            }
            empleado1.createFile();
            empleado1.registros(juvenil1, accion);

        } else {
            System.out.println("no puede tener cuenta");
        }
    }
}
