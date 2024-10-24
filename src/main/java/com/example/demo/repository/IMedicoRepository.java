package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.ClassMedico;

public interface IMedicoRepository extends CrudRepository<ClassMedico, Integer>{

}
