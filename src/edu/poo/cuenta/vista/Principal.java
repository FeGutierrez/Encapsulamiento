/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poo.cuenta.vista;

import edu.poo.cuenta.modelo.Cuenta;
import edu.poo.cuenta.modelo.Producto;
import edu.poo.cuenta.modelo.Tienda;

/**
 *
 * @author Estudiante
 */

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Creacion de cuentas");
        System.out.println("Ingrese numero");
        int numero = sc.nextInt();
        
        System.out.println("Ingrese clave");
        int clave = sc.nextInt();
        System.out.println("Ingrese el duenio");
        String duennio = sc.next();
        
        System.out.println("Ingrese saldo");
        double saldo = sc.nextDouble();
        
        Cuenta cuenta = new Cuenta(numero, clave, duennio, saldo);
        System.out.println("Valor a consignar");
        double valor = sc.nextDouble();
        boolean resultado = cuenta.consignar(valor);
        if (resultado==true) {
                System.out.println("Consignacion exitosa");
                System.out.println("Nuevo saldo: " + cuenta.getSaldo());
        } else {
            System.out.println("Consignacion fallida");
        };
        
        
        /*Cuenta c1 = new Cuenta(1, 123, "FG", 10);
      double saldo = c1.getSaldo();
      System.out.println("Saldo tst " + saldo);
        
      int varClase = Cuenta.VariableDeClase;
      System.out.println(varClase);
      
      Cuenta.incrementarVariable();
      
      varClase = Cuenta.VariableDeClase;
      System.out.println(varClase);
        
      
      Tienda tienda = new Tienda("A");
      Producto producto = new Producto("P",1, 10);
      tienda.producto = producto;
      
      double precioProductoTienda = 
              tienda.producto.getPrecio();
        System.out.println(precioProductoTienda);
    }*/
}
