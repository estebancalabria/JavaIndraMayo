package indra.talentCamp.banco;

import java.util.*;

public abstract class CuentaBancaria {
	
	private int numerCuenta; //Voy a hacer cosas con esto....
	
	private List<Movimiento> movimientos = new ArrayList<Movimiento>();  //Conviene usar un arrayList
	private Cliente propietario;
	
	public CuentaBancaria(Cliente propietario) {
		super();
		this.propietario = propietario;
	}

	public double getSaldo() {
		throw new Error("Not Implemented");
	}
	
	public abstract void depositar(double monto);
	public abstract void extraer(double monto);
	
}
