package web.app.morrito.service.configuration;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
