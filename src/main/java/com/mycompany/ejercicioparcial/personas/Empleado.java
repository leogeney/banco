/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioparcial.personas;

import com.mycompany.ejercicioparcial.compesacion.compensacion;
import com.mycompany.ejercicioparcial.persona.persona;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Empleado extends persona {

    Scanner entrada = new Scanner(System.in);
    File file;
    private String rol;

    public Empleado(String rol, String name, int edad) {
        super(name, edad);
        this.rol = rol;

    }

    public int CrearCuenta() {
        int edad;
        System.out.println("CREANDO CUENTA...");
        System.out.println("DATOS: NOMBRE, CODEUDOR,TIPO");//aqui ya tiene datos por defecto

        System.out.println("CUANTOS AÑOS TIENES");
        edad = entrada.nextInt();
        System.out.println("Cuenta creada...");
        return edad;
    }

    public void createFile() {
        try {
            file = new File("information.txt");
            if (file.createNewFile()) {
                System.out.println("archivo creado");
            } else {
                System.out.println("Archivo ya existente");
            }

        } catch (Exception ex) {
            System.out.println("error a la hora de crear archivo");
        }

    }

    public void registros(Usuarios usuario, int accion) {
        try {
            FileWriter writer = new FileWriter(file);

            writer.write(usuario + " accion que hizo" + accion);
            writer.close();
        } catch (Exception ex) {

        }

    }

    public void registros(Juveniles juvenil, int accion) {
        try {
            FileWriter writer = new FileWriter(file);

            writer.write(juvenil + " accion que hizo" + accion);
            writer.close();

        } catch (Exception ex) {

        }

    }

}
