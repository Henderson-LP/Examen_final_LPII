package com.example.demo.service;

import java.util.List;

import com.example.demo.models.ClassMedico;

public interface IMedicoService {
	public void RegistrarMedico(ClassMedico clmedico);
	public void EliminarMedico(Integer id);
	public List<ClassMedico> ListadoMedico();
	public ClassMedico BuscarporId(Integer id);
}
