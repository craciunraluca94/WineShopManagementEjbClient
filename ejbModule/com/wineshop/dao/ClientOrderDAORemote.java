package com.wineshop.dao;

import javax.ejb.Remote;

import com.wineshop.dto.ClientOrderDTO;

@Remote
public interface ClientOrderDAORemote extends GenericDAO<ClientOrderDTO> {

}
