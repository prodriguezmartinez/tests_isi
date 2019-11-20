import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DescuentoBlackFriday{
    //atributos de la clase
	public String fecha;
    //constructor
	public DescuentoBlackFriday()
	{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha= formatter.format(LocalDate.now());
	}
    public double PrecioFinal(double precioOriginal, double porcentajeDescuento)throws InvalidParameter{
        if (precioOriginal <=0) {
            throw new InvalidParameter("Please enter a positive price");
        }
        if (this.fecha == "29/11/2019") {
            double preciofinal = precioOriginal *(1-porcentajeDescuento/100);
            return preciofinal;
        }else {
            return precioOriginal;
        }


    }

    public static void main (String [ ] args) {
        DescuentoBlackFriday nuevo = new DescuentoBlackFriday();

        try{
            double precio = nuevo.PrecioFinal(4,50);
            System.out.println(precio);
        }catch(InvalidParameter e){
            System.out.println("jeje");
        }

    }

}
