package indra.talentCamp.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import indra.talentCamp.banco.*;

class CuentaBancariaTests {

	@Test
	void ShouldAutoincrementCuentaBancariaNumero() {
		
	    Banco banco = new Banco();
		
		Cliente demoCliente = new Cliente(123,"Esteban","Calabria");
	    
		//No la puedo crear directo porque el constructor es package-private
		CuentaBancaria cuentaUno = banco.crearCuentaCorriente(demoCliente);
		CuentaBancaria cuentaDos = banco.crearCajaDeAhorrro(demoCliente);
		
		assertTrue(cuentaUno.getNumeroCuenta() < cuentaDos.getNumeroCuenta(), "Las dos cuentas no son correlativas");
		assertEquals(1, cuentaUno.getNumeroCuenta());
		assertEquals(2, cuentaDos.getNumeroCuenta(), "La cuenta dos no tien numero dos");
	}
}
