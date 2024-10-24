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

@Entity
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
	
	public ClassMedico() {
		
	}

	public ClassMedico(int iDMEDICOCL3, String nOMBRECL3, String aPELLIDOCL3, String eMAIL, String dNICL3,
			String eSTADOCIVILCL3, Date fECHANACIMCL3) {
		IDMEDICOCL3 = iDMEDICOCL3;
		NOMBRECL3 = nOMBRECL3;
		APELLIDOCL3 = aPELLIDOCL3;
		EMAIL = eMAIL;
		DNICL3 = dNICL3;
		ESTADOCIVILCL3 = eSTADOCIVILCL3;
		FECHANACIMCL3 = fECHANACIMCL3;
	}

	public int getIDMEDICOCL3() {
		return IDMEDICOCL3;
	}

	public void setIDMEDICOCL3(int iDMEDICOCL3) {
		IDMEDICOCL3 = iDMEDICOCL3;
	}

	public String getNOMBRECL3() {
		return NOMBRECL3;
	}

	public void setNOMBRECL3(String nOMBRECL3) {
		NOMBRECL3 = nOMBRECL3;
	}

	public String getAPELLIDOCL3() {
		return APELLIDOCL3;
	}

	public void setAPELLIDOCL3(String aPELLIDOCL3) {
		APELLIDOCL3 = aPELLIDOCL3;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getDNICL3() {
		return DNICL3;
	}

	public void setDNICL3(String dNICL3) {
		DNICL3 = dNICL3;
	}

	public String getESTADOCIVILCL3() {
		return ESTADOCIVILCL3;
	}

	public void setESTADOCIVILCL3(String eSTADOCIVILCL3) {
		ESTADOCIVILCL3 = eSTADOCIVILCL3;
	}

	public Date getFECHANACIMCL3() {
		return FECHANACIMCL3;
	}

	public void setFECHANACIMCL3(Date fECHANACIMCL3) {
		FECHANACIMCL3 = fECHANACIMCL3;
	}
	
	
}
