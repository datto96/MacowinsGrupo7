
public class Prenda
{
	private double precioBase;
	private Tipo origen;
	private Local local;
	
	
	// Constructor
	private Prenda(Local local, Tipo tipo)
	{
		this.local=local;
		this.origen=tipo;
	}
	
	// ConstrucPrendas
	
	public static Prenda nuevaCamisa(Local local, Tipo tipo){
		Prenda camisa = new Prenda(local,tipo);
		camisa.precioBase=200;
		return camisa;
	}
	
	public static Prenda nuevoSaco(Local local, Tipo tipo){
		Prenda saco = new Prenda(local,tipo);
		saco.precioBase=300;
		return saco;
	}
	
	public static Prenda nuevoPantalon(Local local, Tipo tipo){
		Prenda pantalon = new Prenda(local,tipo);
		pantalon.precioBase=250;
		return pantalon;
	}
	
	// Metodos
	
	public double precio()
	{
		return ( (local.getPrecioNegocio()+this.getPrecioBase()) * origen.getTasa() );
	}
	
	
	// Setters 
	public void setPrecioBase(double precioBase)
	{
		this.precioBase = precioBase;
	}
	
	// Getters 
	public double getPrecioBase()
	{
		return precioBase;
	}
}
