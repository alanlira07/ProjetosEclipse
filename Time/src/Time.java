
public class Time {
	
	private int hora;
	private int minuto;
	private int segundo;
	

	public void setTime (int h, int m, int s) {
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
		
	}
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	


	
	public void ExibirHoraUniversal() {
		String strHora = hora+":"+minuto+":"segundo
				
		System.out.println("HORA UNIVERSAL");
		System.out.println(hora+":"+minuto+":"+segundo);
		
	}
	
	public void ExibirHoraPadrao() {
		System.out.println("HORA PADRAOL");
		System.out.println(hora+":"+minuto+":"+segundo);
	}

}
