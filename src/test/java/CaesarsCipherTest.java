import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarsCipherTest {

    private CaesarsCipher caesarsCipher = new CaesarsCipher();

    @Test
    void testCipheredMessageWithOffsetof12(){
        assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today", 12));
    }
    @Test
    void testEmptyString(){
        assertEquals("", caesarsCipher.cipher("", 12));
    }

    //fail test case
    @Test
    void testCipheredMessageWithOffsetof11(){
        assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today", 12));
    }




}