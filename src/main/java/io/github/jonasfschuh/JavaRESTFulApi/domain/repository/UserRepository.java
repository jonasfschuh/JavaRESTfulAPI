package io.github.jonasfschuh.JavaRESTFulApi.domain.repository;

import io.github.jonasfschuh.JavaRESTFulApi.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
    boolean existsByCardNumber(String number);

}
