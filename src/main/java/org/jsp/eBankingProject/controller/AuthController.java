package org.jsp.eBankingProject.controller;


import org.jsp.eBankingProject.dto.OtpDto;
import org.jsp.eBankingProject.dto.ResetPasswordDto;
import org.jsp.eBankingProject.dto.ResponseDto;
import org.jsp.eBankingProject.dto.UserDto;
import org.jsp.eBankingProject.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
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
	public ResponseEntity<ResponseDto> register(@RequestBody @Valid UserDto dto) {
		return userService.register(dto);
	}
	@PostMapping("/verify-otp")
	public ResponseEntity<ResponseDto> verfiyOtp(@RequestBody OtpDto dto) {
		return userService.verifyOtp(dto);
	}
	@PatchMapping("/resend-otp/{email}")
	public ResponseEntity<ResponseDto> resendOtp(@PathVariable String email) {
		return userService.resendOtp(email);
	}

	@PatchMapping("/forgot-password/{email}")
	public ResponseEntity<ResponseDto> forgotPassword(@PathVariable String email) {
		return userService.forgotPassword(email);
	}

	@PatchMapping("/reset-password")
	public ResponseEntity<ResponseDto> resetPassword(@RequestBody @Valid ResetPasswordDto dto) {
		return userService.resetPassword(dto);
	}
	

}