package web.app.morrito.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web.app.morrito.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
