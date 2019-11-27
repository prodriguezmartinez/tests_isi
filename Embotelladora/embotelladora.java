
public class embotelladora {
	// Par´ametros: pequenas: n´umero de botellas en almac´en de 1L
	// grandes : n´umero de botellas en almac´en de 5L
	// total : n´umero total de litros que hay que embotellar
	// Devuelve: n´umero de botellas peque~nas necesarias para embotellar el total de l´ıquido, teniendo
	// en cuenta que hay que minimizar el n´umero de botellas peque~nas: primero
	// se rellenan las grandes
	// Eleva la excepci´on NoSolution si no es posible embotellar todo el l´ıquido
		public int calculaBotellasPequenas(int pequenas, int grandes, int total) throws NoSolution{
			int VolGrande = 5;
			int PeqUsadas = 0;
			int GrandesUsadas = 0;

			GrandesUsadas = total/VolGrande;

			if (GrandesUsadas > grandes){
				GrandesUsadas = grandes;
			}

			PeqUsadas = total - VolGrande*GrandesUsadas;

			if (PeqUsadas > pequenas){
				throw new NoSolution("No hay suficientes pequeñas.");
			}

			return PeqUsadas;
		}
}
