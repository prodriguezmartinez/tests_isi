import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class bisiestoTest
{
    //caracterizacion -->
    // b1: multiplo de 4 y no divisible entre 100
    //b2: multiplo de 4 y divisble de 400
    //b3:invalido

   // b1 This test passes
   @Test public void multiplo_de_4_no100() throws InvalidParameter
   {
      int anio =2016;
      assertEquals("anio bisiesto multiplo de 4 y no de 100", true, bisiesto.esBisiesto(anio));
   }
   //b1 This test passes
   @Test public void multiplo_de_4_si100() throws InvalidParameter
   {
      int anio =2100;
      assertEquals("anio bisiesto multiplo de 4 y si de 100", false, bisiesto.esBisiesto(anio));
   }
   //b2 This test passes
   @Test public void multiplo_de_4_y_400() throws InvalidParameter
   {
      int anio =2000;
      assertEquals("anio bisiesto multiplo de 4 y de 400", true, bisiesto.esBisiesto(anio));
   }
   //b3 This test passes
   @Test public void negative() throws InvalidParameter
   {
      int anio =-2015;
      try{
            boolean es_bisiesto = bisiesto.esBisiesto(anio);
        }catch(InvalidParameter e){
            return;
        }
        fail("not excepcion");
   }



}
