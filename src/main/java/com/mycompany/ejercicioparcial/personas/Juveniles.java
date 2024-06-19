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
public class Juveniles extends persona implements Acciones{
        Scanner entrada = new Scanner(System.in);

    private Usuarios acudiente;
    private int monto;

    public Juveniles(Usuarios acudiente, int monto, String name, int edad) {
        super(name, edad);
        this.acudiente = acudiente;
        this.monto = monto;
    }
    
    
    public int hacerOpc() {
        int opc;
        System.out.println("1.RETIRAR DINERO");
        System.out.println("2.ABONAR");
        System.out.println("3. CONOCER INTERESES");
        
        opc = entrada.nextInt();
        return opc;

    }
    public double conocerInteres(){
        double intereses;
        
        intereses = monto * 0.5;
        System.out.println("INTERESES QUE TIENES " + intereses);
        
        return intereses;

    }

    @Override
    public void abonarDinero() {
        System.out.println("abonando dinero");
    }

    @Override
    public void retirarDinero() {
        System.out.println("Retirando dinero");
    }

    @Override
    public String toString() {
        return "Juveniles " + "acudiente:" + acudiente + " monto:" + monto ;
    }
    
    
}
