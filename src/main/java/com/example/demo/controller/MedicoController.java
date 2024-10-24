package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.ClassMedico;
import com.example.demo.service.IMedicoService;

@Controller
@RequestMapping("/vistas")
public class MedicoController {
	@Autowired
	private IMedicoService medicoService;
	
	@GetMapping("ListadoMedico")
	public String ListadoMedico(Model modelo) {
		List<ClassMedico> listado=medicoService.ListadoMedico();
		modelo.addAttribute("listado",listado);
		return "/Vistas/ListadoProductos";		
	}   
	
	@GetMapping("/RegistrarMedico")
	public String RegistrarMedico(Model modelo) {
		ClassMedico clmedico = new ClassMedico();
		modelo.addAttribute("regproducto",clmedico);
		return "/Vistas/FrmRegMedico";
	}  

	@PostMapping("/GuardarMedico")
	public String GuardarMedico(@ModelAttribute ClassMedico clmedico, Model modelo) {	   
		medicoService.RegistrarMedico(clmedico);
		System.out.println("datos registrado en bd");
		return "redirect:/Vistas/ListadoProductos";
		   
	}  
	   
	@GetMapping("/editarmedico/{id}")
	public String Editar(@PathVariable("id") Integer idmedico, Model modelo) {
		ClassMedico clmedico=medicoService.BuscarporId(idmedico);
		modelo.addAttribute("regmedico",clmedico);
		return "/Vistas/FrmRegProducto";
		   
	} 
	
	@GetMapping("/eliminarmedico/{id}")
	public String eliminar(@PathVariable("id") Integer idmedico, Model modelo) {
		medicoService.EliminarMedico(idmedico);
		List<ClassMedico> listado=medicoService.ListadoMedico();  
		modelo.addAttribute("listado", listado);
		return "redirect:/Vistas/ListadoProductos";
		   
	   }
}
