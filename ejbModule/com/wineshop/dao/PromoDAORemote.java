package com.wineshop.dao;

import javax.ejb.Remote;

import com.wineshop.dto.PromoDTO;

@Remote
public interface PromoDAORemote extends GenericDAO<PromoDTO>{

}
