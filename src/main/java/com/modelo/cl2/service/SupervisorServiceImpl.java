package com.modelo.cl2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelo.cl2.dao.SupervisorDAO;
import com.modelo.cl2.entity.Supervisor;

@Service
public class SupervisorServiceImpl implements SupervisorService{

	@Autowired
	private SupervisorDAO supervisorDAO;
	
	@Override
	public List<Supervisor> listSupervisorXSucursal(int sucursal) {
		return supervisorDAO.listSupervisorXSucursal(sucursal);
	}

	@Override
	public void eliminar(int cod) {
		supervisorDAO.eliminar(cod);
	}

}
