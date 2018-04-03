package com.wineshop.dao;

import javax.ejb.Remote;
import javax.swing.text.ChangedCharSetException;

import com.wineshop.dto.ChangePasswordDTO;
import com.wineshop.dto.PlatformUserDTO;
import com.wineshop.exceptions.ChangePasswordException;

@Remote
public interface PlatformUserDAORemote extends GenericDAO<PlatformUserDTO> {
	Boolean updatePassword(ChangePasswordDTO changePasswordDTO) throws ChangePasswordException;
}
