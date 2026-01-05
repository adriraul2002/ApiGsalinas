package com.mx.ApiGsalinas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ApiGsalinas.model.Items;
import com.mx.ApiGsalinas.service.ItemsServImp;

@RestController
@RequestMapping(path = "end-point")
@CrossOrigin
public class ItemsWebService {
	
	@Autowired
	ItemsServImp imp;
	
	// http://localhost:9000/end-point/show
	@GetMapping(path = "show")
	public List<Items> mostrar(){
		return imp.mostrarLista();
	}

}
