package cuentasBanco;

/**
 * Clase que nos permite trabajar con diferentes métodos sobre la manipulación
 * de una cuenta corriente
 * 
 * @author Pablo Ortega Martinez
 * @version 0.5
 * 
 */
public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	/**
	 * Método que crea un objeto CCuenta vacío
	 */
	public CCuenta() {
	}

	/**
	 * Método que permite crear un objeto con todos sus atributos
	 * 
	 * @param nom  variable para recoger el nombre del titular de la cuenta
	 * @param cue  variable con el número del código de la cuenta del cliente (CCC)
	 * @param sal  variable con el saldo de la cuenta
	 * @param tipo variable con el tipo de interés sujeto a la cuenta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * Método que devuelve el saldo de la cuenta
	 * 
	 * @return valor del saldo
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Método que nos permite añadir dinero en la cuenta y añadirlo a su saldo
	 * 
	 * @param cantidad variable que recoge el importe a ingresar
	 * @throws Exception valida que el importe a ingresar sea positivo
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Método que nos permite sacar dinero de la cuenta y restarlo de su saldo
	 * 
	 * @param cantidad variable que recoge el importe a retirar
	 * @throws Exception valida que el importe a retirar sea positivo
	 * @throws Exception valida que haya suficiente saldo para retirar de la cuenta
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Método que nos permite obtener el nombre del titular de la cuenta
	 * 
	 * @return nombre del titular de la cuenta
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Método que nos permite asignar/cambiar el nombre del titular de la cuenta
	 * 
	 * @param nombre variable para recoger el nombre del titular de la cuenta
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que nos permite obtener el código de la cuenta (CCC)
	 * 
	 * @return código de la cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Método que nos permite asignar/cambiar el código de la cuenta
	 * 
	 * @param nombre variable para recoger el código de la cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método que nos permite obtener el saldo de la cuenta
	 * 
	 * @return saldo de la cuenta
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Método que nos permite asignar/cambiar el saldo de la cuenta
	 * 
	 * @param nombre variable para recoger el saldo de la cuenta
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método que nos permite obtener el tipo de interés de la cuenta
	 * 
	 * @return tipo de interés de la cuenta
	 */
	private double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Método que nos permite asignar/cambiar el tipo de interés de la cuenta
	 * 
	 * @param nombre variable para recoger el tipo de interés  de la cuenta
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
