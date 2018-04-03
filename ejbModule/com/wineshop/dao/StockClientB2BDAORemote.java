package com.wineshop.dao;

import javax.ejb.Remote;

import com.wineshop.dto.StockClientB2BDTO;

@Remote
public interface StockClientB2BDAORemote extends GenericDAO<StockClientB2BDTO>{

}
