package  org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

public class Furgoneta {

	private int Factor_PMA;
	private int FACTOR_PLAZAS;
    private int pma;
    private int plazas;
    private int  furgoneta;
    
    public Furgoneta(String marca, String modelo, int pma, int plazas, String matricula) {
    	
    }
    
   public Furgoneta(Furgoneta furgoneta) {
	   return furgoneta;
   }
    
    
   public int getPma() {
	   
   }
   
   private setPma(int pma) {
	   if(pma) {
		   throw new IllegalArgumentException("Error:El pma no es correcto.");
		   this.pma = pma;
		   
   }
   
   public int getPlazas() {
	   return Plazas;
	   
   }
   
   private setPlazas(int plazas) {
	   if(!plazas  ) {
		   throw new NullPointedException("Error: las plazas no son correctas.");
		   
	   }
	   
   }
   
   public int getFactorPrecio() {
	   return FactorPrecio;
	   
   }
   
   @Override
	
	public String toString() {
		return" pma:" +pma+ ",plazas:" +plazas;
		
	}
	
}

}
