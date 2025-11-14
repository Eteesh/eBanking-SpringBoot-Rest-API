package org.jsp.eBankingProject.repository;
import org.jsp.eBankingProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsByEmailOrMobile(String email, String mobile);

	boolean existsByEmail(String email);

	User findByEmail(String email);
	
	Optional<User> findByBankAccount_accountNumber(Long accountNumber);
}