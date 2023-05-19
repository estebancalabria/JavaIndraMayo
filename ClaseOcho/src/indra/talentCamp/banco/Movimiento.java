package indra.talentCamp.banco;

import java.time.LocalDate;

public class Movimiento {

	private LocalDate fecha;
	private double monto; //Positivo, deposito, Negativo, extraccion;
    
    public Movimiento(double saldo) {
		super();
		this.monto = saldo;
		this.fecha = LocalDate.now();
	}

	public double getMonto() {
		return monto;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "...";
	}

	
}
