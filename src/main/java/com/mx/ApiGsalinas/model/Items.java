package com.mx.ApiGsalinas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ITEMS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {
	
	@Id
	@Column(name="ID", columnDefinition = "FLOAT", nullable = false)
	private Float id;
	
	@Column(name="ITEM", columnDefinition = "VARCHAR2(50)", nullable = false)
	private String item;
	
	@Column(name="PADRE", columnDefinition = "FLOAT", nullable = true)
	private Float padre;
	
	@Column(name = "ACCESO", columnDefinition = "INT", nullable = false)
	private Integer acceso;
	
	@Column(name = "RUTA", columnDefinition = "VARCHAR2(100)", nullable = true)
	private String ruta;

}
