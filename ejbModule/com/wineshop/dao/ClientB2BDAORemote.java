package com.wineshop.dao;

import javax.ejb.Remote;

import com.wineshop.dto.ClientB2BDTO;

@Remote
public interface ClientB2BDAORemote extends GenericDAO<ClientB2BDTO> {
}
