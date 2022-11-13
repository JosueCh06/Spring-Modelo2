package com.modelo.cl2.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.modelo.cl2.entity.Supervisor;

@Repository
public class SupervisorDAOImpl implements SupervisorDAO{

	@Autowired
	private SessionFactory factory;
	
	@Transactional(readOnly = true)
	@Override
	public List<Supervisor> listSupervisorXSucursal(int sucursal) {
		Session session = factory.getCurrentSession();
		Query query = null;
		try {
			String hql = "select p from Supervisor p where p.sucursal.codSucursal=?1";
			query = session.createQuery(hql);
			query.setParameter(1, sucursal);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	@Transactional
	@Override
	public void eliminar(int cod) {
		Session session = factory.getCurrentSession();
		try {
			Supervisor s = session.find(Supervisor.class, cod);
			session.delete(s);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
