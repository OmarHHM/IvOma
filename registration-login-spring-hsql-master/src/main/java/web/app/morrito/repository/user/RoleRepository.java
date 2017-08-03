package web.app.morrito.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import web.app.morrito.model.user.Rol;

public interface RoleRepository extends JpaRepository<Rol, Long>{
}
