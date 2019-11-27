import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class romanNumeralTest
{
		romanNumeral romanNumeral = new romanNumeral();

   // this test passes
	 @Test public void esUno() throws InvalidParameter
	 {
			assertEquals("numero 1", 1, romanNumeral.convierte("I"));
	 }

	 @Test public void esCinco() throws InvalidParameter
	 {
			assertEquals("numero 5", 5, romanNumeral.convierte("V"));
	 }

	 @Test public void esDiez() throws InvalidParameter
	 {
			assertEquals("numero 10", 10, romanNumeral.convierte("X"));
	 }

	 @Test public void esCincuenta() throws InvalidParameter
	 {
			assertEquals("numero 50", 50, romanNumeral.convierte("L"));
	 }

	 @Test public void esCien() throws InvalidParameter
	 {
			assertEquals("numero 100", 100, romanNumeral.convierte("C"));
	 }

	 @Test public void esQuinientos() throws InvalidParameter
	 {
			assertEquals("numero 500", 500, romanNumeral.convierte("D"));
	 }

	 @Test public void esMil() throws InvalidParameter
	 {
			assertEquals("numero 1000", 1000, romanNumeral.convierte("M"));
	 }

   @Test public void numero() throws InvalidParameter
   {
      assertEquals("numero 495", 495, romanNumeral.convierte("CDXCV"));
   }

	 @Test public void OTROnumero() throws InvalidParameter
	 {
			assertEquals("numero 2484", 2484, romanNumeral.convierte("MMCDLXXXIV"));
	 }

	 @Test ()
	 public void romanoInvalido() throws InvalidParameter
	 {
		 try{
			 romanNumeral.convierte("Z");
		 }catch (InvalidParameter e){
			 return;
		 }

		 fail("InvalidParameter expected");
	 }
}
