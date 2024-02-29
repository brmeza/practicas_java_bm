package Ejercicio1;

import java.util.Scanner;

public class Ejecucion {

    public void practica(){

        String nombre;
        double saldo, ingreso, reintegro, trasferencia;
        Scanner sc = new Scanner(System.in);

        Cuenta cuenta1 = new Cuenta("Brayan","123",0,1000);
        Cuenta cuenta2 = new Cuenta();

        System.out.println("ingresar nombre");
        nombre = sc.next();

        System.out.println("Ingresar saldo");
        saldo = sc.nextDouble();

        cuenta2.setNombreCliente(nombre);
        cuenta2.setNumeroCuenta("124");
        cuenta2.setTipoDeInteres(0);
        cuenta2.setSaldo(saldo);


        System.out.println("CLIENTES");
        System.out.println("cliente 1 es "+cuenta1.getNombreCliente()+ " con saldo "+cuenta1.getSaldo());
        System.out.println("cliente 2 es "+cuenta2.getNombreCliente()+ " con saldo "+cuenta2.getSaldo());

        System.out.println(cuenta1.getNombreCliente()+" quiere realizar un ingreso de: ");
        ingreso = sc.nextDouble();
        cuenta1.ingreso(ingreso);

        System.out.println("Actualizacion en sistema: ");
        System.out.println("cliente1 es"+cuenta1.getNombreCliente()+ "con saldo "+cuenta1.getSaldo());
        System.out.println("cliente2 es"+cuenta2.getNombreCliente()+ "con saldo "+cuenta2.getSaldo());

        System.out.println(cuenta2.getNombreCliente()+" quiere realizar un retito de: ");
        reintegro = sc.nextDouble();
        cuenta2.reintegro(reintegro);

        System.out.println("Actualizacion en sistema: ");
        System.out.println("cliente1 es"+cuenta1.getNombreCliente()+ "con saldo "+cuenta1.getSaldo());
        System.out.println("cliente2 es"+cuenta2.getNombreCliente()+ "con saldo "+cuenta2.getSaldo());


        System.out.println(cuenta1.getNombreCliente()+" quiere realizar un trasferencia de: ");
        trasferencia = sc.nextDouble();
        cuenta1.trasferencia(cuenta2, trasferencia);

        System.out.println("Actualizacion en sistema: ");
        System.out.println("cliente1 es"+cuenta1.getNombreCliente()+ "con saldo "+cuenta1.getSaldo());
        System.out.println("cliente2 es"+cuenta2.getNombreCliente()+ "con saldo "+cuenta2.getSaldo());


    }

}
