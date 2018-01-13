package zoo.apps.auth.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zoo.apps.user.model.User;

@RestController
@RequestMapping("auth")
public class AuthController {

    @PostMapping
    public User getUser(String name, String password) {
        User user = new User();
        user.setName("admin");
        user.setPassword("111111");
        user.setAlias("管理员");
        return user;
    }
}
