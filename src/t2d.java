//Pris des NDC du 2021-02-15
import java.util.Arrays;

public class t2d {
    public static void main(String[] args) {
        int[][] tab = {
                {2, 4, 6},
                {1, 3, 5}
        };

        //[x][] = row
        //[][x] = column
        System.out.println(tab[0][1]);
        System.out.println(Arrays.deepToString(tab));
    }


        /**
         * Lire les colonnes   la ligne donnée
         * 2e ligne tableau[1][i]
         */
        public static void parcoursLigne(int[][] tab, int ligne){
            for(int iCol=0; iCol < tab.length; iCol++){
                System.out.println(tab[ligne][iCol] + " ");
            }
        }

        /**
         * Lire les lignes a la column donnée
         * @param tab
         * @param col
         */
        public static void parcoursColumn(int[][] tab, int col){
                for (int iLigne=0; iLigne < tab.length; iLigne++){
                    System.out.println(tab[iLigne][col]);
                }
        }

        //Faire des loops a travers tableau 2d

        public static void affTab(int[][] tab){

            int nbLignes = tab.length;
            int nbColumns = tab[0].length;


            for (int iLigne=0; iLigne< nbLignes; iLigne++){
                for (int iCol=0; iCol<nbColumns; iCol++){
                    System.out.println(tab[iLigne][iCol] + " ");
                    System.out.println("");
                }
            }
        }

}
