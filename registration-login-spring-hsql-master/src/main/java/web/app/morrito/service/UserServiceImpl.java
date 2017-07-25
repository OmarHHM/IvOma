package web.app.morrito.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import web.app.morrito.model.User;
import web.app.morrito.repository.RoleRepository;
import web.app.morrito.repository.UserRepository;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        System.out.println("pass"+user.getPassword());
        System.out.println("use"+user.getRoles());
        
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
    	User user = new User();
    	 user =userRepository.findByUsername(username);
   //     System.out.println("user ifnd"+user.getUsername());
        return user;
    }
}
