package web.app.morrito.model.user;

import javax.persistence.*;

import org.directwebremoting.annotations.DataTransferObject;

import java.util.Set;

@Entity
@Table(name = "users")
@DataTransferObject
public class User {
    private Long id;
    private String username;
    private String password;
    private String passwordConfirm;
    private Set<Rol> roles;
    private Long businessBranchId;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Transient
    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }

	public Long getBusinessBranchId() {
		return businessBranchId;
	}

	public void setBusinessBranchId(Long businessBranchId) {
		this.businessBranchId = businessBranchId;
	}
    
    
}
