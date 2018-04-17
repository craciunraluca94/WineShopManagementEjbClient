package com.wineshop.dao;

import javax.ejb.Remote;

import com.wineshop.dto.ChangePasswordDTO;
import com.wineshop.dto.LoginDTO;
import com.wineshop.dto.PlatformUserDTO;
import com.wineshop.exceptions.ChangePasswordException;
import com.wineshop.exceptions.LoginException;

@Remote
public interface PlatformUserDAORemote extends GenericDAO<PlatformUserDTO> {
	Boolean updatePassword(ChangePasswordDTO changePasswordDTO) throws ChangePasswordException;

	PlatformUserDTO login(LoginDTO loginDTO) throws LoginException;
}
