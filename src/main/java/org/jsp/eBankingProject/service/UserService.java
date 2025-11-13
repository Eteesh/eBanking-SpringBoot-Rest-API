package org.jsp.eBankingProject.service;
import org.jsp.eBankingProject.dto.LoginDto;
import org.jsp.eBankingProject.dto.OtpDto;
import org.jsp.eBankingProject.dto.ResetPasswordDto;
import org.jsp.eBankingProject.dto.ResponseDto;
import org.jsp.eBankingProject.dto.UserDto;
import org.springframework.http.ResponseEntity;
public interface UserService {
	ResponseEntity<ResponseDto> register(UserDto dto);


	ResponseEntity<ResponseDto> verifyOtp(OtpDto dto);
	ResponseEntity<ResponseDto> resendOtp(String email);

	ResponseEntity<ResponseDto> forgotPassword(String email);

	ResponseEntity<ResponseDto> resetPassword(ResetPasswordDto dto);
	ResponseEntity<ResponseDto> login(LoginDto dto);
}