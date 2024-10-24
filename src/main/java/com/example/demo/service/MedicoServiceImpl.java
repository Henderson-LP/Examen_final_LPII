package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ClassMedico;
import com.example.demo.repository.IMedicoRepository;

@Service
public class MedicoServiceImpl implements IMedicoService{
	@Autowired 
	private IMedicoRepository medioRepo;

	@Override
	public void RegistrarMedico(ClassMedico clmedico) {
		medioRepo.save(clmedico);	
	}

	@Override
	public void EliminarMedico(Integer id) {
		medioRepo.deleteById(id);
		
	}

	@Override
	public List<ClassMedico> ListadoMedico() {
		return (List<ClassMedico>) medioRepo.findAll();
	}

	@Override
	public ClassMedico BuscarporId(Integer id) {
		return medioRepo.findById(id).orElse(null);
	}

}
