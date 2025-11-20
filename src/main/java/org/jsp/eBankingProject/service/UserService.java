package org.jsp.eBankingProject.service;
import java.security.Principal;

import org.jsp.eBankingProject.dto.LoginDto;
import org.jsp.eBankingProject.dto.OtpDto;
import org.jsp.eBankingProject.dto.ResetPasswordDto;
import org.jsp.eBankingProject.dto.ResponseDto;
import org.jsp.eBankingProject.dto.SavingAccountDto;
import org.jsp.eBankingProject.dto.UserDto;
import org.springframework.http.ResponseEntity;

import java.util.Map;
public interface UserService {
	ResponseEntity<ResponseDto> register(UserDto dto);


	ResponseEntity<ResponseDto> verifyOtp(OtpDto dto);
	ResponseEntity<ResponseDto> resendOtp(String email);

	ResponseEntity<ResponseDto> forgotPassword(String email);

	ResponseEntity<ResponseDto> resetPassword(ResetPasswordDto dto);
	ResponseEntity<ResponseDto> login(LoginDto dto);
	

	ResponseEntity<ResponseDto> viewSavingsAccount(Principal principal);

	ResponseEntity<ResponseDto> createSavingsAccount(Principal principal, SavingAccountDto accountDto);

	ResponseEntity<ResponseDto> checkBalance(Principal prinicpal);

	ResponseEntity<ResponseDto> deposit(Principal principal, Map<String, Double> map);

	ResponseEntity<ResponseDto> confirmPayment(Double amount, String razorpay_payment_id, Principal principal);

}