package web.app.morrito.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import web.app.morrito.model.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
