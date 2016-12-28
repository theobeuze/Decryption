package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez choisir le dechiffrement desire :");
        System.out.println("1 - Cesar");
        System.out.println("2 - Transposition");
        switch (sc.nextLine()) {
            case "1":
                Cesar cesar = new Cesar();
                cesar.cesarDemarrer(1);
                break;
            case "2":
                Transposition transposition = new Transposition();
                transposition.calculTranspo();
                break;
            default:
                System.out.println("invalid entry");
        }

    }

}
