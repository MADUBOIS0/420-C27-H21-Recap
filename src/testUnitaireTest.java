// CECI EST UN EXEMPLE DE TEST UNITAIRE
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testUnitaireTest {

    //assertEquals
    @Test
    void somme() {
        double expectedResult = 3;
        double result = testUnitaire.somme(2,1);
        assertEquals(expectedResult,result);
    }

    //assertTrue
    @Test
    void estPaire() {
        boolean result = testUnitaire.estPaire(2);
        assertTrue(result);
    }

    //assertArrayEquals
    @Test
    void triCroissantSSS() {
        int[] tab = {30,8,2,7};
        int[] expectedResult = {2,7,8,30};
        testUnitaire.triCroissantSSS(tab);
        assertArrayEquals(expectedResult, tab);
    }

    //assertNull, serieux j'ai pas d'exemple, jvais juste le laisser comme ça pour l'instant.
    @Test
    void estNull(){
        String s =  null;
        assertNull(s);
    }
}