package com.modelo.cl2.dao;

import java.util.List;

import com.modelo.cl2.entity.Supervisor;

public interface SupervisorDAO {
	
	public List<Supervisor> listSupervisorXSucursal(int sucursal);
	public void eliminar(int cod);
	
}
