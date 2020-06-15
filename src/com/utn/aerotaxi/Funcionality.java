package com.utn.aerotaxi;

import com.utn.passenger.Passenger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Funcionality {

    private Company company;
    Scanner scan = new Scanner(System.in);

    public Funcionality(Company company) {
        this.company = company;
    }

    private boolean validationUser() {
        boolean rta = false;
        try {
            System.out.println("Ingrese su DNI");
            String dni = scan.nextLine();
            if (company.existClient(dni) == true)
                rta = true;
            else {
                System.out.println("Usted no se encuentra en el sistema por favor: ");
                company.addClient(createUser(dni));
            }
        } catch (InputMismatchException e) {
            System.out.println("El DNI ingresado es inválido");
        }
        return rta;
    }

    public Passenger createUser(String dni) {
        Passenger newPassenger = new Passenger();
        newPassenger.setDni(dni);
        try {
            System.out.println("Ingrese su nombre");
            String name = scan.nextLine();
            newPassenger.setName(name);
            System.out.println("Ingrese su apelledio");
            String lastName = scan.nextLine();
            newPassenger.setLastName(lastName);
            System.out.println("Ingrese su edad");
            int age = scan.nextInt();
            newPassenger.setAge(age);
        } catch (InputMismatchException e) {
            System.out.println("Datos ingresados inválidos");
        }
        finally {
            //Limpiar scanner
            scan.nextLine();
        }
        return newPassenger;
    }
    public void startProgram(){

        boolean log = false;

        while(log == false){
            log = validationUser();
        }
        menu();

    }

    public void menu() {

        int menu = 0;

        try {
            System.out.println("1.Contratar un nuevo vuelo");
            menu = scan.nextInt();


            switch (menu) {
                case 1:
                    //hacer formulario
                    break;


            }


        } catch (InputMismatchException e) {
            System.out.println("Opcion ingresada incorrectamente");
        }
    }


}



