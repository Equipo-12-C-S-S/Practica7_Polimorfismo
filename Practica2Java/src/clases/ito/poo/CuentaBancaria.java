/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

import java.time.LocalDate;

import javax.swing.JOptionPane;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CuentaBancaria.
 * 
 * @author Guadalupe
 */
public class CuentaBancaria implements Comparable<CuentaBancaria> {
	
	private long numCuenta = 0L;
	private String nomCliente = "";
	private float saldo = 0F;
	private java.time.LocalDate fechaApertura = null;
	private java.time.LocalDate fechaActualizacicon = null;
	
	public CuentaBancaria(long numCuenta, String nomCliente, float saldo, LocalDate fechaApertura,
			LocalDate fechaActualizacicon) {
		super();
		this.numCuenta = numCuenta;
		this.nomCliente = nomCliente;
		this.saldo = saldo;
		this.fechaApertura = fechaApertura;
		this.fechaActualizacicon = fechaActualizacicon;
	}
	public CuentaBancaria() {
		// TODO Auto-generated constructor stub
	}
	public boolean retiroR(float cantidad) {
		boolean retiro = false;
		if (this.saldo >= cantidad) {
			this.saldo -= cantidad;
			retiro = true;
			this.fechaActualizacicon = LocalDate.now();
		}
		return retiro;
	}

	public boolean depositoD(float cantidad) {
		boolean deposito= false;
		if (this.saldo >= cantidad) {
			this.saldo += cantidad;
			deposito= true;
			this.fechaActualizacicon = LocalDate.now();
		}
		return deposito;
	}
	 
	// Start of user code (user defined methods for CuentaBancaria)
	
	// End of user code
	/**
	 * Returns numCuenta.
	 * @return numCuenta 
	 */
	public long getNumCuenta() {
		return this.numCuenta;
	}
	
	/**
	 * Sets a value to attribute numCuenta. 
	 * @param newNumCuenta 
	 */
	public void setNumCuenta(long newNumCuenta) {
	    this.numCuenta = newNumCuenta;
	}

	/**
	 * Returns nomCliente.
	 * @return nomCliente 
	 */
	public String getNomCliente() {
		return this.nomCliente;
	}
	
	/**
	 * Sets a value to attribute nomCliente. 
	 * @param newNomCliente 
	 */
	public void setNomCliente(String newNomCliente) {
	    this.nomCliente = newNomCliente;
	}

	/**
	 * Returns saldo.
	 * @return saldo 
	 */
	public float getSaldo() {
		return this.saldo;
	}
	
	/**
	 * Sets a value to attribute saldo. 
	 * @param newSaldo 
	 */
	public void setSaldo(float newSaldo) {
	    this.saldo = newSaldo;
	}

	/**
	 * Returns fechaApertura.
	 * @return fechaApertura 
	 */
	public java.time.LocalDate getFechaApertura() {
		return this.fechaApertura;
	}
	
	/**
	 * Sets a value to attribute fechaApertura. 
	 * @param newFechaApertura 
	 */
	public void setFechaApertura(java.time.LocalDate newFechaApertura) {
	    this.fechaApertura = newFechaApertura;
	}

	/**
	 * Returns fechaActualizacicon.
	 * @return fechaActualizacicon 
	 */
	public java.time.LocalDate getFechaActualizacicon() {
		return this.fechaActualizacicon;
	}
	
	/**
	 * Sets a value to attribute fechaActualizacicon. 
	 * @param newFechaActualizacicon 
	 */
	public void setFechaActualizacicon(java.time.LocalDate newFechaActualizacicon) {
	    this.fechaActualizacicon = newFechaActualizacicon;
	}
	

	@Override
	public String toString() {
		return "CuentaBancaria [numCuenta=" + numCuenta + ", nomCliente=" + nomCliente + ", saldo=" + saldo
				+ ", fechaApertura=" + fechaApertura + ", fechaActualizacicon=" + fechaActualizacicon + "]";
	}

	public int compareTo(CuentaBancaria o) {
		// TODO Auto-generated method stub
		int compare=0;
		if(this.numCuenta<o.getNumCuenta())
			compare=-1;
		else if(this.numCuenta>o.getNumCuenta())
			compare=1;
		return compare;
	}

}
