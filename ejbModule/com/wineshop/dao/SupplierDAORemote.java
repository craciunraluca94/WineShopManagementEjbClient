package com.wineshop.dao;

import javax.ejb.Remote;

import com.wineshop.dto.SupplierDTO;

@Remote
public interface SupplierDAORemote extends GenericDAO<SupplierDTO>{

}
