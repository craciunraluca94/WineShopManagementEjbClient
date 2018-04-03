package com.wineshop.dao;

import javax.ejb.Remote;

import com.wineshop.dto.WineDTO;

@Remote
public interface WineDAORemote extends GenericDAO<WineDTO> {
}
