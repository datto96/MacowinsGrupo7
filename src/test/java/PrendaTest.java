
import org.junit.*;
import java.time.LocalDate;

public class PrendaTest{
	LocalDate hoy = LocalDate.now();
	Local macowins = new Local(100);
	Tipo NACIONAL = Tipo.NACIONAL;
	Tipo IMPORTADO = Tipo.IMPORTADO;
	
	Prenda pantalonNacional = Prenda.nuevoPantalon(macowins,NACIONAL);
	Prenda pantalonImportado= Prenda.nuevoPantalon(macowins,IMPORTADO);
	Prenda camisaNacional = Prenda.nuevaCamisa(macowins,NACIONAL);
	Prenda camisaImportado = Prenda.nuevaCamisa(macowins,IMPORTADO);
	Prenda sacoNacional = Prenda.nuevoSaco(macowins,NACIONAL);
	Prenda sacoImportado = Prenda.nuevoSaco(macowins,IMPORTADO);
	
	Venta venta1 = new Venta(pantalonNacional,1); //$250 + $100 = 350
	Venta venta2 = new Venta(pantalonImportado,2); //250+100) . 1,3 = 455  *2 = 910
	Venta venta3 = new Venta(camisaNacional,1); //200+100= 300 
	//total= 1105
	
	
	@Test
	public void testCantidadVentasAgregadasAVector()
	{
		macowins.addVenta(venta1);
		macowins.addVenta(venta2);
		macowins.addVenta(venta3);
		Assert.assertEquals(macowins.getVentas().size(),3,1); //Se agregan 3 ventas
	} 
	
	
	@Test
	public void gananciaVentasDelDia()
	{
		macowins.addVenta(venta1);
		macowins.addVenta(venta2);
		macowins.addVenta(venta3);
		Assert.assertEquals(1510, macowins.gananciasDelDia(hoy),1);
	}
	
	@Test
	public void seAgregaBienAlVector(){
		macowins.addVenta(venta1);
		macowins.addVenta(venta2);
		Assert.assertEquals(2, macowins.getVentasDel(hoy).size());
	}
	
	@Test
	public void fechasIguales(){
		macowins.addVenta(venta1);
		Assert.assertEquals(hoy, venta1.getFecha());
	}
	
	@Test
	public void gananciaDeVenta1(){
		Assert.assertEquals(350,venta1.ganancia(),1);
	}
	
	@Test
	public void SacoNacionalTienePrecio400(){
		
		Assert.assertEquals(400, sacoNacional.precio(),1);
	}
	
	@Test
	public void SacoImportadoTienePrecio520(){
	
		Assert.assertEquals(520, sacoImportado.precio(),1);
	}
	
	@Test
	public void PantalonImportadoTienePrecio455(){
		
		Assert.assertEquals(455, pantalonImportado.precio(),1);
	}
	
	@Test
	public void CamisaImportadoTienePrecio390(){
	
		Assert.assertEquals(390, camisaImportado.precio(),1);
	}
}
