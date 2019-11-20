public class bisiesto {
    
     public static boolean esBisiesto (int anio) throws InvalidParameter
     {
         if (anio <0){
             throw new InvalidParameter("Enter a correct year");
         }
         if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
            System.out.println("El año es bisiesto");
            return true;
         } else{
             System.out.println("El año no es bisiesto");
             return false;
         }
     }
    //  public static void main (String []argv)
    //  {
    //     int []anio = new int [argv.length];
    //     if ( argv.length != 1)
    //     {
    //        System.out.println ("Usage: java anio bisiesto v1 ");
    //        return;
    //    }else  {
    //        System.out.println ("The anio is : " + esBisiesto (anio[1]));
    //    }
     //
    //  }

}
