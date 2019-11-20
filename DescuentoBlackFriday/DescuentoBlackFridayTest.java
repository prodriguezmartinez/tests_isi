import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class DescuentoBlackFridayTest{
    //caracterizacion b1: que sea 29
    //b2: que no sea 29
    //b3: numero negativo de precio
    //b2 This test passes
    @Test public void no_black() throws InvalidParameter
    {
       DescuentoBlackFriday nuevo = new DescuentoBlackFriday();
       assertEquals("is not 29", 4, nuevo.PrecioFinal(4,50),1e-15);
   }
   //b1 This test passes
    @Test public void yes_black() throws InvalidParameter
    {
       DescuentoBlackFriday nuevo = new DescuentoBlackFriday();
       nuevo.fecha = "29/11/2019";
       assertEquals("is 29", 2, nuevo.PrecioFinal(4,50),1e-15);
    }
    //b3 con b1 This test passes
    @Test public void prize_negative() throws InvalidParameter
    {
        DescuentoBlackFriday nuevo = new DescuentoBlackFriday();
        nuevo.fecha = "29/11/2019";
        try{
            assertEquals("is a negative prize",-2, nuevo.PrecioFinal(-4,50),1e-15);
        }catch(InvalidParameter e) {
            return;
        }
        fail("InvalidParameter expected");
    }
}
