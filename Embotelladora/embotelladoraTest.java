import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class embotelladoraTest
{
	 embotelladora embotelladora = new embotelladora();

   // this test passes
   @Test public void mismoNumero() throws NoSolution
   {
      assertEquals("necesito 0", 0, embotelladora.calculaBotellasPequenas(5,5,5));
   }

	 @Test public void menosGrandes() throws NoSolution
	 {
			assertEquals("necesito 14", 14, embotelladora.calculaBotellasPequenas(20,5,39));
	 }

	 @Test (expected = NoSolution.class)
	 public void llenadoParcial() throws NoSolution
	 {
			embotelladora.calculaBotellasPequenas(2,1,10);
	 }

	 @Test public void noGrandes() throws NoSolution
	 {
			assertEquals("necesito 10", 10, embotelladora.calculaBotellasPequenas(10,0,10));
	 }

	 @Test (expected = NoSolution.class)
	 public void pequenasNegativo() throws NoSolution
	 {
			embotelladora.calculaBotellasPequenas(-2,1,10);
	 }

	 @Test (expected = NoSolution.class)
	 public void cantidadNegativa() throws NoSolution
	 {
			embotelladora.calculaBotellasPequenas(-2,-1,10);
	 }

	 @Test (expected = NoSolution.class)
	 public void todoNegativo() throws NoSolution
	 {
			embotelladora.calculaBotellasPequenas(-2,-1,-10);
	 }

}
