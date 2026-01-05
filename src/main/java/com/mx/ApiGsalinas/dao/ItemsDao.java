package com.mx.ApiGsalinas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.ApiGsalinas.model.Items;

@Repository
public interface ItemsDao extends JpaRepository<Items, Float>{

}
