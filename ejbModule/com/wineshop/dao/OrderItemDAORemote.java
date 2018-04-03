package com.wineshop.dao;

import javax.ejb.Remote;

import com.wineshop.dto.OrderItemDTO;

@Remote
public interface OrderItemDAORemote extends GenericDAO<OrderItemDTO> {

}
