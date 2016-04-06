import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Local
{
	private List<Venta> ventas = new ArrayList<Venta>();
	private double precioNegocio;
	
	// Constructor
	public Local(double valor){ 
		this.setPrecioNegocio(valor);
	}

	//Metodos
	public List<Venta> getVentasDel(LocalDate fecha)
	{
		return this.ventas
				.stream()
				.filter(venta -> venta.realizadaEl(fecha))
				.collect(Collectors.toList());
	}
	
	public double gananciasDelDia(LocalDate fecha)
	{
		return this.getVentasDel(fecha)
				.stream()
				.map(Venta::ganancia)
				.mapToDouble(Double::doubleValue)
				.sum();
	}
	
	public void addVenta(Venta venta)
	{
		ventas.add(venta);
	}

	// Getters/setters
	public double getPrecioNegocio() {
		return precioNegocio;
	}

	public void setPrecioNegocio(double precioNegocio) {
		this.precioNegocio = precioNegocio;
	}
	
	public List<Venta> getVentas() {
		return ventas;
	}
}
