package com.modelo.cl2.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="tb_supervisor")
public class Supervisor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_supervisor")
	private int codSup;

	@Column(name="nom_supervisor")
	private String nomSup;
	
	@Column(name="ape_supervisor")
	private String apeSup;
	
	@Column(name="dni_supervisor")
	private String DNIsup;
	
	@Column(name="num_hijos")
	private int cantHijos;

	@Column(name="sueldo")
	private double sueldoSup;

	@ManyToOne
	@JoinColumn(name="cod_sucursal")
	private Sucursal sucursal;

	public int getCodSup() {
		return codSup;
	}

	public void setCodSup(int codSup) {
		this.codSup = codSup;
	}

	public String getNomSup() {
		return nomSup;
	}

	public void setNomSup(String nomSup) {
		this.nomSup = nomSup;
	}

	public String getApeSup() {
		return apeSup;
	}

	public void setApeSup(String apeSup) {
		this.apeSup = apeSup;
	}

	public String getDNIsup() {
		return DNIsup;
	}

	public void setDNIsup(String dNIsup) {
		DNIsup = dNIsup;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	public double getSueldoSup() {
		return sueldoSup;
	}

	public void setSueldoSup(double sueldoSup) {
		this.sueldoSup = sueldoSup;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}