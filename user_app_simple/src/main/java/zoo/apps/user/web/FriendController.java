package zoo.apps.user.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zoo.apps.user.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("friends")
@Slf4j
public class FriendController {

    @GetMapping
    public List<User> getFriends(HttpServletRequest request) {
        log.info("header:{}", request.getHeader("Foo"));
        List<User> users =  new ArrayList<>();

        User hofoo = new User();
        hofoo.setName("hofoo");
        hofoo.setAge(34);
        users.add(hofoo);

        User zhouzh = new User();
        zhouzh.setName("周志豪");
        zhouzh.setAge(25);
        users.add(zhouzh);

        return users;
    }
}
