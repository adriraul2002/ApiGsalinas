package com.mx.ApiGsalinas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.ApiGsalinas.dao.ItemsDao;
import com.mx.ApiGsalinas.model.Items;

@Service
public class ItemsServImp implements ItemsServ{
	
	@Autowired
	ItemsDao itemsDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<Items> mostrarLista() {
		return itemsDao.findAll();
	}

}
