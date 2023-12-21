package api.Impl;

import com.cqie.api.UserApi;
import com.cqie.pojo.Result;
import org.springframework.stereotype.Service;

@Service
public class UserApiServiceImpl implements UserApi {
    @Override
    public Result login(String username) {
        if(username.equals("admin")){
            return Result.success("登录成功");
        }
        return Result.success();
    }
}
