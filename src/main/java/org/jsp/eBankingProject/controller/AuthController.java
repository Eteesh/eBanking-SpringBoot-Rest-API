package org.jsp.eBankingProject.controller;

import org.jsp.eBankingProject.dto.UserDto;
import org.jsp.eBankingProject.entity.TempUser;
import org.jsp.eBankingProject.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

	private final UserService userService;

	@PostMapping("/register")
	public ResponseEntity<TempUser> register(@RequestBody @Valid UserDto dto) {
		return userService.register(dto);
	}

	@GetMapping("/verify/{email}")
	public ResponseEntity<TempUser> fetch(@PathVariable String email) {
		return userService.fetch(email);
	}
}