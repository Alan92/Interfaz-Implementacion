public class MiClase{
  private int edad; 

  public void setEdad(int t){
    edad = t; 
  } 

  public int getEdad(){ 
    return edad; 
  } 
} 

class AccesoIndirecto{ 

  public static void main(String[] args){ 
    MiClase mc = new MiClase();
    mc.setEdad(5); 
    System.out.println("La edad es:" + mc.getEdad()); 
  } 

}
