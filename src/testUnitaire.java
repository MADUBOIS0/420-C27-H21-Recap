// CECI EST UN EXEMPLE DE TEST UNITAIRE

/**
 * Une fonction pour chacune des méthodes de test vue dans le cours
 * Comment créer un fichier de test? clique droit sur testUnitaire->Generate->Test choisir testing library JUnit5, choisir fonctions à tester
 * RIGHTCLICK-------↓
 */
public class testUnitaire {

    // somme de deux nombres (utilisé pour assertEquals)
    public static double somme(double num1, double num2){
        return num1+num2;
    }

    // retourne vrai si le nombre est paire (assertTrue)
    public static boolean estPaire(int num){
        return num%2==0;
    }

    public static int[] triCroissantSSS(int[] tab){
        int imin;
        int i;
        int j;

        for (i = 0; i < tab.length - 1; i++) {
            imin = i;

            for (j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[imin])
                    imin = j;
            }

            if (i != imin) {
                int temp = tab[i];
                tab[i] = tab[imin];
                tab[imin] = temp;
            }
        }
        return tab;
    }

}
