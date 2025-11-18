package org.jsp.eBankingProject.service;

import org.jsp.eBankingProject.exception.DataNotFoundException;
import org.jsp.eBankingProject.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.jsp.eBankingProject.entity.User;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {

	private final UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email);
		if (user == null) {
			throw new DataNotFoundException("Invalid Email");
		} else {
			return new UserDetailsImpl(user);
		}
	}

}