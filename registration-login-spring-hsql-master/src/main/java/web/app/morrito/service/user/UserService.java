package web.app.morrito.service.user;

import web.app.morrito.model.user.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
