package com.wineshop.dao;

import javax.ejb.Remote;

import com.wineshop.dto.StockSupplierDTO;

@Remote
public interface StockSupplierDAORemote extends GenericDAO<StockSupplierDTO> {

}
