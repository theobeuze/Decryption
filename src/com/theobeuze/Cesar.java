package com.theobeuze;

import java.util.Scanner;

/**
 * Created by theobeuze on 12/12/2016.
 */
public class Cesar {
    private static String texte = "prdhryvatravbfvgrqrfubzzrfabhfnbssregqnafprfpragfqreavrerfnaarrfnhenvgchsnpvyvgreharivryvoerrgurherhfrfvyrcebterfrageryrfuhznvaffrssrpghnvgrazrzrgrzcfdhryrfcebterffheyrfpubfrfbeyrerfhygngynobevrhkerffrzoyrcbheprhkqrabgertrarengvbanprdhrfrenvghaenfbvecbheharasnagqrgebvfnafynpbadhrgrqrsnohyrhkzblrafqrcebqhpgvbaancnfnccbegrynyvoregrznvfyrfnatbvffrfrgynsnvzcverrapberyrfcebterfgrpuavdhrfsbheavffragyrfzblrafqnarnagveynivruhznvarrggbhgprdhvnrgrqherzragperrcneyubzzrcebgrfgrenhwbhequhvpbageryrfnezrzragfarfvtavsvrevrargarpunatrevrafrhyrynfhccerffvbaqrsvavgvirqhevfdhrhavirefryqrynthreerqbaarhafrafrghapunaprnynfheivrqhzbaqribvynqrfbeznvfabgerynorhedhbgvqvrargabgervaroenaynoyrqrpvfvbayhggrepbagerynenpvarqhznyrgabapbageryrfrssrgfwrqrgrezvarynhguragvdhrinyrheqhaubzzrqncerfharfrhyrertyrndhryqrterrgqnafdhryohgyubzzrfrfgyvorerqrfbazbvgbhgrfyrfevpurffrfqhzbaqrshffragryyrfrageryrfznvafqhaubzzrgbgnyrzragnpdhvfnyvqrrqrcebterfarcrezrggebagwnznvfyrzbvaqerqrirybccrzragzbenyqryuhznavgryrqrfgvaqryuhznavgrercbfrfheyrfsbeprfzbenyrfqryubzzrfvabhfibhybafharivryvoerrgurherhfrvylsnhqenarprffnverzragerabaprzragrgerfgevpgvbaynpbzcerurafvbaqnhgehvarcebterffrendhnirpyrcnegntrqrfwbvrfrgqrffbhssenaprfwrarcrhkpbzcnereyntrarebfvgrqhazbvfrqhawrfhfbhqhatnaquvrgyntrarebfvgrqhardhrypbadhrsbaqngvbapneartvrnyoregrvafgrva";
    private String newTexte = "";
    private int finalKey;

    public void cesarDemarrer(int key) {
        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < texte.length(); j++) {
            newString(key, texte.charAt(j));
        }
        System.out.println(newTexte);
        System.out.println("Good ?");
        String str = sc.nextLine();
        if (str.equals("no")) {
            newTexte = "";
            finalKey = key + 1;
            cesarDemarrer(key + 1);
        } else {
            System.out.println("Message traduit avec une cle de " + finalKey );
        }
    }

    private void newString(int key, char a) {
        int newCharAscii;
        newCharAscii = a + key;
        if (newCharAscii > 122) {
            newCharAscii = 97 + newCharAscii - 123;
        }
        newTexte += (char)newCharAscii;
    }
}
