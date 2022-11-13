package com.modelo.cl2.service;

import java.util.List;

import com.modelo.cl2.entity.Supervisor;

public interface SupervisorService {
	
	public List<Supervisor> listSupervisorXSucursal(int sucursal);
	public void eliminar(int cod);
	
}
