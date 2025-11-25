package org.jsp.eBankingProject.mapper;
import org.jsp.eBankingProject.dto.UserDto;
import org.jsp.eBankingProject.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = org.mapstruct.InjectionStrategy.CONSTRUCTOR)

public abstract class UserMapper {
	protected final PasswordEncoder passwordEncoder;

	public UserMapper(PasswordEncoder passwordEncoder) {
	    this.passwordEncoder = passwordEncoder;
	}


	@Mapping(target = "password", expression = "java(passwordEncoder.encode(dto.getPassword()))")
	public abstract User toEntity(UserDto dto);

	@Mapping(target = "password",expression = "java(\"***************\")")
	public abstract UserDto toDto(User user);
	
	public abstract List<UserDto> toDtoList(List<User> users);

}