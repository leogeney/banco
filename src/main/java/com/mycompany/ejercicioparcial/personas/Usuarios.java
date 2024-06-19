/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioparcial.personas;

import com.mycompany.ejercicioparcial.Acciones;
import com.mycompany.ejercicioparcial.persona.persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Usuarios extends persona implements Acciones {

    Scanner entrada = new Scanner(System.in);
    private boolean extracto;
    Usuarios codeudor;
    private type types;
    private double monto;

    public Usuarios(boolean extracto, Usuarios codeudor, type types, String name, int edad, double monto) {
        super(name, edad);
        this.extracto = extracto;
        this.codeudor = codeudor;
        this.types = types;
        this.monto = monto;
    }

    public Usuarios(boolean extracto, type types, String name, int edad) {
        super(name, edad);
        this.extracto = extracto;

        this.types = types;
    }

    public int hacerOpc() {
        int opc;
        System.out.println("1.RETIRAR DINERO");
        System.out.println("2.ABONAR");
        System.out.println("3. CONOCER INTERESES");
        System.out.println("4. HACER CREDITO");
        opc = entrada.nextInt();
        return opc;

    }

    @Override
    public void abonarDinero() {

        System.out.println("ABONANDO DINERO");
    }

    @Override
    public void retirarDinero() {
        System.out.println("RETIRANDO DINERO");
    }

    public boolean isExtracto() {
        return extracto;
    }

    public Usuarios getCodeudor() {
        return codeudor;
    }

    public type getTypes() {
        return types;
    }

    public double getMonto() {
        return monto;
    }

    public double HacerCredito() {
        double beneficio;
        if (codeudor != null && extracto == true) {
            System.out.println("Su credito ha sido aceptado");
            
            beneficio = monto * 0.1;
            System.out.println("Beneficio para su cuenta de compesacion:" + beneficio);
            return beneficio;

        } else {
            System.out.println("No tiene requisitos para tener un credito");
            return 0;
        }

    }

    public double conocerInteres(){
        double intereses;
        
        intereses = monto * 0.5;
        System.out.println("INTERESES QUE TIENES " + intereses);
        
        return intereses;

    }

    @Override
    public String toString() {
        return "Usuarios{" +  "extracto:" + extracto + "codeudor:" + codeudor + " types:" + types + " monto:" + monto;
    }
    
    

}
