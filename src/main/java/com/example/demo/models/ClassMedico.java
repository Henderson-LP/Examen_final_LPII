package com.example.demo.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_medicocl3")
public class ClassMedico {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int IDMEDICOCL3;
	private String NOMBRECL3;
	private String APELLIDOCL3;
	private String EMAIL;
	private String DNICL3;
	private String ESTADOCIVILCL3;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso=ISO.DATE)
	private Date FECHANACIMCL3;
}
