import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata_MumblingTest {
    @Test
    void accum() {
        assertEquals("P", Kata_Mumbling.accum("p"));
        assertEquals("P-Ii", Kata_Mumbling.accum("pI"));
        assertEquals("P-Ii-Nnn", Kata_Mumbling.accum("pin"));
    }

}