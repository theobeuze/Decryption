package com.theobeuze;

import java.util.Scanner;

/**
 * Created by theobeuze on 12/12/2016.
 */
public class Transposition {

    private String newTexte = "";

    private String texte = "ltdscseohoeeeusetnapeiercvceteeoednonlnprt" +
            "petiottaeeoksttfuesemepzdcfepiohildidecphb" +
            "clllaenrgoaaieuetnistvnffnsoerunorseedeuen" +
            "queuqrsiserdeuovtereentancentribituserdcct" +
            "ileeleafunatteeeqeiieuiudesuaorarafsnvaqis" +
            "irsensnudusiorleraruiqioaesetsmtenssllldca" +
            "eiruemuvstlmnaemoseeoeeueaynlesnoqooreatct" +
            "eipzdlscsnpstncseiuuieycmdnrraqevuoniilupu" +
            "neunzrteaadtutqceniosduerueuunduouneedisee" +
            "erstnentsooseiughhaeioeaerreortbgesirhsvvc" +
            "iaeiiitmlmulvitapotealoeeir";

    private String key;

    private int tableau[][];
    private int tableauLarg;
    private int tableauLong;

    void calculTranspo() {

        initialiseTableau();
        remplissage();
        //afficheTableau();
        afficheTraduction();
    }

    private void initialiseTableau() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir Clef");
        key = sc.nextLine();

        tableauLarg = key.length();
        if (texte.length() % key.length() == 0) {
            tableauLong = ((texte.length())/key.length())+2;
        }else {
            tableauLong = ((texte.length())/key.length())+3;
        }
        tableau = new int[tableauLarg][tableauLong];

        for (int temp = 0; temp < key.length(); temp++) {
            tableau[temp][0] = key.charAt(temp) - 96;
            tableau[temp][1] = 0;
        }
    }

    private void remplissage() {
        int minimum = 122-96;
        int indiceMin = 0;
        int longTexte = texte.length();

        for (int t = 0; t < tableauLarg; t++) {
            for (int j = 0; j < tableauLarg; j++) {
                if (tableau[j][0] < minimum && tableau[j][1] != 1) {
                    indiceMin = j;
                    minimum = tableau[j][0];
                }
            }
            tableau[indiceMin][1] = 1;
            if (indiceMin < (longTexte % key.length())) {
                for (int i = 2; i < tableauLong; i++) {
                    tableau[indiceMin][i] = texte.charAt(i-2);
                }
                texte = texte.substring(tableauLong-2);
            } else {
                for (int i = 2; i < tableauLong-1; i++) {
                    tableau[indiceMin][i] = texte.charAt(i-2);
                }
                texte = texte.substring(tableauLong-3);
            }
            minimum = 122-96;
        }
    }

    public void afficheTableau() {
        System.out.println(texte.length());
        System.out.println(tableauLong);
        System.out.println(tableauLarg);
        for (int i = 0; i < tableauLong; i++) {
            for (int j = 0; j < tableauLarg; j++) {
                System.out.print(tableau[j][i] + " ");
            }
            System.out.println();
        }
    }

    private void afficheTraduction() {
        for (int i = 0; i < tableauLong; i++) {
            for (int j = 0; j < tableauLarg; j++) {
                System.out.print((char)tableau[j][i] + " ");
                newTexte += (char)tableau[j][i];
            }
            System.out.println();
        }
        System.out.println(newTexte);
    }
}
