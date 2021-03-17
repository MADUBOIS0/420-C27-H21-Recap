public class algorithmes {

    public static void permute(int[] tab, int i1, int i2) {
        int temp = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = temp;
    }


    // trier un tableau en ordre croissant
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
                permute(tab, i, imin);
            }
        }
        return tab;
    }

    public static int fouilleSequentielle(int[] tab, int valueToFind){
        int foundIndex = -1;
        int i = 0;
        boolean foundValue = false;
        while(i < tab.length && !foundValue){
            if (tab[i] == valueToFind){
                foundValue = true;
                foundIndex = i;
            }
            else{
                i++;
            }
        }
        return foundIndex;
    }

    public static int dichotomique(String[] tab, String valueToFind){
        int debut = 0;
        int millieu = 0;
        int fin = tab.length - 1;
        boolean trouve = false;

        while(debut <= fin && !trouve){
            millieu = (debut + fin) / 2;

            if(valueToFind.equals(tab[millieu])){
                trouve = true;
            }
            else if((valueToFind.compareTo(tab[millieu])) < 0)  {
                fin = millieu - 1;
            }
            else{
                debut = millieu + 1;
            }

        }
        if(trouve){
            return millieu;
        }
        else return -1;
    }

}
