package com.modelo.cl2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.modelo.cl2.entity.Supervisor;
import com.modelo.cl2.service.SucursalService;
import com.modelo.cl2.service.SupervisorService;

@Controller
@RequestMapping("/supervisor")
public class SupervisorController {

	@Autowired
	private SupervisorService supervisorService;
	
	@Autowired
	private SucursalService sucursalService;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("sucursales", sucursalService.listAll());
		return "supervisor";
	}
		
	@RequestMapping("/consulta")
	@ResponseBody
	public List<Supervisor> consulta(@RequestParam("sucursal") int codSucursal) {
		List<Supervisor> lista = supervisorService.listSupervisorXSucursal(codSucursal);
		return lista;
	}
	
	@RequestMapping("/eliminar")
	public String eliminar(@RequestParam("codigo") int cod, RedirectAttributes redirect) {
		try {
			supervisorService.eliminar(cod);
			redirect.addFlashAttribute("MENSAJE", "Supervisor eliminado");
		} catch (Exception e) {
			redirect.addFlashAttribute("MENSAJE", "Error en la eliminación");
			e.printStackTrace();
		}
		
		return "redirect:/supervisor/";
	}
	
}
