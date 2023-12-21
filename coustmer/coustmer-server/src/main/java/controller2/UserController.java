package controller2;

import api.Impl.UserApiServiceImpl;
import com.cqie.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserApiServiceImpl userApiService;

    @GetMapping("login/{username}")
    public Result login(@PathVariable("username") String username) {
        return userApiService.login(username);
    }

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }
}
