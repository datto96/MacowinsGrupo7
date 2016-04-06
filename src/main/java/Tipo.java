
public enum Tipo {
		NACIONAL(1),
		IMPORTADO(1.3);
		
		private final double tasa;
		
		Tipo(double tasa){
			this.tasa = tasa;
		}
		
		public double getTasa(){
			return this.tasa;
		}
}
