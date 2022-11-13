package com.modelo.cl2.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

@Entity
@Table(name="tb_sucursal")
public class Sucursal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_sucursal")
	private int codSucursal;

	@Column(name = "nom_sucursal")
	private String nomSucursal;

	@JsonIgnore
	@OneToMany(mappedBy = "sucursal")
	private List<Supervisor> listaSupervisores;

	public int getCodSucursal() {
		return codSucursal;
	}

	public void setCodSucursal(int codSucursal) {
		this.codSucursal = codSucursal;
	}

	public String getNomSucursal() {
		return nomSucursal;
	}

	public void setNomSucursal(String nomSucursal) {
		this.nomSucursal = nomSucursal;
	}

	public List<Supervisor> getListaSupervisores() {
		return listaSupervisores;
	}

	public void setListaSupervisores(List<Supervisor> listaSupervisores) {
		this.listaSupervisores = listaSupervisores;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}