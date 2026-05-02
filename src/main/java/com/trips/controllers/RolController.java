package com.trips.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.trips.models.Rol;
import com.trips.services.IRolService;

@Controller
public class RolController {

	@Autowired
	private IRolService tripServices;
	
	@GetMapping ("/rol")
	public String mostrarRol(Model model) {
		List<Rol> lista = tripServices.buscarTodo();	
		model.addAttribute("rol1", lista);
		return "rol";
	}

		
}
