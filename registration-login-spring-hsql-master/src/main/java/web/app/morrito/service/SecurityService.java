package web.app.morrito.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
