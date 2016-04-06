import java.time.LocalDate;

public class Venta
{
	private Prenda prenda;
	private int cantidad;
	private LocalDate fecha;
	
	// Constructor
	public Venta(Prenda prenda, int cantidad)
	{
		this.prenda = prenda;
		this.cantidad = cantidad;
		this.fecha = LocalDate.now();
	}
	
	// Otros metodos
	public double ganancia(){
		return prenda.precio()*cantidad;
	}
	
	public boolean realizadaEl(LocalDate fecha){
		return this.fecha.equals(fecha);
	}
	
	
	// Getters 
	public Prenda getPrenda() {
		return prenda;
	}

	public int getCantidad() {
		return cantidad;
	}

	public LocalDate getFecha(){
		return fecha;
	}
	
}
