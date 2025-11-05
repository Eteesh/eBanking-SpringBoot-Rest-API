package org.jsp.eBankingProject.service;

import org.jsp.eBankingProject.dto.ResponseDto;
import org.jsp.eBankingProject.dto.UserDto;
import org.springframework.http.ResponseEntity;

public interface UserService {
	ResponseEntity<ResponseDto> register(UserDto dto);

	String check(String email);

}