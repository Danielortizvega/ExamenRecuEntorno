import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * 
 * @author DanielOrtizVega
 *
 */
class CCuentaTest {


	@Test					//todos los metodos que usen el Test sera reconocido como prueba unitaria
	public double retirarTest(int saldo)throws Exception {
		double resultado = CCuenta.retirar(2300);
		double esperado = CCuenta.saldo; 
		
		return resultado-esperado; 		//restamos para retirar el dinero del sueldo
		}

	@Test
	public double ingresarTest() throws Exception {
		double resultado = CCuenta.ingresar(0);
		double esperado = CCuenta.saldo; 
		
		return resultado+esperado;   //sumamos resultado mas esperado para incrementar la cantidad al sueldo
		}

		
}
