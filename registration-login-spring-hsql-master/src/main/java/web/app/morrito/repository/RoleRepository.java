package web.app.morrito.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web.app.morrito.model.Rol;

public interface RoleRepository extends JpaRepository<Rol, Long>{
}
