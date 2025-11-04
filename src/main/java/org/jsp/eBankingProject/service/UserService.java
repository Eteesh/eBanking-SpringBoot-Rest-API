package org.jsp.eBankingProject.service;
import org.jsp.eBankingProject.dto.UserDto;
import org.jsp.eBankingProject.entity.TempUser;
import org.springframework.http.ResponseEntity;

public interface UserService {

	ResponseEntity<TempUser> register(UserDto dto);

	ResponseEntity<TempUser> fetch(String email);

}